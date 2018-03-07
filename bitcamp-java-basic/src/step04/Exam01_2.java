//연산자 - 산술연산자 : 우선순위
package step04;

public class Exam01_2{
    public static void main(String[] args){
        /*

        *, /, % 는 +, - 보다 먼저 계산

        */

        System.out.println(2 + 3 * 7); //3 * 7 선수행
        System.out.println(3 * 7 + 2); //3 * 7 선수행
        
        //같은 우선순위의 경우 먼저 나온 것을 먼저 계산
        System.out.println(3 * 8 / 2); // 3*8 먼저계산
        System.out.println(8 / 2 * 3); // 8/2 먼저계산
        //같은 우선순위의 연산자는 실행순서가 바뀌더라도 상관없다

        //강제로 실행순서를 바꾸고 싶다면 괄호()를 묶어라

        System.out.println((2 + 3) * 7);
    }
}
