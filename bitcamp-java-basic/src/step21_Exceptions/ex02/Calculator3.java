//예외처리 문법을 적용하기 후 - 오류일때 예외 정보를 별도로 호출자에게 전달
package step21_Exceptions.ex02;

public class Calculator3 {
    
    public static int compute(String op, int a, int b) {
        switch(op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "%": return a % b;
        default:
            //유효하지 않은 연산자인 경우 throw 명령을 이용하여 호출자에게 오류 상황을 알린다.
            throw new RuntimeException("해당 연산자를 지원하지 않습니다.");
        }
    }
}
