//객체 주입시 객체생성 순서
package bitcamp.java106.step04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam03 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = null;
        iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step04/application-context-03.xml");

    }
}
