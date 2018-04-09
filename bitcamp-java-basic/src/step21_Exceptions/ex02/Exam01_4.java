//예외처리 적용 후 - 메서드가 제공한 예외처리 문구를 받는다.
package step21_Exceptions.ex02;

public class Exam01_4 {
    public static void main(String[] args) {
        
        try {
            //예외를 던질수 도 있는 메서드를 호출 할 때는 try블록안에서 호출
            int result = Calculator3.compute("#", 100, 200);
            System.out.println(result);
        } catch (RuntimeException e) {
            //try 블록안에서 메서드를 호출하다가 예외가 발생하면
            //catch블록에서 파라미터로 받는다.
            System.out.println(e.getMessage());
        }
        
        
        try {
            int result = Calculator3.compute("+", -2078654356,866533144);
            System.out.println(result);
            
        } catch (RuntimeException e) {
            //try블록을 실행하는 중에 예외가 발생하지 않은면 catch 블록은 실행하지 않는다.
            System.out.println(e.getMessage());
            
        }
        
        //리턴값을 검사하는 방식보다 더 정확한 예외처리 가능
    }
}
