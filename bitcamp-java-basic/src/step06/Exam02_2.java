//메서드 : 개념 및 기본문법II
package step06;

import java.util.Scanner;

public class Exam02_2{



    //2. 함수1 : 리턴 값(x), 파라미터(O)
    // => 메서드 블록을 실행할 때 값이 필요하다면 파라미터 변수를 선언하라
    //    
    // ex) "여기 돈 줄테니까 밥먹고 와","여기 등록금이다 학비내라"
    
    static void hello(String name, int age) {
        //- 파라미터란?
        //  메서드를 실행할 때 사용할 값을  외부로부터 받기 위해 선언한 로컬 변수
        //  메서드를 실행할 때 생성되어 메서드 실행이 끝나면 제거된다.
        System.out.printf("%d살 %s님 반갑습니다\n",age, name);
    }

    public static void main(String[] args){
        
        System.out.println("main()111111");
        //hello 메서드 호출하기

        hello("홍길동", 20);
        //hello 메서드 실행이 완료되면 다시 여기로 돌아와서 다음 명령 실행

        System.out.println("main()222222");
        
        //메서드는 언제든 필요할 때마다 반복하여 실행가능

        hello("임꺽정", 30);

        System.out.println("main()333333");
        // 한번 더 실행
        hello("유관순", 16);

        System.out.println("main()444444");

        //파라미터의 타입, 개수, 순서가 일치해야한다.
        //hello("윤봉길");// 컴파일 오류

        //hello("20, 윤봉길");// 컴파일 오류
        //String r = hello("안중근", 30);// 컴파일 오류
        //void r = hello("안중근", 30);// 컴파일 오류

    }
}

//아규먼트(argument)
// - 메서드를 호출할 때 넘겨주는값
//ex) hello("홍길동", 20);
//    "홍길동", 20 이 아규먼트이다
//파라미터(parameter)
// name과 age변수가 파라미터이다.

// 현장에서는 아규먼트와 파라미터를 구분하지 않고 사용한다.