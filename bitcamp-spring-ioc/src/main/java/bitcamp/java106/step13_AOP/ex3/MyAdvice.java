// 특정 메서드 호출 전 후에 실행되는 클래스
package bitcamp.java106.step13_AOP.ex3;

public class MyAdvice {
    
    public void doBefore() {
        System.out.println("MyAdivce.doBefore()");
    }
    
    public void doAfter() {
        System.out.println("MyAdivce.doAfter()");
    }
    
    public void afterReturning() {
        System.out.println("MyAdivce.afterReturning()");
    }
    
    public void afterThrowing() {
        System.out.println("MyAdivce.afterThrowing()");
    }
    
    /*public void doAround() {
        System.out.println("MyAdivce.doAround()");
    }*/

}
