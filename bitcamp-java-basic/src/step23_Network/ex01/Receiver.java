package step23_Network.ex01;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver {
    public static void main(String[] args) throws Exception {
        // 1) 다른 컴퓨터의 연결 요청을 기다린다.
        ServerSocket serverSocket = new ServerSocket(8888);
        
        // 2) 연결하기 위해 대기 중인 여러 대의 컴퓨터 중에서 한개를 연결 허락한다.
        Socket socket = serverSocket.accept();
        
        
        // 3) 소켓 객체를 통해 읽고 쓸 수 있도록 입출력 스트림을 얻는다.
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        // 4) 상대편(서버)이 보낸 문자열을 한줄 보낸다.
        // => 상대편(서버)이 보낸 한줄의 데이터를 보낼 때까지 리턴하지 않는다.
        // => 이런 메서드를 blocking method라 부른다.
        String str = in.nextLine();
        System.out.printf("상대편 < %s\n", str);
        
        // 5) 상대편으로 문자열 을 한줄 보낸다.
        // => 상대편에서 데이터를 읽을 때까지 리턴하지 않는다.
        // => 이런 메서드를 blocking method라 부른다.
        out.println("나는 강동현입니다. 반갑습니다");
        
        //5) 입출력 도구는 사용 후 항상 닫기
        in.close();
        out.close();
        
        //6) 네트워크 연결도 닫기
        socket.close();
        serverSocket.close();
    }
}
