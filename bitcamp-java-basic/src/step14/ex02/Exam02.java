//인터페이스의 모든 메서드는 public이다.
//인터페이스를 구현하는 클래스는 public보다 메서드의 공개 범위를 좁게 할 수 없다.
package step14.ex02;
public class Exam02 implements A3{

    //protected void m1() { } // 컴파일 오류
    //private void m1() { } // 컴파일 오류
    //void m1() {} // 컴파일 오류
    
    //반드시 public 이어야한다.
    public void m1() { }
    public void m2() { }
    
}
