//흐름 제어문 - switch
package step05;

import java.util.Scanner;

public class Exam02_1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("[ 지원 부서 ]");
        System.out.println("1. S/W 개발");
        System.out.println("2. 일반 관리");
        System.out.println("3. 시설 괸리");
        System.out.println("지원 분야 번호를 입력");
        int no =  keyScan.nextInt();              
        //Switch 사용전
        System.out.println("[ 제출 서류 ]");
        if(no == 1){
            System.out.println("이력서");
            System.out.println("정보처리 관련 자격증");
            System.out.println("졸업증명서");
        }else if (no == 2){
            System.out.println("이력서");
            System.out.println("졸업증명서");
        }else if (no == 3){
            System.out.println("이력서");
        }else{
            System.out.println("올바른 번호를 입력하시오");
        }
    }
}
//각 분야마다 제출서류가 다 다르지만 중복되는 것들이 존재한다.