//흐름 제어문 - 중첩된 반복문 탈출
package step05;

import java.util.Scanner;

public class Exam03_3 {
    public static void main(String[] args) {
        
        int x = 2, y = 1;
/*
        while (x <= 9){
            while (y <= 9){
                System.out.printf("%d * %d = %d\n", x, y, x * y);
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
*/
        System.out.println("-----------------");
        //5*5까지만 출력
        //라벨명: 반복문1{반복문2{break 라벨명;}}
        myloop: 
        while (x <= 9){
            while (y <= 9){
                System.out.printf("%d * %d = %d\n", x, y, x * y);
                if(x == 5 && y ==5)
                    //break; // 소속된 가장 가까운 반복문을 나간다 
                    break myloop; // myloop라벨에 소속된 문장을 나간다.
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}
