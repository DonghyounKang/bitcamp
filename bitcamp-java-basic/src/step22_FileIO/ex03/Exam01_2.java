//데이터 읽기 - int 값 읽기
package step22_FileIO.ex03;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Exam01_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test3.data");
        
        //read()는 1바이트를 읽어 int값으로 만든 후 리턴한다.
        int value = in.read(); //실제 리턴한 값은 08이다.
        
        in.close();
        
        System.out.printf("%x\n", value);
        
    }
}


//Byte Stream - Input(Output)Stream : 변환하지 않는 byteStream
//Character Stream - ~ ~ Writer(Reader) : 변환하는 charactorStream
