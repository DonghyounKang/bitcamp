//리터럴(literal)
package step01;
public class Exam04{
    public static void main(String[] args) {
        //숫자: 그대로 적기
        //정수

        //=> 4byte크기의 정수
        System.out.println(10);
        System.out.println(+10);
        System.out.println(-10);

        //=> 8byte크기의 정수
        //   숫자 뒤에 L,l을 붙인다
        System.out.println(10L);
        System.out.println(+10l);
        System.out.println(-10L);

        //부동소수점

        //=> 4byte크기
        //   숫자 뒤에 F,f를 붙인다
        System.out.println(3.14f);
        System.out.println(3.14F);

        //=>8byte크기의 정수
        System.out.println(3.14);
        System.out.println(31.4e-1);

        

        //문자열: ""
        System.out.println("오호라");

        //한 개의 문자: ''
        System.out.println('가');

        //논리값: 대소문자 구분할 것
        System.out.println(true);
        System.out.println(false);
    }
}

//자바코드로 값을 표현(literal)

