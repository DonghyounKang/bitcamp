//흐름 제어문 - else문의 소속
package step05;

import javax.lang.model.util.ElementScanner6;

public class Exam01_5 {
    public static void main(String[] args) {
        int age =  15;

        // else는 가장 가까운 if에 소속된다.
        //들여쓰기에 속지 말자
        if (age > 19)
            if(age > 70)
                System.out.println("지하철 무임승차 가능");
        else
            System.out.println("미성년입니다."); 
        //else문은 if없이 사용불가, 오직 if가 있어야 사용가능
        //그래서 if ~ else ~ 는 한문장으로 취급
        //=>따라서 if(age >= 70)~else~ 는 한문장으로 강주
        //=> 다음과 같이 중괄호 사용할 필요없다
        if (age > 19) {
            if(age > 70)
                System.out.println("지하철 무임승차 가능");
        }
        else    
            System.out.println("미성년입니다."); 
        
        
        //else문을 첫번째 if문에 소속되게 하고 싶ㅇ다면
        //다음과 같이 두번째 if문을 블록으로 묶어라

        // 두번째 if는 첫번재 if 블록에 묵여있기 때문에 이 else와는 관계없다
    }
}