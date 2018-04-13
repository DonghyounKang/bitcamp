//Character Stream - 문자 배열 읽기
package step22_FileIO.ex02;

import java.io.FileInputStream;
import java.io.FileReader;

public class Exam02_2 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileReader in = new FileReader("temp/test2.txt");
        
        //UTF-16 문자 코드 값들을 저장할 배열 준비
        // => 임시데이터 저장을 위해 만든 바이트배열 : buffer
        char[] buf = new char[100];
        
        //read(buf의 주소) : 읽은 데이터를 buf에 저장
        // => 버퍼가 꽉 찰때까지 읽는다.
        // => 물론 버퍼크기보다 파일의 데이터가 적으면 파일을 모두 읽어 버퍼에 저장한다.
        // => 리턴값은 읽은 바이트의 개수이다.
        // => 파일을 읽을 때 JVM의 문자 코드표에 따라 바이트를 읽는다.
        //    그리고 2바이트 UTF-16코드 값으로 변환하여 리턴한다.
        // => JVM의 문자 코드표가 UTF-8이라면 
        // 영어, 숫자, 특수기호 : 1바이트를 읽어 UTF-16으로 변환
        // 한글: 3바이트를 읽어 UTF-16으로 변환
        
        int count = in.read(buf); 
        
        
        in.close();
        
        System.out.printf("%d\n",count);
        for (int i = 0; i < count; i++)
            System.out.printf("%c(%x) ", buf[i], (int)buf[i]);
        
        System.out.println();
        
    }
}
