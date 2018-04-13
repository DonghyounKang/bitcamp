//Byte(Binary) Stream - 바이트 배열의 특정 부분 출력하기
package step22_FileIO.ex01;

import java.io.FileOutputStream;

public class Exam03_1 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileOutputStream out = new FileOutputStream("temp/test1.data");
        
        byte[] bytes = new byte[] {0x7a, 0x6b, 0x7d, 0x6d, 0x4a, 0x5b, 0x10, 0x7f};
        
        out.write(bytes, 2, 3); //1번 데이터부터 2바이트 출력
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}
