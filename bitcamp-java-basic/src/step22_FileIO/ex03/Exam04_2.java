//데이터 읽기 - String 값 읽기
package step22_FileIO.ex03;

import java.io.FileInputStream;

public class Exam04_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test3.data");
        
        byte[] buf = new byte[100];
        
        int count = in.read(buf);
        
        //byte배열에 들어있는 값을 사용하여 String 인스턴스 생성
        //new String (byte 배열, 시작 번호, 개수, 문자코드표)
        // => 예) new String(buf, 0, 10, "UTF-8")
        //       buf 배열에서 0번부터 10개의 바이트를 꺼낸다. 그 바이트는 UTF-8코드로 되어 있다.
        //       이 UTF-8코드 배열을 UTF-16문자배열로 만들어 String 객체를 리턴
        String str = new String(buf, 0, count);
        
        
        in.close();
        
        System.out.printf("%s\n", str);
        
    }
}


//Byte Stream - Input(Output)Stream : 변환하지 않는 byteStream
//Character Stream - ~ ~ Writer(Reader) : 변환하는 charactorStream
