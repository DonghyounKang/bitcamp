//예외처리 적용 전
package step21_Exceptions.ex01;

public class Exam01_3 {
    public static void main(String[] args) {
        
        int result = Calculator2.compute("#", 100, 200);
        
        //작업실행중 오류 발생시 희귀한 값을 리턴하여 알려줬다.
        if(result == -1212121212) {
            System.out.println("유효하지 않은 연산자");
            
        }else {
            System.out.println(result);
            
        }
        
        System.out.println("=-----------------=");
        //리턴값을 검사하는 방식의 문제는 다음과 같이 정상적인 계산 결과도 잘못된 계산으로 취급한다는 점이다.
        result = Calculator2.compute("-", 6, 7);
        //위의 연산결과는 정상적인 결과지만 다음과 같이 -1롤 리턴하는 경우 오류로 간주
        //잘못된 결과를 출력한다.
        if(result == -1212121212) {
            System.out.println("유효하지 않은 연산자");
            
        }else {
            System.out.println(result);
            
        }
        
        //아무리 희귀한 값을 리턴한다하더라도 결국에는 그 희귀한 값또한 
        //정상값일 수 있다. 이것은 해결불가
        result = Calculator2.compute("+", -2078654356,866533144);
        //위의 연산결과는 정상적인 결과지만 다음과 같이 -1롤 리턴하는 경우 오류로 간주
        //잘못된 결과를 출력한다.
        //다음예는 계산 결과가 -1212121212이다.
        // 그런데도 연산자가 유효하지 않다고 처리.
        // 리턴값을 검사하여 오류여부를 처리하는 것으로는 
        // 이문제를 해결할 수 없다.
        if(result == -1212121212) {
            System.out.println("유효하지 않은 연산자");
            
        }else {
            System.out.println(result);
            
        }
        
        //리턴값으로 작업오류를 알려줄때 그 제약사항을 극복하기 위해 만든 문법이 예외처리 문법이다.
        // => 예외상황 발생시 호출자에게 다른방식의 예외정보를 알려주는것
    }
}
