//서브 인터페이스 구현 - 수퍼 인터페이스의 메서드까지 구현해야 한다.
package step14.ex03;

public class Exam01 implements B {
    
    //B인터페이스(m2())뿐만 아니라 B의 수퍼인터페이스 메서드(m1()) 까지 모두 구현해야 한다.
    public void m1() { }
    
    public void m2() { }
    
}
