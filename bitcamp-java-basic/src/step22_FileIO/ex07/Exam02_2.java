//BufferedInputStream & BufferedOutStream을 사용하여  파일복사 및 시간 측정
package step22_FileIO.ex07;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception{

        FileInputStream fileIn = new FileInputStream("temp/jls8.pdf");//실제 출력은 여기서
        BufferedInputStream in = new BufferedInputStream(fileIn);//플러그인 장착 - FileInputStream을 상속받지 않았다.
        
        FileOutputStream fileOut = new FileOutputStream("temp/jls8_5.pdf");
        BufferedOutputStream out = new BufferedOutputStream(fileOut);
        
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
