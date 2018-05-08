//의존 객체 주입 자동화하기 - 생성자를 활용하여 의존객체 주입
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam05 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-05.xml");
        
        //Car객체를 꺼내 Engine객체가 주입되었는지 확인
        System.out.println(iocContainer.getBean("c1"));
    }

}

//https://kinbiko.com/java/dependency-injection-patterns/ 참고


