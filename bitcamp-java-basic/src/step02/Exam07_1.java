//18.03.05(2주차)
// 논리값 변수 - 유효한 값 범위
package step02;

public class Exam07_1{
    public static void main(String[] args){
        boolean b1, b2;
        b1 = true; //실제 메모리 : 1을 저장
        b2 = false; //실제 메모리 : 0을 저장

        System.out.println(b1);
        System.out.println(b2);

        //직접 정수 값을 저장하려해서는 안된다.
        //b1 = 1; //컴파일 오류
        //b2 = 0; //컴파일 오류

    }
}

/* 

*/