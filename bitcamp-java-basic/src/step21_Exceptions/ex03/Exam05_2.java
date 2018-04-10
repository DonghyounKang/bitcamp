//예외 처리 후 마무리 작업 - finally block
package step21_Exceptions.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam05_2 {

    static void m(int i)
            throws Exception, RuntimeException, SQLException, IOException {
        if (i < 0)
            return;
        
        if (i == 0)
            throw new Exception();
        else if(i == 1)
            throw new RuntimeException();
        else if(i == 2)
            throw new SQLException();
        else
            throw new IOException();
    }
    
    static void test1() throws Exception{
        try {
            m(-1);
            
        } finally {
            //try 블록을 나가기전에 무조건 실행해야할 작업이 있다면
            //catch블록이 없어도 finally블록만 사용할 수 있다.
            System.out.println("정상적인 실행시");
        }
    }

    static void test2() throws Exception{
        try {
            m(0);
            
        } finally {
            System.out.println("Exception 예외 발생시");
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        try { test1(); } catch (Exception e ) {}
        try { test2(); } catch (Exception e ) {}
    }
}
