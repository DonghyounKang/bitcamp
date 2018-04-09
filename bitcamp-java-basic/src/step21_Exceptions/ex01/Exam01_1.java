//예외처리 적용 전 -리턴값을 이용한 오류 알림
package step21_Exceptions.ex01;

public class Exam01_1 {
    public static void main(String[] args) {
        
        //유효한 값을 지정하여 메서드를 호출한 경우
        int result = Calculator.compute("+", 100, 200);
        System.out.println(result);
        
        //
    }
}
