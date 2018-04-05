//URL(Uniform Resource Locator) - 문서 내의 위치지정
package step16.ex02_URI;

import java.net.URL;

public class Exam03 {

    public static void main(String[] args) throws Exception {
        ///WWW(웹) 상에서 자원의 위치를 표현하는 방법
        URL url = new URL("http://www.bitcamp.co.kr/a/b/index.html#footer");
        //#으로 문서내에서 위치를 조정할 수있다.
        
        
        //URL분석
        System.out.printf("프로토콜 : %s\n", url.getProtocol());
        System.out.printf("서버주소 : %s\n", url.getHost());
        System.out.printf("port번호 : %d\n", url.getPort());
        System.out.printf("자원 경로 : %s\n", url.getPath());
        System.out.printf("참조 경로(내부 위치) : %s\n", url.getRef());
        
        //웹브라우저에서는 포트번호를 생략하면 80으로 간주한다.
        
        
        
    }

}
