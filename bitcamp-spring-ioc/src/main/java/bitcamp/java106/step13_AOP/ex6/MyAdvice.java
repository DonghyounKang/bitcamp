// 특정 메서드 호출 전후에 실행되는 클래스
package bitcamp.java106.step13_AOP.ex6;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    
    // 타겟 객체의 메서드를 호출하기 전에 그 메서드가 받을 파라미터를 먼저 받기
    /*
        <aop:before 
            pointcut="execution(* bitcamp.java106.step13.ex4.X.*(..)) and args(a,b)" 
            method="doBefore"/>
    */
    @Before("execution(* bitcamp.java106.step13_AOP.ex5.X.*(..)) and args(a,b)")
    public void doBefore(int a, int b) {
        System.out.printf("MyAdvice.doBefore(): %d, %d\n", a, b);
    }
    
    // 타겟 객체의 메서드를 호출한 후 그 결과를 받기
    // => 설정 파일에 정의된 이름을 사용하여 파라미터를 선언해야 한다.
    /*
    <aop:after-returning 
        pointcut="execution(* bitcamp.java106.step13.ex4.X.*(..))" 
        method="doAfterReturning"
        returning="returnValue"/>
     */
    @AfterReturning(
            pointcut="execution(* bitcamp.java106.step13_AOP.ex5.X.*(..))",
            returning="returnValue")
    public void doAfterReturning(Object returnValue) {
        System.out.printf("MyAdvice.doAfterReturning(): %d\n", returnValue);
    }
    
    // 타겟 객체의 메서드를 호출할 때 예외가 발생했다면 그 예외 객체를 받기
    // => 설정 파일에 정의된 이름을 사용하여 파라미터를 선언해야 한다.
    /*
    <aop:after-throwing 
        pointcut="execution(* bitcamp.java106.step13.ex4.X.*(..))" 
        method="doAfterThrowing"
        throwing="error"/>
     */
    @AfterThrowing(
            pointcut="execution(* bitcamp.java106.step13_AOP.ex5.X.*(..))",
            throwing="error")
    public void doAfterThrowing(Exception error) {
        System.out.printf("MyAdvice.doAfterThrowing(): %s\n", error.getMessage());
    }
}










