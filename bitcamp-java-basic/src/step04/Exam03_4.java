//논리 연산자 - || vs |
package step04;

public class Exam04_1{
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        boolean r = a || (b = true); //
        
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);

        a = true;
        b = false;
        r = a | (b = true); //
        
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);

    }
}

/*

||는 앞의 피연산자로 결과추론이 가능하다면 뒤의 명령은 실행하지 않는다
|는 앞의 피연산자로 결과를 알 수 있더라도 뒤의 명령까지 모두 실행한다.


시험에 나온다면 이 부분이....중요!
 */