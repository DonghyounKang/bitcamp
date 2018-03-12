//비트 이동 연산자 - 응용 I
package step04;

public class Exam04_4{
    public static void main(String[] args){

        int i = 0x27a730ff;
        System.out.println(Integer.toHexString(i));
        
        // i 변수에 들어있는 값을 1바이트씩 잘라서 16진수로 출력
        int a = i >>> 24;
        int b = (i >> 16) & 0xff;
        int c = (i >> 8) & 0xff ;
        int d = i & 0xff;


        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toHexString(d));
        


    }
}

