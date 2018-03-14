//메서드 : 스택 메모리 응용 II - 재귀호출
package step06;

import java.util.Scanner;


public class Exam04_5 {

    static int sum(int value) {
        if(value == 1)
            return 1;

        return value + sum(value - 1);
    }


    public static void main(String[] args){
        //다음과 같이 작은 수를 계산할 때는 재귀호출을 사용하는 것이
        //코드도 간단하고 이해하기 쉽다
        System.out.println(sum(100));

        //다음과 같이 큰 수를 계산할 때는 재귀호출수가 높아지면서 쉽게 스택 메모리가
        //부족해지는 문제 발생
        //따라서 호출단계가 깊지 않은 작은 수를 다룰 경우에는 재귀호출을 사용해도 되지만
        //호출 단계가 깊은 큰 수를 다룰 때는 재귀호출 대신 반복문으로 사용
        System.out.println(sum(1000000));
    }
}
/*
재귀 호출(recurscive call)
- 수학식을 코드로 표현하기 편하다
- 코드가 간결하다
- but 반복문을 사용하는 경우보다 메모리를 많이 사용한다.
- 멈춰야할 조건을 설정하지 않는 경우 스택메모리가 극한으로 증가하여
메모리 부족사태 발생(Stack Overflow)
- 큰 수(많이 호출 되는 경우)에 대해서 재귀호출을 할 때
     Stack Overflow가 자주 발생한다.
*/