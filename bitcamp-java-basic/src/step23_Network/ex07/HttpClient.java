//웹서버 Http Client 만들기
package step23_Network.ex07;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//Http 요청protocol
//----------------------------
//GET[자원 주소] HTTP/1.1(CRLF)
//Server : [서버주소] (CRLF)
//(CRLF)
//----------------------------

// => 클라이언트 서버 간의 통신 규칙
// => 데이터를 주고받는 규칙

public class HttpClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.mediatoday.co.kr", 80);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        //HTTP 요청프로토콜에 따라 서버에 데이터 전송
        out.println("GET /?mod=news&act=articleView&idxno=142181 HTTP/1.1");
        out.println("Host: www.mediatoday.co.kr");
        out.println();
        
        //HTTP응답프로토콜에 따라 서버가 보낸 데이터르 수신
        while(true) {
            try {
                System.out.println(in.nextLine());
                
            } catch (Exception e) {
                break;
            }
        }
        
        out.close();
        in.close();
        socket.close();
        
    }
}
