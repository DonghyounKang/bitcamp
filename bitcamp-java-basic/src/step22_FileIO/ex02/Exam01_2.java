//character stream 문자 단위로 읽기
package step22_FileIO.ex02;

import java.io.FileReader;
import java.io.FileWriter;

public class Exam01_2 {
    public static void main(String[] args) throws Exception {
        //1) 파일데이터를 읽을 객체 준비
        FileReader in = new FileReader("temp/test2.txt");
        
        //2) JVM에 설정된 문자코드표에 따라  바이트를 읽어서 UTF-16으로 바꾼 후에 리턴한다 
        // => 리턴값은 2바이트 UTF-16의 코드값
        //JVM에 설정된 기본 문자표가 UTF-8이면 1 ~ 4바이트까지  문자에 따라 가변적으로 읽어들인다.
        // => 즉 영어 문자는 1바이트를 읽어 2바이트 UTF-16 코드값으로 바꿀 것이고
        //    한글 문자는 3바이트를 읽어 2바이트 UTF-16 코드값으로 바꿀 것이다.
        //    문자에 따라 읽는 바이트의 개수가 다르다는 것이다.
        
        // => 이것이 FileInputStream의 read()메서드와 다른점
        //    FileInputStream의 read() : 무조건 1바이트를 읽어들이고 값을 변환하지 않는다(그대로 리턴).
        //    FileReader의 read() : 문자에 따라 1 ~ 4바이트를 읽어들인다. 리턴값 또한 UTF-16코드값으로 변환하여 리턴한다
        //                         왜? JVM에서 문자를 UTF-16으로 다루기 때문
        
        //결론
        // 이미지 파일이나 동영상 파일과같이 binary data는 FileReader를 사용하여 읽어서는 안된다.
        // 이유: 문자라고 간주하고 값을 변경하기 때문이다.
        
        //binary data : 일반적인 방식으로 변경이 불가능한 데이터
        
        int ch = in.read();
        
        in.close();
        
        System.out.printf("%x\n", ch);
        
    }
}


//Byte Stream - Input(Output)Stream : 변환하지 않는 byteStream
//Character Stream - ~ ~ Writer(Reader) : 변환하는 charactorStream
