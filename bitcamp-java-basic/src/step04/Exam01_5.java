//연산자 - 암시적 형변환
package step04;

public class Exam01_5{
    public static void main(String[] args){

        int b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5.2f;
        double d = 6.6;
        char c = 7;
        boolean bool = true;
/*
        //_byte + byte = int_
        //=> 연산 전에 byte 값이 int로 임시적 형변환
        byte r = b + b; //Compile error

        //_short + short = int_
        //=> 연산 전에 short값이 int로 임시적 형변환
        short r2 = s + s; //Compile error
        
        //_byte + short + int_
        //=> byte와 short값은 int로 암시적 형변환된다.
        short r3 = b + s;

        //_byte + int = int_
        //=> byte가 int로 암시적 형변환 후 연산 수행
        int r4 = b + i; //ok

        //_short + int = int_
        int r5 = s + i; //ok

        //_int + long = long_
        //=> int가 long으로 암시적 형변환 후 연산 수행
        int r6 = i + l; //Compile error
        long r6 = i + l;

        //_long + float = float_
        //=> long이 floar으로 암시적 형변환 후 연산 수행
        long r7 = l + f; //Compile error
        float r7 = l + f;

        //_int + float = float_
        //=> 정수타입의 값과 부동소수점 타입의 값을 연산하면 정수타입의 
        //값이 암시적 형변환을 통해 부동소수점으로 바뀐다.
        int r8 = i + f; //Compile error
        float r8 = i + f;

        //_float + double = double_
        float r9 = f + d; //Compile error


        //byte + short + int + long + float + double = double
        long r10 = b + s + i + l + f + d; // Compile error

        //_float + int + long = float_
        long r11 = f + i + l; //Compile error
*/
        //int r12 = bool + i;
        /*
        int x = Integer.MAX_VALUE; 
        // = 0111 1111 1111 1111 1111 1111 1111 1111
        */
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int r1 = x + y; // ox7ffffffff + 0x7ffffffff = 0xfffffffffe = -2
        long r2 = x + y;
        
        System.out.println(r1); // int(4byte) + int(4byte) = int(4byte)
        System.out.println(r2); //


        float f1 = 987.6543f;
        float f2 = 1.111111f;
        float r3 = f1 + f2;
        double r4 = f1 +f2;
        System.out.println(r3);
        System.out.println(r4);
    }
}

/*

 */