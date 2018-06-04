//팩토리 메서드 호출 - FactoryBean 구현체
package bitcamp.java106.step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam05 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = null;
        iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step06/application-context-05.xml");
        
        //이 예제는 Exam04예제와 같다
        // 단, FactoryClass의 이름을 CarFactory3 -> CarFactoryBean으로 변경
        System.out.println(iocContainer.getBean("c1"));

    }

}
