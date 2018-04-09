//예외 처리 - 예외상황을 호출자에게 알려주기: RuntimeException 예외를 던질경우
package step21_Exceptions.ex03;

public class Exam02_2 {

    //RuntimeException은 클래스 이름을 보더라도 Exception의 서브 클래스이다.
    static void m() throws Throwable {
        throw new RuntimeException();//OK
    }
    
    //Exception의 서브클래스임에도 불구하고
    //RuntimeException클래스인경우 메서드 선언부에  예외를 던진다고 선언하지 않아도 된다.
    //왜? 스텔스 모드(비유!)를 지원하기 위해 만든 예외이다.
    static void m2() {
        throw new RuntimeException();//OK, 하지만 이 계열의 클래스는 사용하지 말것
    }
    
    public static void main(String[] args) {
    }
}
