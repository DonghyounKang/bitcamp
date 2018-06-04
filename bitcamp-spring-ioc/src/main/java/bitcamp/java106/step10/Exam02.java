//클래스를 이용한 Spring 설정
package bitcamp.java106.step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam02 {

    public static void main(String[] args) {
        //패키지 명으로 지정하는 경우 해당 패키지의 모든 클래스를 찾아 @Component, @Servic, @Controller @Repository 어노테이션이 붙은 클래스에 대해 객체를 자동생성한다.
        //또한 @Configuration 어노테이션이 붙은 클래스를 찾아 그 클래스에 @Bean 어노테이션이 붙은 메서드를 호출하여 그 리턴값을 저장
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext("bitcamp.java106.step10");// 패키지명을 줄수 있다.

        BeanUtils.printBeanNames(iocContainer);
    }

}
