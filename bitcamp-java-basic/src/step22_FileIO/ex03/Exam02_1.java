//데이터 출력 - int값 출력 II
package step22_FileIO.ex03;

import java.io.FileOutputStream;

public class Exam02_1 {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream out = new FileOutputStream("temp/test3.data");
        
        int money = 1_3456_7890;//0x080557d2
        
        //int메모리의 모든 바이트를 출력하려면 각 바이트를 맨끝으로 이동한 후 write()로 출력
        // 왜? write()는 항상 변수의 마지막 1바이트만 출력하기 때문
        out.write(money>> 24);
        out.write(money>> 16);
        out.write(money>> 8);
        out.write(money);
        
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}
