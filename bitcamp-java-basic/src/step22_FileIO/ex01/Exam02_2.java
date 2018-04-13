//Byte(Binary) Stream - 바이트 배열 읽기
package step22_FileIO.ex01;

import java.io.FileInputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileInputStream in = new FileInputStream("temp/test1.data");
        
        //바이트 들을 저장할 배열 준비
        // => 임시데이터 저장을 위해 만든 바이트배열 : buffer
        byte[] buf = new byte[100];
        
        //read(buf의 주소) : 읽은 데이터를 buf에 저장
        // => 버퍼가 꽉 찰때까지 읽는다.
        // => 물론 버퍼크기보다 파일의 데이터가 적으면 파일을 모두 읽어 버퍼에 저장한다.
        // => 리턴값은 읽은 바이트의 개수이다.
        int count = in.read(buf); 
        
        
        in.close();
        
        System.out.printf("%d\n",count);
        for (int i = 0; i < count; i++)
            System.out.printf("%x ", buf[i]);
        
        System.out.println();
        
    }
}
