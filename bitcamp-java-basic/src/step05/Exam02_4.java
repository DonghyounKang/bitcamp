//흐름 제어문 - switch 문법
package step05;

import java.util.Scanner;
// emum 을 사용하여 상수를 정의(상수를 좀더 조직적으로 관리하기 위함)
enum Level{
    GUEST2, MEMBER2, ADMIN2            
    }

public class Exam02_4 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("사용자 레벨 : ");
        int level = keyScan.nextInt();


        /*상수 미사용시 
        값의 의미를 주석으로 표기 */ 
        switch(level){ 
        case 0: // 손님
            System.out.println("조회만 가능합니다.");
            break;
        case 1: // 일반회원
            System.out.println("글작성 가능");
            break;
        case 2: // 관리자
            System.out.println("다른 회원의 글 변경, 삭제 가능");
            break;
        }

        //상수를 사용하면 주석없이 바로 이해 가능
        final int GUEST = 0, MEMBER = 1, ADMIN = 2;

        switch(level){ 
        case GUEST : 
            System.out.println("조회만 가능합니다.");
            break;
        case MEMBER :
            System.out.println("글작성 가능");
            break;
        case ADMIN :
            System.out.println("다른 회원의 글 변경, 삭제 가능");
            break;
        }    
        
        /*
        enum으로 정의된 상수를 사용하려면 emum타입의 변수를 선언
        final int 처럼 직접값을 지정하지 않아도 된다.
        값을 직접 지정가능(차후 enum문법 배울때)

        enum을 사용하는 주된 이유는?
        1. 100, 200, "admin"과 같이 값을 직접 지정할 필요가 없다.
        2. enum변수는 그 타입에 정의된 값만 저장할 수 있다.
        */

        Level userLevel = Level.MEMBER2;

        //다음과 같이 switch나 case값으로 emum타임의 값 사용가능
        switch (userLevel){
        case GUEST2 : 
        System.out.println("조회만 가능합니다.");
        break;
        case MEMBER2 :
        System.out.println("글작성 가능");
        break;
        case ADMIN2 :
        System.out.println("다른 회원의 글 변경, 삭제 가능");
        break;  
        }
    }
}

/*
if vs switch
> 복잡한 조건으로 프로그램 흐름을 제어해야 하는 상황 : if문 사용
> int나 문자열처럼 단순한 값으로 프로그램을 제어할 수 있는 상황: switch문 사용
*/