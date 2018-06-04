//의존 객체 주입 자동화하기 -XML활용
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-01.xml");

        //Car객체를 꺼내 Engine객체가 주입되었는지 확인
        System.out.println(iocContainer.getBean("c1"));
    }

}
