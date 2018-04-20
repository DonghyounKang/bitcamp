// 상대편의 연결을 요청하기 - client
package step23_Network.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws Exception {
        // 1) 다른 컴퓨터와 네트워크로 연결
        Socket socket = new Socket("192.168.0.14", 8888);
        
        
        // 2) 소켓 객체를 통해 읽고 쓸 수 있도록 입출력 스트림을 얻는다.
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        //3) 상대편(서버)으로 문자열을 한줄 보낸다.
        // => 상대편(서버)에서 데이터를 읽을 때까지 리턴하지 않는다.
        // => 이런 메서드를 blocking method라 부른다.
        out.println("강동현입니다. 반갑습니다.");
        
        //4) 상대편(서버)에서 보낸 문자열로 한줄 읽는다.
        // => 상대편이 한줄 데이터를 보낼 때까지 리턴하지 않는다.
        // => 이런 메서드를 blocking method라 부른다.
        String str = in.nextLine();
        System.out.println(str);
        
        //5) 입출력 도구는 사용 후 항상 닫기
        in.close();
        out.close();
        
        //6) 네트워크 연결도 닫기
        socket.close();
    }
}
