//SpringIOCContainer사용
package bitcamp.java106.step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Exam02 {

    public static void main(String[] args) {
        //Spring iocContainer는 ApplicationContext를 구현한다.
        ApplicationContext iocContainer = null;
        
        //ApplicationContext 구현체 종류
        // 1) XML파일에 작성된 설정정보를 읽어 처리하는 iocContainer
        // => ClassPathXmlApplicationContext(자바 classpath에서 xml파일을 찾는다)
        // => FileSystemXmlApplicationContext(OS fileSystem에서 xml파일을 찾는다)
        
        // 2) 클래스 안에 작성된 Annotaion을 읽어서 처리하는 iocContainer
        // => AnnotationCnofigApplicationContext
    
        
        //FileSystemXmlApplicationContext 사용
        // => OS 파일시스템에서 경로의 XML파일을 찾는다
        // => 파일시스템 실제 경로 지정시 나중에 경로가 변경되면 소스코드를 변경해야하는 문제가 발생한다.
        //    그래서 보통 classPathXMLApplicationContext()를 많이 사용한다.
        iocContainer = new FileSystemXmlApplicationContext(
                "file:///Users\\salig\\git\\bitcamp\\spring-ioc\\src\\main\\java\\bitcamp\\java106\\step01\\application-context.xml");
        
        //IOCContainer에 보관된 객체를 꺼내기
        Car car = (Car)iocContainer.getBean("c1");
        
        System.out.println(car);
    }

}
