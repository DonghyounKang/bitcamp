//예외 처리 후 마무리 작업 - try -with -resources
package step21_Exceptions.ex03;

import java.io.FileReader;
import java.util.Scanner;

public class Exam06_4 {
    
    static class A {}
    
    static class B implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("B 클래스이 자원을 해제");
            //close() 자동 호출 확인
        }
    }
    
    
    
    static void m() throws Exception{

        try(
                //A클래스는 AutoCloseable 구현체가 아니기 때문에 여기에 선언불가
                //A obj = new A();// 컴파일 오류
                
                B obj2 = new B();// OK!
                ) {
            System.out.println("try 블럭 실행...");
        } 
        //finally에서 B의 close()를 호출하지 않아도 try 블록을 나가는 순간 자동으로 close() 실행
        
    }
    
    public static void main(String[] args) throws Exception {
        m();
    }
}
