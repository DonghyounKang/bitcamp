//AOP(Aspect-Oriented Programming) 필터 적용 후
package bitcamp.java106.step13_AOP.ex2;


import org.springframework.context.support.ClassPathXmlApplicationContext;

//AOP
// => 기존의 코드는 손대지 않고 특정 기능을 삽입하는 기술
//    보통 메서드 호출 앞 뒤로 코드를 삽입할 수 있다. 
// => 일종의 필터를 추가하는 기술
//
// AOP 적용 조건
// 1) AOP 관련 의존라이브러리 가져오기
//  - mvnrepository.com -> "apectj weaver"로 검색
//  - build.gradle 등록
//  - gradle eclipse
//  - project refresh
// 2) 필터 클래스 정의
// 3) XML 혹은 자바 코드로 필터를 설정한다.
// 
// AOP 용어
// - Advice     : 메서드(Join Point) 호출 앞뒤에 삽입될 코드(필터 객체)
//                  MyAdvice
// - Join Point : Advice가 들어갈 메서드
//                  m() 메서드
// - Pointcut   : Advice를 삽입할 위치 정보
//                  execution(* bitcamp.java106.step13_AOP.ex2.*.*(..))
// - Target Object : Adivce를 삽입할 대상객체
//                  X, Y, Z 클래스
// - Aspect     : 어느 Pointcut에 어떤 Advice를 삽입할 것인지 가리키는 정보
//                  설정 정보
// 작업 클래스
public class Exam02 {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext("bitcamp/java106/step13_AOP/ex2/application-Context-02.xml");

        String[] names =iocContainer.getBeanDefinitionNames();
        System.out.println("---------------------------------------------------------------");
        for(String name : names) {
            System.out.println(iocContainer.getBean(name).getClass().getName());
        }
        
        System.out.println("---------------------------------------------------------------");
        
        Caller caller = (Caller) iocContainer.getBean(Caller.class);
        caller.test();
        
        
    }

}
