//18.03.05(2주차)
// 문자변수 - UTF-16(Unicode 2) 코드 값 저장
package step02;

public class Exam06_2{
    public static void main(String[] args){

        char c1, c2, c3;
        c1 = 0x41; // A문자의 UTF-16코드값
        c2 = 65; //A문자의 UTF-16코드값
        c3 = ;

        /*
        println()은 변수의 타입에 따라 출력을 달리한다.
        -변수의 종류가 char이면 출력할 때 10진수로 출력하는 대신 해당 코드의 문자를
        폰트 파일에서 찾아 출력한다.
        */

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // 다음 변수에 '핳'문자를 저장하여 출력
        char c4 = '헐';
        // 변수에 문자코드를 저장하면 문자코드를 암기해야하는데 너무 힘들다
        // 해결책?
        // 명령어가 있다=> sigle cotation: ''
            // '헐'의 경우 헐 문자의 URF-16코드 값을 그 자리에 놓는다.
            // 따라서 다음과 같은 코드가 된다.
            // c4 = 54736;
            
        System.out.println(c4);
    }
}

/* 

*/