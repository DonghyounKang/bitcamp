//stateless와 stateful의 비교
package step23_Network.ex05;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

//stateful방식의 특징
// => 클라이언트와 계속 연결을 유지하기 때문에 작업 결과를 계속 서버에 유지할 수 있다.
public class StatefulServer {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중.....");
        //합계를 계사나하는 서버를 만들어보자
        ServerSocket ss = new ServerSocket(8888);
        
        while(true) {
            Socket socket = ss.accept();
            System.out.println("클라이언트 연결 승인 및 작업 처리 중...");
            processRequest(socket);
            
        }
    }

    private static void processRequest(Socket socket) throws Exception{
        HashMap<Integer, String> users = new HashMap<Integer, String>();
        try (
            Socket socket2 = socket;
            PrintStream out = new PrintStream(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream());
            ) {
            //클라이언트와의 연결을 끊을 때까지 계속 계산결과를 서버에 유지한다.
            // => "stateful"방식이라 부른다.
            
            int sum = 0;
            while(true) {
                String str = in.nextLine();
                if(str.equals(""))
                    break;
                sum += Integer.parseInt(str);
            }
            
            out.println("결과 = " + sum);
        }
        //stateful은 한번 연결되면 연결을 끊을 때까지 데이터를 주고 받는다.
        // 그래서 각 클라이언트의 작업결과(상태값)를 유지할 수 있다.
        // 단 현재 버전의 문제는 클라이언트가 연결을 끊을 때까지 다른 클라이언트의 요청을 처리하지 못한다는 
        // 문제가 있다.
        // 해결책?
        // 멀티 스레드를 이용하여 동시에 여러 클라이언트의 요청을 처리하면 된다.
        
    }
}