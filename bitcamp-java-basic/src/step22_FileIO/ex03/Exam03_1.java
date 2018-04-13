//데이터 출력 - long값 출력
package step22_FileIO.ex03;

import java.io.FileOutputStream;

public class Exam03_1 {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream out = new FileOutputStream("temp/test3.data");
        
        //우리나라 1년 예싼
        long money = 400_0000_0000_0000L;//0x016bcc41e90000
        
        //long메모리의 모든 바이트를 출력하려면 각 바이트를 맨끝으로 이동한 후 write()로 출력
        // 왜? write()는 항상 변수의 마지막 1바이트만 출력하기 때문
        
        out.write((int) (money>> 48));
        out.write((int) (money>> 40));
        out.write((int) (money>> 32));
        out.write((int) (money>> 24));
        out.write((int) (money>> 16));
        out.write((int) (money>> 8));
        out.write((int) money);
        
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}
