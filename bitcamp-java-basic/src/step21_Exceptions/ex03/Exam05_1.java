//예외 처리 후 마무리 작업 - finally block
package step21_Exceptions.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam05_1 {

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
    
    public static void main(String[] args) {
        try {
            m(3);
            System.out.println("try ");// 예외가 발생한 순간 실행하지 않고 catch문으로 넘어간다.
        } catch (RuntimeException | IOException | SQLException e ) {
            System.out.println("catch1");
        } catch (Exception e) {
            System.out.println("catch2");
        } finally {
            //정상적으로 실행 or 예외가 발생하여 catch블럭을 실행하던 
            //finally block은 무조건 실행한다.
            // 즉 try ~ catch블록을 나가기 전에 반드시 실행한다.
            System.out.println("finally");
        }
    }
}
