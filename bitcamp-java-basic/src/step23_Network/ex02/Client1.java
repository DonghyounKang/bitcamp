//Client 만들기
package step23_Network.ex02;

import java.net.Socket;

//Client?
// => 먼저 연결을 요청하는 쪽을 가리킨다.
public class Client1 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("서버에 연결 요청중..");
        //1) server에 연결을 요청한다.
        // => new Socket(서버주소, 포트번호)
        // => 서버주소는 IP 또는 도메인명 모두 가능
        Socket socket = new Socket("localhost", 8888);
        System.out.println("서버에 연결됨");
        
        //자원 해제
        socket.close();
        
        
    }
}
