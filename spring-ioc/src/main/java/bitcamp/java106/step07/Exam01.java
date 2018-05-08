//property editor - 기본 프로퍼티 에디터
package bitcamp.java106.step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step07/application-context-01.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        // java.lang.IllegalStateException: Cannot convert value of type 'java.lang.String' 
        // to required type 'java.sql.Date' for property 'createdDate':
        // no matching editors or conversion strategy found
        // => Spring iocContainer에 String을 Date로 바꾸는 변환기가 설치되어 있지 않다.
        
        //- spring built-in property editor(conversion)
        // => primitive type 변환기는 기본 내장
        //    String 을 byte short int long float double boolean char로 자동 변환 가능
        

    }

}
