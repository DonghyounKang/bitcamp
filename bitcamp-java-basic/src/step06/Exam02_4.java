//메서드 : 개념 및 기본문법IV
package step06;

import java.util.Scanner;

public class Exam02_4 {



    //4. 함수1 : 리턴 값(O), 파라미터(O)
    
    // ex) "이 돈 갖고 과자 좀 사와"
    
    static String hello(String name, int age) {
        String retval = String.format("%d살 %s님 환영합니다", age, name);
        return retval;
    }

    public static void main(String[] args){
        
        //hello 메서드를 실행하여 그 리턴 값을 변수에 담는다.
        String r = hello("홍길동", 20);
        System.out.println(r);

        //리턴 값을 안받아도 된다.
        hello("임꺽정", 30); //리턴값은 버려진다.
       
    }
}
