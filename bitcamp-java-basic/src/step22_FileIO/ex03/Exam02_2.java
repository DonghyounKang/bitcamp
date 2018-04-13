//데이터 읽기 - int 값 읽기 II
package step22_FileIO.ex03;

import java.io.FileInputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test3.data");
        
        //read()는 1바이트를 읽어 int값으로 만든 후 리턴한다.
        // => 4바이트를 읽어 4바이트 변수 int에 저장하라!
        // => 읽은 바이트를 비트이동 연산자를 사용하여 값을 이동시킨 후 변수의 원하는 위치에 저장해야한다.
        int value = in.read() << 24; //실제 리턴한 값은 08이다.
        value += (in.read() << 16);
        value += (in.read() << 8);
        value += in.read();
        
        in.close();
        
        System.out.printf("%x\n", value);
        
    }
}

