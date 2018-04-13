//예외 처리 후 마무리 작업 - try -with -resources
package step21_Exceptions.ex03;

import java.io.FileReader;
import java.util.Scanner;

public class Exam06_3 {
    
    static void m() throws Exception{
        // 자원 해제 시키는 코드를 매번 작성하기가 귀찮다!
        // => try-with-resources 문법을 사용하면
        //    finally block에서 굳이 close()를 직접호출할 필요가 없다.
        //    자동으로 처리한다.
        // => 단! java.lang.AutoCloseable 구현체에 대해서만 가능하다.
        // => 문법
        //    try(java.lang.AutoClosable 구현체)
        try(
                Scanner keyScan = new Scanner(System.in); // OK
                //FileReader 클래스도 AutoCloseable 구현체이다.
                FileReader in = new FileReader("Hello.java");

                //단 반드시 AutoCloseable 구현체이어야한다.
                //String s = "Hello";// 컴파일 오류
                //if(true) {} // 컴파일 오류  ->변수선언만 올 수 있다.
                
                ) {
            
            System.out.print("입력> ");
            int value = keyScan.nextInt();
            System.out.println(value * value);

        } 
        
    }
    
    public static void main(String[] args) throws Exception {
        m();
    }
}
