//데이터 읽기 - int 값 읽기 II
package step22_FileIO.ex03;

import java.io.FileInputStream;

public class Exam03_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test3.data");
        
        //read()는 1바이트를 읽어 int값으로 만든 후 리턴한다.
        // => 8바이트를 읽어 8바이트 변수 long에 저장하라!
        // => 읽은 바이트를 비트이동 연산자를 사용하여 값을 이동시킨 후 변수의 원하는 위치에 저장해야한다.
        long value = (long)in.read() << 56;
        value += (long)in.read() << 48;
        value += (long)(in.read() << 36);
        value += (long)(in.read() << 24); //실제 리턴한 값은 08이다.
        value += (long)(in.read() << 16);
        value += ((long)in.read() << 8);
        value += in.read();
        
        in.close();
        
        System.out.printf("%x\n", value);
        
    }
}


//Byte Stream - Input(Output)Stream : 변환하지 않는 byteStream
//Character Stream - ~ ~ Writer(Reader) : 변환하는 charactorStream
