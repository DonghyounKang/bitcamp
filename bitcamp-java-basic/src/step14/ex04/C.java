// 인터페이스 다중 상속
package step14.ex04;

//인터페이스에서는 다중상속이 가능하다.
//왜?
//아직 구현 이전의 메서드이기 때문에
//어떤 인터페이스의 메서드를 상속 받더라도 똑같다. 

public interface C extends A, B {
    void m3();
    
    
}