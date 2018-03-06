//18.03.06(2주차)
// 형변환 - 명시적 형변환 가능한 경우
package step02;

public class Exam08_7{
    public static void main(String[] args){
        
        /* 
        1) 정수 메모리 간의 형변환 가능하다
        2) 부동소수점을 정수로 형변환이 가능하다
        3) 기본적으로 정수는 형변환 없이 부동소수점 메모리에 저장할 수 있다. 
        4) 숫자를 문자코드로 형변환 가능하다
        */
        char ch;
        int i = 0x41;
        ch = (char)i;

        //그 외에는 형변환 불가
        //=> 정수나 부동 소수점을 boolean 값으로 변환할 수 없다.
        boolean bool = (boolean)1; // 컴파일 오류

        //=> 문자열을 정수나, 부동소수점, 문자, boolean값으로 변환할 수 없다.
        boolean v1 = (boolean) "true"; //컴파일 오류
        char v2 = (char) "가"; //컴파일 오류
        int v3 = (int) "123"; //컴파일 오류
        float v4 = (int) "3.14f"; //컴파일 오류
    }
}

/* 


*/