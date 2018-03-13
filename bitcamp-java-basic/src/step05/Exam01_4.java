//흐름 제어문 - if - else문
package step05;

import javax.lang.model.util.ElementScanner6;

public class Exam01_4 {
    public static void main(String[] args) {
        int age = 17;

        if(age < 19)
            System.out.println("미성년입니다.");//else문만 단독사용 가능


        //모범적인 사용
        if(age >= 19)
            System.out.println("성인입니다.");
        else   
            System.out.println("미성년입니다.");

        //잘못 사용한 예: else문만 단독사용 불가능 => if문만 단독사용 가능

        //else
        //    System.out.println("컴파일 오류");

        //=> if문과 else문 사이에 다른문장이 올수 없다.
        
        /*
        if(age >= 19)
        System.out.println("성인입니다.");
        System.out.println("-----------------------");
        else   
        System.out.println("미성년입니다.");
        */

        if(age >= 19){
            System.out.println("성인입니다.");
            System.out.println("-----------------------");
        }else   
            System.out.println("미성년입니다.");

        //=> 블록에 들어있는 문장은 if에 소속되기 때문에
        //=> 블록안에 여러개의 문장이 와도 상관없다.

    }
}