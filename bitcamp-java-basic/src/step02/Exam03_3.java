//18.03.05(2주차)
//변수 - 메모리에 값 저장
package step02;

public class Exam03_3{
    public static void main(String[] args){
        int a;
        /*
        할당(배정) 연산자(연산을 수행하는 명령)
        -오른쪽에 저장된 값을 왼쪽에 가리키는 메모리에 저장시키는 명령어
        */

        a = 100; // -> 왼쪽의 a 라는 이름의 메모리에 100을 저장한다.

        int b;
        b = a; // -> 왼쪽의 b라는 이름의 메모리에 a라는 이름의 메모리에 들어있는 값을 저장한다.

        System.out.println(a);
        System.out.println(b);
    }
}

/* 
변수에 값 할당 (assignment)
-메모리에 값을 저장하는 것을 말한다.

문법
-변수명 = 변수 or 리터럴

용어
 '=' 의 왼쪽에 있는 변수를 'l-value'
 '=' 의 오른쪽에 있는 변수나 리터럴을 'r-value'
*/