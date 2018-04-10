//던지는 예외 받기  - 예외도 다형적변수의 특징을 이용하여 여러 예외를 한 catch문에서 처리할 수 있다.
package step21_Exceptions.ex03;

import java.io.IOException;
import java.sql.SQLException;

public class Exam04_5 {

    static void m(int i)
            throws Exception, RuntimeException, SQLException, IOException {
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
            m(1);
        } catch (Exception e) {
            //Runtime/IO/SQLException모두 
            //Exception의 서브 클래스 이기 때문에 이 블록에서 모두 처리 가능
            //
        } 
    }
}
