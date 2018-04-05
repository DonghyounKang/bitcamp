//URL(Uniform Resource Locator) - 부가 데이터 지정 query String
package step16.ex02_URI;

import java.net.URL;

public class Exam04 {

    public static void main(String[] args) throws Exception {
        ///WWW(웹) 상에서 자원의 위치를 표현하는 방법
        URL url = new URL("http://www.bitcamp.co.kr/a/b/index.html?name=hong&age=20&tel=111-1111");
        //?를 통해 부가적으로 서버에 데이터를 보내는 것 
        
        //URL분석
        System.out.printf("프로토콜 : %s\n", url.getProtocol());
        System.out.printf("서버주소 : %s\n", url.getHost());
        System.out.printf("port번호 : %d\n", url.getPort());
        System.out.printf("자원 경로 : %s\n", url.getPath());
        System.out.printf("queryString : %s\n", url.getQuery());
        
        //웹브라우저에서는 포트번호를 생략하면 80으로 간주한다.
        
        
        
    }

}
