//예외 처리 후 마무리 작업 - finally block과 resource 해제
package step21_Exceptions.ex03;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exam06_2 {
    
    static void m() {

            Scanner keyScan = null;
        try {
            keyScan = new Scanner(System.in);
        
            System.out.print("입력> ");
            int value = keyScan.nextInt();
            System.out.println(value * value);

        } finally {
            //이렇게 정상적으로 실행되던 예외가 발생하던 상관없이 
            //resource 해제 같은 일은 반드시 실행해야 한다.
            //
            keyScan.close();
            System.out.println("Scanner resource 해제");
        }
        
    }
    
    public static void main(String[] args) {
        m();
    }
}
