//조건 연산자 ==>     ? :
package step04;

public class Exam05_1{
    public static void main(String[] args){
        /*
        조건연산자
        피연산자1 ? 표현식1 : 표현식2 

        조건이 참이면 표현식1을 실행
        조건이 거짓이면 표현식2를 실행
        */

        /*
        int age =20;
        (age > 18) ? System.out.println("성인"); : 
        System.out.println("미성년자");  //Compile error 
        */
        //표현식 자리에는 문자던 숫자던 결과가 놓여져야한다.
        //System.out.prinln()은 결과를 리턴하지 않는다.

        String messeage = (age > 18) ? "성년" : "미성년";
        System.out.printf("나이 %d는(은) %s이다.\n");
    
    }
}
/*
표현식(Expression)
 작업을 수행하고 결과를 리턴하는 명령


문장(statement)
 작업을 수행시키는 명령

문장과 표현식의 관계
 -statement 중에서 결과를 리턴하는 statement를 expression이라 부른다

 */
