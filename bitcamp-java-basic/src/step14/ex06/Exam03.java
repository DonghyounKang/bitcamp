//인터페이스 간접구현 확인
package step14.ex06;

public class Exam03  {
    public static void main(String[] args) {
        A r1 = new Exam01(); // OK!
        A r2 = new Exam02(); // OK!
        
        
        //부모 클래스가 인터페이스를 구현하면 
        //자식 클래스도 그 인터페이스를 구현한 것이 된다.
        
    }
}
