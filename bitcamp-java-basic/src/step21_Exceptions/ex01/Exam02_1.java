//예외처리 적용 전 - 예외발생시 시스템 멈춤 문제
package step21_Exceptions.ex01;

import java.util.Scanner;

public class Exam02_1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        while (true) {
        System.out.print("입력>  ");
            String op = keyScan.next();
            if(op.equalsIgnoreCase("quit"))
                break;
            int v1 = keyScan.nextInt();
            int v2 = keyScan.nextInt();
            
            //다음과 같이 일반적인 예외의 경우 리턴값을 검사하여 처리하면 된다.
            //문제는 이 상황에서 0으로 나누는 것처럼 계산할 수없는 예외 상황이 발생하는 경우
            //JVM은 실행을 종료
            // => 0으로 나눌때 처럼 예외가 발생하더라도 JVM을 멈추지 않고 정상저으로 실행되게 만드는 문법이
            //"예외 처리" 이다.
            
            //1)리턴값으로 예외 표시의 한계
            //2)jvm의 예외상황시 멈춤문제 해결
            int result = Calculator2.compute(op, v1, v2);
            if(result == -1212121212) {
                System.out.println("유효하지 않은 연산자");
                
            }else {
                System.out.println(result);
                
            }
        }
        keyScan.close();
        //
    }
}
