//예외 처리 후 마무리 작업 - finally block과 resource 해제
package step21_Exceptions.ex03;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exam06_1 {
    
    static void m() {
        //키보드 입력을 읽기 위한 도구 준비
        Scanner keyScan = new Scanner(System.in);
        
        //Scanner 객체를 사용하여 키보드 입력을 받는다.
        
        //예외가 발생한다면?
        System.out.print("입력> ");
        int value = keyScan.nextInt();
        System.out.println(value * value);
    
        //프로그램을 즉시 종료하는 경우라면 
        //Scanner를 다 사용하고 난 다음에 굳이 Scanner에 연결된 키보드와 연결을 끊을 필요는 없다.
        // JVM종료시 OS는 JVM이 사용한 모든 resource를 자동 회수하기 때문에 굳이 close()를 호출하지 않음
        
        //하지만 24/7 실행되는 시스템이라면
        //키보드 입력을 사용하지 않는 동안에는 다른 프로그램에서 사용할 수 있도록 
        //Scanner와 연결된 키보드를 풀어줘야 한다.("resource 해제")
        //보통 자원해제 시키는 메서드의 이름이 "close()"이다.
        // 당연히 Scanner 클래스에도 resource를 해제시키는 close()메서드가 존재한다.
        // 그런데 우리는 지금까지 Scanner를 사용하면서 close()를 호출하지 않았다.
        // 왜? -> 프로그램이 바로 종료되었기 때문
        
        // but 우리가 java로 프로그램을 짤 영역은 서버 쪽이다. 즉 24/7 실행되는 서버쪽 프로그램을 개발하는 것이기 때문에
        // 항상 resource 사용 후 해제 시키는 것을 습관화 해야 한다.
        keyScan.close();
        
        //ok입력시 예외 오류
        // 문제는 close()를 호출하기 전에 예외가 발생한다면
        //제대로 resource를 해제시키지 못한다는것
        //이것을 해결하기위해서 finally블록을 사용하는 것이다. 
    }
    
    public static void main(String[] args) {
        m();
    }
}
