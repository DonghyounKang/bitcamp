//논리 연산자 - && vs &
package step04;

public class Exam03_3{
    public static void main(String[] args){
        boolean a = false;
        boolean b = false;
        boolean r = a && (b = true); 
        // a = false이므로 결과 false 리턴, &&뒤에 실행하지 않고 b = false 값 리턴
        /*
        효율 연산
        */

        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);

        a = false;
        b = false;
        r = a & (b = true); //
        //뒤까지 연산 
        /*
        비효율 연산
        */

        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);

    }
}

/*

&&는 앞의 피연산자로 결과추론이 가능하다면 뒤의 명령은 실행하지 않는다
&는 앞의 피연산자로 결과를 알 수 있더라도 뒤의 명령까지 모두 실행한다.

 */