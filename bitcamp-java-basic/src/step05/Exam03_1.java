//흐름 제어문 - 반복문 while
package step05;

import java.util.Scanner;

public class Exam03_1 {
    public static void main(String[] args) {

        int count = 0;

        //while(조건문) 실행문
        // 조건이 참일동안 문장을 계속 실행한다.
        while (count < 5)
            System.out.println(count++);

        System.out.println("---------------------");
        //while(조건문){실행문}
        //여러 문장을 반복실행하려면 { }으로 묶기
        count = 0;
        while(count < 5) {
            System.out.println(count);
            count++;
        }
    }
}
