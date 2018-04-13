//버퍼 사용 전 - 데이터 읽는데 걸린 시간
package step22_FileIO.ex05;

import java.io.FileInputStream;

public class Exam01_1 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileInputStream in = new FileInputStream("temp/jls8.pdf");
        
        int b;
        long startTime = System.currentTimeMillis();
        
        int callCount = 0;
        while((b = in.read()) != -1) callCount++; //파일을 끝까지 읽는다.
        
        long endTime = System.currentTimeMillis();
        
        System.out.println(endTime - startTime);
        System.out.println(callCount);
        
        in.close();
        
    }
}
