//URL(Uniform Resource Locator) - UNIX OS의 로컬 파일 경로
package step16.ex02_URI;

import java.net.URL;

public class Exam06 {

    public static void main(String[] args) throws Exception {
        ///로컬 자원의 위치를 URL로 표현하는 방법
        URL url = new URL("file:///home/(username)/test.txt");
        //?를 통해 부가적으로 서버에 데이터를 보내는 것 
        
        //URL분석
        System.out.printf("프로토콜 : %s\n", url.getProtocol());
        System.out.printf("서버주소 : %s\n", url.getHost());
        System.out.printf("port번호 : %d\n", url.getPort());
        System.out.printf("자원 경로 : %s\n", url.getPath());
        
        
        //
        
    }

}
