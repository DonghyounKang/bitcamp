//의존 객체 주입 자동화하기 - 의존객체가 여러 개인 경우 @Qualifier 에노테이션
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam08 {

    public static void main(String[] args) {
        //@Qualifier annotation을 추가할 경우
        // 같은 타입의 객체가 여러개 있다 하더라도
        // 그중에 지정된 이름을 갖는 객체가 주입된다.
        // 그러나 막상 실행을 하면 engine객체가 여러개 있다고 실행 오류 발생
        //이유는?
        // => @Qualifier annotation을 수행할 BeanPostProcessor가 없기 때문
        // 해결책?
        // => @Qualifier annotation을 처리할 BeanPostProcessor 등록
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-08.xml");
        
        //Car객체를 꺼내 Engine객체가 주입되었는지 확인
        System.out.println(iocContainer.getBean("c1"));
        System.out.println("-----------");
        BeanUtils.printBeanNames(iocContainer);
    }

}

//https://kinbiko.com/java/dependency-injection-patterns/ 참고


