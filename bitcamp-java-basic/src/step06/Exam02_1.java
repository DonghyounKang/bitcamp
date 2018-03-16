//메서드 : 개념 및 기본문법
package step06;

import java.util.Scanner;

public class Exam02_1{


    //- 문법
    //[리턴 값의 타입] 함수명(파라미터 선언,...){명령문}
    //- 리턴값의 타입?(Return Value)
    //      함수 블록에 들어있는 명령어를 수행완료한 후 그 결과로 놓이는 값의 타입
    //- 파라미터(parameter) 선언?
    //      함수 블록을 실행할 때 외부로부터 받을 값을 저장할 변수 선언

    //1. 함수1 : 리턴 값(x), 파라미터(x)
    // => 함수 블록을 실행할 때 특정 값을 함수에 넘겨 줄 필요가 없고, 함수블록 실행
    //    완료 후 어떤 값도 돌려주지 않는다
    // ex) "여러분 부자되세요","여러분 식사하고 오세요", 
    
    static void hello() {
        System.out.println("안녕하세요");
        System.out.println("이 메서드는 어떤 값도 리턴하지 않습니다.");
    }

    public static void main(String[] args){
        //메서드를 사용하는 방법
        //=> [리턴값을 받을 변수] = 메서드명(argumemt)
        //-아규먼트(argument)?
        //      메서드 블록에 들어있는 명령어를 실행하기 위해 넘겨주는 값
        //      즉, 파라미터 변수에 넘겨주는 값
        //      파라미터 변수의 타입과 개수와 순서에 맞게 값을 넘겨줘야 한다.
        //      만약 변수의 타입(개수)과 값의 타입(개수)이 다르면 컴파일 오류
        //      만약 변수 선언 순서와 값의 순서가 다르면 컴파일 오류
        //
        //- 리턴값을 받을 변수
        //      메서드 블록을 실행한 수 리턴되는 값을 받을 변수
        //      메서드가 값을 리턴한다 하더라도 값을 받기 싫으면 변수를 선언하지
        //      않아도 된다.
        //      이 경우 리턴 되는 값은 버려진다.
        //    =>값을 리턴하지 않는 메서드에 대해 변수 선언시 컴파일 오류
        
        //메서드 블록의 명령을 실행하기(메서드 실행하기/메서드 호출하기)
        //다음은 hello라는 이름을 가진 메서드 블록을 찾아가서 실행하라는 의미
        hello();
        //hello() {}블록을 실행한 후 원래 위치로 돌아와 다음 명령을 실행한다.
        System.out.println("hello() 실행 완료");

        //hello메서드는 파라미터 변수가 없기 때문에 호출할 때 값을 넣으면 컴파일 오류
        // hello(100);//컴파일 오류

        //hello()메서드는 값을 리턴하지 않기 때문에 변수선언하여 값을 받으려 하면
        // 컴파일 오류
        //int i;
        //i = hello(); // 컴파일 오류
    }
}

//메서드 = 함수
//명령어를 기능단위로 관리하기 쉽게 별도로 분리하여 묶어놓은것
//반복적으로 자주 사용하는 명령어를 재사용하기 쉽도록 별도로 분리하여 묶어놓은것
