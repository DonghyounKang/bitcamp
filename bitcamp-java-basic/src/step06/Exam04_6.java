//메서드 : 스택 메모리 응용 III - Stack Overflow
package step06;

import java.util.Scanner;


public class Exam04_6 {

    static int sum(int value) {
        //종료 조건을 없애면 무한 호출
        /*
        if(value == 1)
            return 1;
        */
        long a1, a2, a3, a4, a5, a6, a7, a8, a9;
        long a11, a12, a13, a14, a15, a16, a17, a18, a19;
        long a111, a112, a113, a114, a115, a116, a117, a118, a119;        
        return value + sum(value - 1);
    }


    public static void main(String[] args){
        System.out.println(sum(5));
    }
}
/*
재귀 호출(recurscive call)
- 수학식을 코드로 표현하기 편하다
- 코드가 간결하다
- but 반복문을 사용하는 경우보다 메모리를 많이 사용한다.
- 멈춰야할 조건을 설정하지 않는 경우 스택메모리가 극한으로 증가하여
메모리 부족사태 발생(Stack Overflow)


*/