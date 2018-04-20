//HTTP protocol 요청을 처리할 서버
package bitcamp.java106.pms;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;

public class HTTPServer {
    int port;
    ApplicationContainer applicationContainer;

    public HTTPServer(int port, ApplicationContainer applicationContainer) {
        this.port = port;
        this.applicationContainer = applicationContainer;
    }
    
    //AppServer로부터 ...
    public void execute() throws Exception {
        ServerSocket serverSocket = new ServerSocket(this.port);
        System.out.println("서버 실행중...");
        
        while (true) {
            Socket socket = serverSocket.accept();
            processRequest(socket);
        }
    }

    private void processRequest(Socket socket) {

        PrintWriter out = null;
        Scanner in = null;

        try {
            out = new PrintWriter(socket.getOutputStream());//소켓 입출력스트림 준비
            in = new Scanner(socket.getInputStream());

            //http프로토콜에서 요청 정보를 읽는다.
            boolean firstLine = true;
            String requestURI = null;

            while (true) {
                String line = in.nextLine();
                if(line.equals("")) // 빈문자열이 나올때까지 계속 읽는다.
                    break;

                if(!firstLine)
                    continue;
                
                // http요청 프로토콜에서 첫번째 줄에 있는 요청 URI정보를 추출
                requestURI = line.split(" ")[1];
                firstLine = false;
            } 

            //AppContainer에게 실행을 위임한다.
            String result = applicationContainer.execute(requestURI);

            //http프로토콜에 따라 응답한다.
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/plain;charset=UTF-8");
            out.println();
            out.println(result);

        } catch (Exception e) {
            out.println("서버 오류!");
            e.printStackTrace(out);// 서버오류 표시후 오류 정보 함께 출력
            out.println();
        } finally {
            out.close();
            in.close();
            try {socket.close();} catch (Exception e) {}
        }
    }

}
