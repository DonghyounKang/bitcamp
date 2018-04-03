//다중 인터페이스 구현 
package step14.ex03;

//한 클래스는 여러개의 규칙(인터페이스)를 이행할 수 있다.
public class Exam02 implements B, C {
    
    public void m2() { } //B인터페이스
    
    public void m1() { } //B인터페이스의 수퍼 인터페이스(A인터페이스) 메서드
    
    public void m3() { } // C의 인터페이스 구현
    
    
}
