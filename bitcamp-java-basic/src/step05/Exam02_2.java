//흐름 제어문 - switch
package step05;

import java.util.Scanner;

public class Exam02_2 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("[ 지원 부서 ]");
        System.out.println("1. S/W 개발");
        System.out.println("2. 일반 관리");
        System.out.println("3. 시설 괸리");
        System.out.println("지원 분야 번호를 입력");
        int no =  keyScan.nextInt();              
        //Switch 사용후
        System.out.println("[ 제출 서류 ]");
        switch(no){
        case 1:    
            System.out.println("정보처리 관련 자격증");
        case 2:
            System.out.println("졸업증명서");
        case 3:
            System.out.println("이력서");
            break; // 여기까지만 실행
        default:
            System.out.println("올바른 번호를 입력하시오");
        }
    }
}
//각 분야마다 제출서류가 다 다르지만 중복되는 것들이 존재한다.
// no의 값이 case에 해당되는 경우 break; 명령을 만날 때까지 계속 실행한다.