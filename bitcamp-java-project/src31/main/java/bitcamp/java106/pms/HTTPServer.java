//HTTP protocol 요청을 처리할 서버
package bitcamp.java106.pms;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


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
            //processRequest(socket);
            
            // 클라이언트 요청을 처리할 코드를 기존의 실행흐름에서 분리하여 실행한다.
            //RequestProcessorThread t = new RequestProcessorThread(socket);
            //그리고 바로 새 스레드에 실행을 시작시킨다.
            new RequestProcessorThread(socket).start();
            
            //그리고 기존의 실행은 위의 t Thread와 상관없이 계속 진행한다.
            
        }
    }

    //기존의 실행 흐름과 분리하여 명령을 처리할 클래스(innerClass)
    class RequestProcessorThread extends Thread {
        Socket socket;

        public RequestProcessorThread(Socket socket) {
            this.socket = socket;
        }

        //기존의 실행 흐름에서 분기되어 독립적으로 실행할 코드를 이 메서드에 작성한다.
        @Override
        public void run() {

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
                //http프로토콜에 따라 응답한다.
                out.println("HTTP/1.1 500 Internal Server Error");
                out.println("Content-Type: text/plain;charset=UTF-8");
                out.println();
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

}
