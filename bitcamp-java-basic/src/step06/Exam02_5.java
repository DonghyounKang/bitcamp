//메서드 : 개념 및 기본문법V
package step06;

import java.util.Scanner;

public class Exam02_5 {



    //5. 메서드 : 가변 파라미터
    // [리턴타입] 메서드명(타입...변수){...}
    //=> 0개 이상의 값을 받을 때 선언하는 방식
    //=> 내부적으로 배열처럼 사용

    //다음은 hello를 호출할 때 0개 이상 전달 가능
    static void hello(String... names) {
        for(int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다\n", names[i]);
        }
    }

    public static void main(String[] args){
        
        hello(); // 이 경우 names배열의 개수는 0이다.
        System.out.println("---------------------");

        hello("홍길동");// 이경우 names배열의 개수는 1이다.
        System.out.println("---------------------");

        hello("홍길동", "임꺽정", "유관순");// 이경우 names배열의 개수는 3이다.
        System.out.println("---------------------");

        //가변 파라미터 자리에 배열을 직접 넣어도 된다.
        String[]arr = {"홍길동", "임꺽정", "유관순", "김구"};
        hello(arr);
        System.out.println("---------------------");

       //hello("홍길동", 20, "임꺽정", "유관순");//컴파일 오류 => 다른 타입은 안된다.
    }
}
