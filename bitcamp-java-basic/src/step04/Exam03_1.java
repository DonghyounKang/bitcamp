//논리 연산자 - &&, ||, !, ^(XOR, Exclusive or)
package step04;

public class Exam03_1{
    public static void main(String[] args){
// and 연산자
//두개의 논리값이 모두 true일 때 결과가 true
System.out.println(true && true);
System.out.println(true && false);
System.out.println(false && true);
System.out.println(false && false);

System.out.println("--------------------");
// or 연산자
// 두개의 논리중 하나라도 true면 결과는 true
System.out.println(true || true);
System.out.println(true || false);
System.out.println(false || true);
System.out.println(false || false);

System.out.println("--------------------");
// not 연산자
// true는 false로 false는 true로 바꾼다
System.out.println(!true);
System.out.println(!false);

//XOR 연산자
//배타적 비교 연산자
//두 개의 값이 다를 때 true
System.out.println(true ^ true);
System.out.println(true ^ false);
System.out.println(false ^ true);
System.out.println(false ^ false);
    }
}

/*

 */