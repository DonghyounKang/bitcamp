//예외처리 적용 후 - 시스템을 멈추지 않고 계속 실행 가능
package step21_Exceptions.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02_2 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        while (true) {
        System.out.print("입력>  ");
            String op = keyScan.next();
            if(op.equalsIgnoreCase("quit"))
                break;
            try {
                int v1 = keyScan.nextInt();
                int v2 = keyScan.nextInt();
            
                int result = Calculator3.compute(op, v1, v2);
                System.out.println(result);
            } catch (InputMismatchException e) {
                System.out.println("입력값이 유효하지 않습니다.");
                keyScan.nextLine();//입력이 잘못되었을경우 남아있는 입력 무시
                
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        keyScan.close();
        //
    }
}
