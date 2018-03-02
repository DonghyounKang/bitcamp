//정수의 리터럴 II - 크기
package step01;

public class Exam05_3{
    public static void main(String[] args) {

        // 정수를 표기할 때 
        // 크기에 따라 표기방법이 다르다
        // 그냥 작성하면 4바이트 크기의 정수를 의미한다(default)
        System.out.println(2147483647);//4바이트 양의 정수 최대값
        System.out.println(-2147483648);//4바이트 양의 정수 최소값

        // 4바이트 초과시 컴파일 에러
        // 숫자가 1 증가하면 4바이트 메모리 초과 --> 오류발생
        // System.out.println(2147483648);
        // System.out.println(-2147483649);
        
        // 해결방법
        // 4바이트 메모리보다 더 큰 메모리로 숫자를 저장하라고 명령
        // -> 숫자 뒤에 L, l을 붙여라!(8바이트)
        //    보통 대문자 사용(소문자는 숫자와 혼동)
        System.out.println(2147483648L);
        System.out.println(-2147483649L);

        // 8바이트의 정수 최대값 및 최소값
        // => 자바에서는 각 데이터 유형에 따라 최대/최소값을 확인할 수 있도록
        //특별한 명령을 제공 
        System.out.println(Integer.MAX_VALUE); // 4바이트 표현 가능 정수 최대값
        System.out.println(Integer.MIN_VALUE); // 4바이트 표현 가능 정수 최소값
        System.out.println(Long.MAX_VALUE); // 8바이트로 표현 가능 정수 최대값
        System.out.println(Long.MIN_VALUE); // 8바이트로 표현 가능 정수 최소값

        //최소한 이것은 알아두자
        //값을 표현하는 것에도 크기가 정해져 있다
        //정수분야 최대 숫자 확인
    
        //따라서 다음은 크기가 다른 정수이다
        System.out.println(100); //4바이트 크기의 정수
        System.out.println(100L); //8바이트 크기의 정수
    }
}


