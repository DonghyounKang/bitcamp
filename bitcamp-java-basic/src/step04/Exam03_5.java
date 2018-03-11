//논리 연산자 - 비트 연산
package step04;

public class Exam03_5{
    public static void main(String[] args){
        int a = 0b0110_1100;
        int b = 0b0101_0101;


        //정수 값에 대해서는 &&와 ||를 사용할 수 없다.
        //System.out.println(a && b); //Compile error
        //System.out.println(a || b); //Compile error
        //System.out.println(!a); // Compile error


        //그러나 &, |,^,!는 사용가능
        //각 비트 단위로 연산 수행
        // 1은 true,, 0은 false라고 간주하고 계산
        // 출력결과도 정수이다.

        System.out.println(a & b);
        //a = 0000 0000 0000 0000 0000 0000 0110 1100 
        //b = 0000 0000 0000 0000 0000 0000 0101 0101
        //--------------------------------------------
        //    0000 0000 0000 0000 0000 0000 0100 0100 = 68

        System.out.println(a | b);
        //a = 0000 0000 0000 0000 0000 0000 0110 1100 
        //b = 0000 0000 0000 0000 0000 0000 0101 0101
        //--------------------------------------------
        //    0000 0000 0000 0000 0000 0000 0111 1101 = 125

        System.out.println(a ^ b);
        //a = 0000 0000 0000 0000 0000 0000 0110 1100 
        //b = 0000 0000 0000 0000 0000 0000 0101 0101
        //--------------------------------------------
        //    0000 0000 0000 0000 0000 0000 0011 1001 = 57

        //비트연산에서 not은 !이 아니라 ~이다
        System.out.println(~a);
        //a = 0000 0000 0000 0000 0000 0000 0110 1100 
       //~a = 1111 1111 1111 1111 1111 1111 1001 0011 = -109


    }
}

/*
정리
비트 연산자의 활용
-이미지 및 영상처리에 사용
ex) 마스킹, 오버레이 기법에 사용
    색조 변경에 사용

사진을 컴퓨터에 저장하려면 2진수화 시켜야한다.
일단 사진을 점(픽셀; Pixel)으로 바꾼다
각 픽셀의 색상은 RGB의 값(빛의 삼원색)으로 표현한다.
즉, R , G , B 색의 세기를 조정하여 다양한 색상을 표현하는 것이다.

보통 천역색을 표현하기 위해 RGB 각 색상을 8비트로 표현한다.
    R의 빛의 세기 (0 ~ 255) => 0000 0000 ~ 1111 1111
    G의 빛의 세기 (0 ~ 255) => 0000 0000 ~ 1111 1111
    B의 빛의 세기 (0 ~ 255) => 0000 0000 ~ 1111 1111
    
    이 3개의 값을 합하여 한 개의 픽셀 색상을 표현하는 것이다.
    즉, 24비트(3바이트)로 픽셀 색상을 표현하는 것이다.
    빨간색의 한 픽셀: 1111 1111 0000 0000 0000 0000 = 0xFF0000
    초록색의 한 필셀: 0000 0000 1111 1111 0000 0000 = 0x00FF00
    파란색의 한 픽셀: 0000 0000 0000 0000 1111 1111 = 0x0000FF
    노란색의 한 픽셀: 1111 1111 1111 1111 0000 0000 = 0xFFFF00
 */