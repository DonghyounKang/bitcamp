//논리 연산자 - >>, >>>, <<
package step04;

public class Exam04_1{
    public static void main(String[] args){

        int i = 1;
        System.out.println(i << 1);
        System.out.println(i << 2);
        System.out.println(i << 3);
        System.out.println(i << 4);

        i = 0b00000_1011; //11
        System.out.println(i << 1); //22 => 0001 0110
        System.out.println(i << 2); //44 => 0010 1100
        System.out.println(i << 3); //88 => 0101 1000
        System.out.println(i << 4);
    }
}

/*
0000_0001 1
0000_0010 2
0000_0100 4
0000_1000 8
1비트 이동은 *2와 같다

왼쪽으로 이동후 오른쪽 빈자리는 0으로 채워진다.
왼쪽 경계를 넘어간 비트는 자른다

-왼쪽이동
1비트 이동은 *2한 것과 같은 효과를 준다
 */