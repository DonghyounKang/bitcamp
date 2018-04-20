//stateful 방식
package step23_Network.ex04;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//stateful 방식
// => 한번 연결한 후 여러번 요청/응답하는 방식
// => 단점:
//        한번 연결하면 클라이언트가 연결을 끊을 때까지 계속 유지
//        클라이언트가 작업을 요청하지 않더라도 계속 연결정보를 유지해야 하기 때문에
//        메모리를 많이 차지하고 동시에 많은 클라이언트의 요청을 처리하기 힘들다
// => 장점:
//        한번 서버에 연결되면 클라이언트가 연결을 끊을 때까지 유지되기 때문에 
//        작업을 처리하는 속도가 빠르다
//        작업처리하는데 걸리는 시간 = 데이터 전송 시간 + 작업처리시간 + 데이터 수신시간
//        즉 작업을 요청할 때마다 연결할 필요가 없기 때문에 연결하는데 시간이 소요되지 않는다.
// => 대표적인 예 :
//    게임 서버 연결 - 서버에 한번 연결되면 게임을 마칠때까지 데이터를 주고 받는다.
//    화상통신 - 한번 연결하면 연결을 끊을 때까지 데이터를 주고받는다.
//    채팅서버 - 전용 클라이언트를 이용한 채팅
//    FTP - 파일 전송 프로그램
//    telnet - 원격제어프로그램
//    
public class CalcServer2 {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행중..");
        ServerSocket ss = new ServerSocket(8888);
        
        while(true) { // 클라이언트에 대한 요청 처리 반복
            Socket socket = ss.accept();
            try {
                processRequest(socket);
            } catch (Exception e) {
                System.out.println("클라이언트 요청 처리 중 오류발생");
                System.out.println("다음 클라이언트 요청 처리");
            }
            
        }
        //ss.close();
    }
    
    //입출력 예외 두가지 방법: 내부 처리 or 던지기
    static void processRequest(Socket socket) throws Exception {
        try (
                Socket socket2 = socket;
                DataInputStream in = new DataInputStream(socket.getInputStream());
                PrintStream out = new PrintStream(socket.getOutputStream());
                ) {
            
            //해결방법 1: boolean 값을 설정하여 아래 while문 나갈수 있도록한다.
            l1: while (true) { // 클라이언트의 계산결과 반복
                int a = in.readInt();
                String op = in.readUTF();
                int b = in.readInt();
                int result = 0;
                
                switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/": result = a / b; break;
                case"quit" : break l1; //해결방법 2: 라벨 붙이기
                }
                
    // 해결방법 3: 외부에서 종료
    //            if(op.equals("quit"))
    //                break;
                out.printf("%d %s %d = %d\n", a, op, b, result);
            }    
            out.println("quit");
            
        }
    }
}
