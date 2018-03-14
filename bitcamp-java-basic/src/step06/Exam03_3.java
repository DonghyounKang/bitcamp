//메서드 : call by reference II
package step06;

import java.util.Scanner;

class MyObject{
    public int a;
    public int b;
}


public class Exam03_3 {

    //main()에서 만든 int a,b의 값을 바꾸고 싶다면
    //primitive data type 값을 직접 넘기지 않고
    //객체에 담아라

    static void swap(MyObject ref) {
        System.out.printf("swap(): a = %d, b = %d\n", ref.a, ref.b);
        int temp = ref.a;
        ref.a = ref.b;
        ref.b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", ref.a, ref.b);
    }

    public static void main(String[] args){
        //MyObject설계도에 따라 int a와 b의 메모리를 만든다
        //그리고 그 메모리(인스턴스=객체)의 주소를 ref변수에 저장
        MyObject ref = new MyObject();
        ref.a = 100;
        ref.b = 200;

       // a,b 변수가 들어있는 인스턴스의 주소를 swap()에 넘긴다. => call by ref
        swap(ref);
        System.out.printf("main(): a = %d, b = %d\n", ref.a, ref.b);
    }
}

/*
- call by value
    - 자바에서는 primitive datatype인 경우 메서드를 호출할 때 값을 넘긴다.
    - 자바에서는 primitive datatype에 대해서 메모리 주소를 넘기는 방법이 없다.

*/