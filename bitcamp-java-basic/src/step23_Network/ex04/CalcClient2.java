//stateful 방식
package step23_Network.ex04;

import java.io.DataOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//stateful 방식
//=> 한번 연결한 후 여러번 요청/응답하는 방식
//=> 단점:
//     한번 연결하면 클라이언트가 연결을 끊을 때까지 계속 유지
//     클라이언트가 작업을 요청하지 않더라도 계속 연결정보를 유지해야 하기 때문에
//     메모리를 많이 차지하고 동시에 많은 클라이언트의 요청을 처리하기 힘들다
//=> 장점:
//     한번 서버에 연결되면 클라이언트가 연결을 끊을 때까지 유지되기 때문에 
//     작업을 처리하는 속도가 빠르다
//     작업처리하는데 걸리는 시간 = 데이터 전송 시간 + 작업처리시간 + 데이터 수신시간
//     즉 작업을 요청할 때마다 연결할 필요가 없기 때문에 연결하는데 시간이 소요되지 않는다.
// => 클라이언트 작업상태를 계속 유지할 수 있기 때문에 stateful방식이라 부른다.
//=> 대표적인 예 :
// 게임 서버 연결 - 서버에 한번 연결되면 게임을 마칠때까지 데이터를 주고 받는다.
// 화상통신 - 한번 연결하면 연결을 끊을 때까지 데이터를 주고받는다.
// 채팅서버 - 전용 클라이언트를 이용한 채팅
// FTP - 파일 전송 프로그램
// telnet - 원격제어프로그램
// 
public class CalcClient2 {
    public static void main(String[] args) throws Exception {
        
        Scanner keyScan = new Scanner(System.in);
        
        System.out.println("client 실행");
        Socket socket = new Socket("localhost",8888);
        Scanner in = new Scanner(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        
        while(true) {
            System.out.print("값1? ");
            out.writeInt(Integer.parseInt(keyScan.nextLine()));
            
            System.out.print("연산자? ");
            out.writeUTF(keyScan.nextLine());
            
            System.out.print("값2? ");
            out.writeInt(Integer.parseInt(keyScan.nextLine()));
            
            String str = in.nextLine();
            System.out.println(str);
            
            if (str.equals("quit"))
                break;
        }
        
        in.close();
        out.close();
        socket.close();
        
    }
}
