//흐름 제어문 - 조건문 if에 여러 문장 묶기
package step05;

public class Exam01_2 {
    public static void main(String[] args) {
        int age = 17;
         //if (조건) {문장1, 문장2}
        // 조건이 참일때 여러개의 문장을 실행하고 싶다면 중괄호({})를 사용하여 묶어라
        if (age >= 19) 
            System.out.println("성인이다.");
            System.out.println("군대 가야한다.");
            System.out.println("일해야 한다..");
            System.out.println("세금 납부해야 한다.");
        
        System.out.println("-------------------------------------");
        //여러문장이 if 문에 종속되려면 {블록}을 사용하라
        if (age >= 19) {
            System.out.println("성인이다.");
            System.out.println("군대 가야한다.");
            System.out.println("일해야 한다..");
            System.out.println("세금 납부해야 한다.");
        }   


    }
}