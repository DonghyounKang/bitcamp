//BufferedInputStream & BufferedOutStream을 사용하여  파일복사 및 시간 측정
package step22_FileIO.ex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam03_2 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        BufferedInputStream in = new BufferedInputStream("temp/jls8.pdf");
        BufferedOutputStream out = new BufferedOutputStream("temp/jls8_4.pdf");
        
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
