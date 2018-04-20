//E
package step23_Network.ex06;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ConnectionOrientedClient {
    public static void main(String[] args) throws Exception {
        System.out.println("client 실행");
        Socket socket = new Socket("localhost",8888);
        System.out.println(" 서버 연결 완료");
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        out.println(args[0]);
        System.out.println("데이터 송신");
        
        String str = in.nextLine();
        System.out.println("데이터 수신");
        System.out.println(str);
        
        in.close();
        out.close();
        socket.close();
        System.out.println("서버 연결 종료");
        
    }
}
