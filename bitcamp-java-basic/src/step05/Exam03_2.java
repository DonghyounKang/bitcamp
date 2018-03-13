//흐름 제어문 - break; continue;
package step05;

import java.util.Scanner;

public class Exam03_2 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        //1부터 100까지의 합?
        while(count < 100){
            count++;
            sum += count;
            
        }
        System.out.printf("count: %d, sum: %d\n", count, sum);
        
        
        System.out.println("------------------");
        //continue 사용

        //continue 사용 전
        //1부터 100까지의 짝수의 합
        count = 0;
        sum = 0;
        while(count < 100){
            count++;
            if(count % 2 == 0){
                sum += count;
            }
            
        }
        System.out.printf("count: %d, sum: %d\n", count, sum);      
        
        System.out.println("------------------");
        //continue 사용
        //continue 사용 후
        //1부터 100까지의 짝수의 합
        count = 0;
        sum = 0;
        while(count < 100){
            count++;
            if(count % 2 == 1)
                continue; //다음 문장을 실행하지 않고 즉시 조건 검사로 이동한다. 
            sum += count;
            
        }
        System.out.printf("count: %d, sum: %d\n", count, sum);    
        System.out.println("------------------");

        //break 사용
        //break 사용 후
        //1부터 99까지 카운트 하지만 합은 50까지만
        count = 0;
        sum = 0;
        while(count < 100){
            count++;
            if(count > 50) //50이 넘어가면 합을 실행하지 않는다.
                continue; //다음 문장을 실행하지 않고 즉시 조건 검사로 이동한다. 
            sum += count;
            
        }
        System.out.printf("count: %d, sum: %d\n", count, sum);  
        
        System.out.println("------------------");

        //break 사용
        //break 사용 후
        //1부터 99까지 카운트 하지만 합은 50까지만
        count = 0;
        sum = 0;
        while(count < 100){
            count++;
            if(count > 50) //50이 넘어가면 합을 실행하지 않는다.
                break; //다음 문장을 실행하지 않고 즉시 조건 검사로 이동한다. 
            sum += count;
            
        }
        System.out.printf("count: %d, sum: %d\n", count, sum);  

    }
}
