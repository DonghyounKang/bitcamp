//overriding - 오버라이딩 실수의 예
package step11.ex11;

public class Exam04 {

    public static void main(String[] args) {
        B2 obj = new B2();
        
        //B2에서 B의 m()메서드를 오버라이딩(재정의) 했다고 착각하고
        //메서드를 사용할 수 있다.
        // => but B2 클래스의 m()의 파라미터는 float이다.
        //    즉 오버라이딩이 아닌 오버로딩을 한 것이 된다.
        
        obj.m(100); 
        //해결책?
        //=> 개발자들의 잦은 실수로 자바에서는 오버라이딩 여부를 검사하는 특별한 문법 추가
        //Exam05.java >>
        
    }
}
