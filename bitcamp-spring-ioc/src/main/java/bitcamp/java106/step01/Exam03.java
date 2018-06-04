//SpringIOCContainer사용
package bitcamp.java106.step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exam03 {

    public static void main(String[] args) {
        //Spring iocContainer는 ApplicationContext를 구현한다.
        ApplicationContext iocContainer = null;
        
        //ApplicationContext 구현체 종류
        // 1) XML파일에 작성된 설정정보를 읽어 처리하는 iocContainer
        // => ClassPathXmlApplicationContext(자바 classpath에서 xml파일을 찾는다)
        // => FileSystemXmlApplicationContext(OS fileSystem에서 xml파일을 찾는다)
        
        // 2) 클래스 안에 작성된 Annotaion을 읽어서 처리하는 iocContainer
        // => AnnotationConfigApplicationContext
    
        
        //AnnotationConfigApplicationContext 사용
        // => 스프링 설정정보를 담고있는 클래스를 넘긴다.
        iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
        
        //IOCContainer에 보관된 객체를 꺼내기
        Car car = (Car)iocContainer.getBean("c1");
        
        System.out.println(car);
    }

}
