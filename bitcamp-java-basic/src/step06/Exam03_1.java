//메서드 : call by value 
package step06;

import java.util.Scanner;

public class Exam03_1 {

    static void swap(int a, int b) {
        System.out.printf("swap(): a = %d, b = %d\n", a, b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", a, b);
    }

    public static void main(String[] args){
        int a = 100;
        int b = 200;

        //swap()을 호출할 때 a변수의 값과 b변수의 값을 넘긴다.
        // ==> 그래서 "call by value"라 부른다
        // ==> 비록 swap()에도 변수 a, b가 있지만
        //     이 변수는 main에 있는 변수와 다른 변수이다.
        swap(a, b);
        System.out.printf("main(): a = %d, b = %d\n", a, b);
    }
}

/*
- call by value
    - 자바에서는 primitive datatype인 경우 메서드를 호출할 때 값을 넘긴다.
    - 자바에서는 primitive datatype에 대해서 메모리 주소를 넘기는 방법이 없다.

*/