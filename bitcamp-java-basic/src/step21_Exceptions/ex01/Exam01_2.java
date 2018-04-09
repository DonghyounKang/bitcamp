//예외처리 적용 전
package step21_Exceptions.ex01;

public class Exam01_2 {
    public static void main(String[] args) {
        
        //유효하지 않은 연산자를 지정할 때
        int result = Calculator.compute("#", 100, 200);
        
        //제대로 계산을 수행했는지 검사하기 위해서 보통 리턴값을 확인한다.
        if(result == -1) {
            System.out.println("유효하지 않은 연산자");
            
        }else {
            System.out.println(result);
            
        }
        
        System.out.println("=-----------------=");
        //리턴값을 검사하는 방식의 문제는 다음과 같이 정상적인 계산 결과도 잘못된 계산으로 취급한다는 점이다.
        result = Calculator.compute("-", 6, 7);
        //위의 연산결과는 정상적인 결과지만 다음과 같이 -1롤 리턴하는 경우 오류로 간주
        //잘못된 결과를 출력한다.
        if(result == -1) {
            System.out.println("유효하지 않은 연산자");
            
        }else {
            System.out.println(result);
            
        }
    }
}
