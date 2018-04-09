//예외처리 문법을 적용하기 전 - 오류일때 리턴하는 값을 희귀한 값으로 지정한다.
package step21_Exceptions.ex01;

public class Calculator2 {
    public static int compute(String op, int a, int b) {
        switch(op ) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "%": return a % b;
        default: 
            //일반적인 계산으로 나올 수 있는 -1 과 같은 흔한 값 대신에 다음과 같이 
            //일반적인 계산으로 나올 수 없는 값을 지정한다.
            return -1212121212;
        }
    }
}
