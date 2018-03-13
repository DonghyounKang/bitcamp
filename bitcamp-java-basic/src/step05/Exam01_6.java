//흐름 제어문 - if ~ else if ~ else if ~ else
package step05;

import java.util.Scanner;

public class Exam01_6 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("나이 입력: ");
        int age =  keyScan.nextInt();

        if(age < 8)
            System.out.println("아동");
        else 
            if(age < 14)
                System.out.println("어린이");
            else 
                if(age <19)
                    System.out.println("청소년");
                else 
                    if(age < 65)
                        System.out.println("성인");
                    else
                        System.out.println("노인");
//if ~ else 정렬

        if(age < 8)
            System.out.println("아동");
        else if(age < 14)
            System.out.println("어린이");
        else if(age <19)
            System.out.println("청소년");
        else if(age < 65)
            System.out.println("성인");
        else
            System.out.println("노인");                
    }
}