//버퍼 사용 전 - 파일복사 및 시간 측ㄱ정
package step22_FileIO.ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam02_1 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileInputStream in = new FileInputStream("temp/jls8.pdf");
        FileOutputStream out = new FileOutputStream("temp/jls8_2.pdf");
        
        int b;
        long startTime = System.currentTimeMillis();
        
        
        while((b = in.read()) != -1) {
            out.write(b);//파일을 끝까지 읽는다.
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println(endTime - startTime);
        
        out.close();
        in.close();
        
    }
}
