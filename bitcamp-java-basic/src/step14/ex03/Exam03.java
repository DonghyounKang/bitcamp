//다중 인터페이스 구현 II
package step14.ex03;

//한 클래스는 여러개의 규칙(인터페이스)를 이행할 수 있다.
//규칙들 중 메서드가 겹치는 경우 - 상관없다

//A{m1()}, B{m2()}, C{m3()}, D{m2(), m4()}
//B인터페이스 입장에서도 Exam03은 m2()메서드를 만든 것이고
//D인터페이스 입장에서도 Exam03은 m2()메서드를 만든 것이기 때문에 상관없다.
//어차피 구현된 메서드가 아니기 때문이다.
public class Exam03 implements B, C, D {
    
    public void m1() { } //B인터페이스의 수퍼 인터페이스(A인터페이스) 구현
    
    public void m2() { } //B인터페이스 & D인터페이스 구현
    
    public void m3() { } // C의 인터페이스 구현
    
    public void m4() {} //D의 인터페이스
    
    
}
