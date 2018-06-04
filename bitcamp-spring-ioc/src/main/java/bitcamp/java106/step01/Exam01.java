//SpringIOCContainer사용
package bitcamp.java106.step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

    public static void main(String[] args) {
        //Spring iocContainer는 ApplicationContext를 구현한다.
        ApplicationContext iocContainer = null;
        
        //ApplicationContext 구현체 종류
        // 1) XML파일에 작성된 설정정보를 읽어 처리하는 iocContainer
        // => ClassPathXmlApplicationContext(자바 classpath에서 xml파일을 찾는다)
        // => FileSystemXmlApplicationContext(OS fileSystem에서 xml파일을 찾는다)
        
        // 2) 클래스 안에 작성된 Annotaion을 읽어서 처리하는 iocContainer
        // => AnnotationCnofigApplicationContext
    
        
        //ClassPathXmlApplicationContext 사용
        // => 자바 classpath에서 해당경로의 XML파일을 찾는다
        // => 물론 XML파일은 스프링 규칙에 따라 태그가 작성되어있다.
        // => 설정파일에 지정된 객체를 자동으로 생성하고 의존객체 주입하여 보관한다.
        iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step01/application-context.xml");
        
        //IOCContainer에 보관된 객체를 꺼내기
        Car car = (Car)iocContainer.getBean("c1");
        
        System.out.println(car);
        
        // 존재하지 안는 자바 객체를 꺼내려한다면 예외발생
        car = (Car)iocContainer.getBean("c2");
    }

}
