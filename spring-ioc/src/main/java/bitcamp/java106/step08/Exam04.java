//의존 객체 주입 자동화하기 - 인스턴스 변수에 @Autowired 붙이기
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam04 {

    public static void main(String[] args) {
        //@Autowired annotation을 인스턴스 변수에 붙여도 된다.
        // => 의존객체를 직접 변수에 주입
        // => 셋터를 호출하지 않는다.
        //     즉, setter()가 없어도 된다.
        // => 인스턴스변수에 직접 의존객체를 주입한다는 것은
        //    캡슐화;외부에서 인스턴스 변수에 접근하는것을 막는 기법;를
        //    위배하는 측면이 있기 때문에
        //    이 방식은 객체지향을 파괴하는 방식이라는 비난을 받는다.
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-04.xml");
        
        //Car객체를 꺼내 Engine객체가 주입되었는지 확인
        System.out.println(iocContainer.getBean("c1"));
    }

}

//https://kinbiko.com/java/dependency-injection-patterns/ 참고


