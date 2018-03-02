//정수의 리터럴 II - 자릿수 표기
package step01;
public class Exam05_2{
    public static void main(String[] args) {

        // _를 사용하여 숫자 자릿수 표기 가능
        // 자리 위치는 작성자 마음이다
        System.out.println(12783406);
        System.out.println(1278_3406);
        System.out.println(12_783_406);

        //2진수
        System.out.println(0b1100100);
        System.out.println(0b110_0100);
        //System.out.println(0b_110_0100); --> 이건 안됨!
    }
}


