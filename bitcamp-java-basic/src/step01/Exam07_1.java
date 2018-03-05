// 문자의 리터럴
package step01;

public class Exam07_1{
    public static void main(String[] args){
        //소스 코드에 10진수가 아닌 16진수가 있다면
        // 그것은 개발자가 의도적으로 값이 아닌 2진수를 강조하기 위함
        System.out.println(0x41); //출력 시 10진수로 출력

        //해당 숫자가 단순한 정수 값이 아닌
        //문자 코드 값임을 알려주면
        //println()명령어는 해당 문자코드의 문자를
        //폰트파일에서 찾아 출력한다.

        System.out.println((char)0x41);
        // => 이렇게 문자의 코드 값을 알고 있으면 문자를 출력하기 쉽다
        // 만약 문자의 코드값을 알고 있으면 문자를 출력할 수 있다.
        //
        //만약 문자의 코드 값을 모를 경우
        //=> 특별한 기호('')를 사용하여 문자를 표기

        System.out.println('A');

        // 특수문자를 입력할 수 없는 경우
        // 다음과 같이 해당 특수문자의 유니코드 값을 작은 따옴표에 넣어도 된다.
        // 단 코드값 앞에 \ u를 붙여야 한다.

        System.out.println('\u3182');
        System.out.println((char)0x3182);

    }
}


