//의존 객체 주입 자동화하기 -beanPostProceesor 동작원리
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam03 {

    public static void main(String[] args) {
        //@Autowired annotation을 처리할 객체를 등록해야만
        //의존객체가 자동으로 주입
        // 동작원리
        //1) spring ioc container는 객체를 만든다.
        //2) 프로퍼티값을 설정한다.
        //3) 객체 생성 후 @Autowired annotation을 처리한다.
        //   => 단 @Autowired annotation을 읽고 처리할 객체가 등록되어 있어야한다.
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-03.xml");
        
        //Car객체를 꺼내 Engine객체가 주입되었는지 확인
        System.out.println(iocContainer.getBean("c1"));
    }

}

/*실행순서
MyBeanPostProcessor()
Car2() 호출
postProcessBeforeInitialization()
postProcessAfterInitialization()
    => Bean을 생성한 이후에 항상 호출
Engine()
postProcessBeforeInitialization()
postProcessAfterInitialization()
    => Bean을 생성한 이후에 항상 호출
Car [model=티코, maker=비트자동차, cc=890, auto=true, createdDate=null, engine=null]


 */

