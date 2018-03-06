//18.03.06(2주차)
// 형변환 - 명시적 형변환
package step02;

public class Exam08_5{
    public static void main(String[] args){
        float f =3.14f;
        double d = 9876.56789;

        /*
        부동소수점 메모리의 값을 정수 메모리에 저장할 수 없다
        하지만 개발자가 의도적으로 문제발생여부와 상관없이 부동소수점 값을 정수 메모리
        에 저장하고 싶을 때 또는 큰 메모리의 값을 작은 메모리에 저장하고 싶을 때
        컴파일러에게 강제로 값을 넣을 것을 명시하라!!
        
        */
        int i = (int)f; //소수점 이하 제거
        long l = (long)d; //소수점 이하 제거

        System.out.println(i);
        System.out.println(l);

    }
}

/* 
명시적 형변환

-사용시점
큰메모리의 값을 작은 메모리로 변환
부동소수점을 정수로 변환할 때 
-문법
 변수 = (바꾸고자 하는 타입) 변수 또는 값

*/