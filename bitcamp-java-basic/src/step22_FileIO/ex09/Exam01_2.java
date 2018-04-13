//자바 I/O API 사용하기 - BufferedOutputStream
package step22_FileIO.ex09;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exam01_2 {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fileOut = new FileOutputStream("temp/test9_2.data");
        BufferedOutputStream bufout = new BufferedOutputStream(fileOut);
        DataOutputStream out = new DataOutputStream(bufout);
        
        Member member = new Member();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        long startTime = System.currentTimeMillis();
        
        //Decorator를 사용하여 String, int, boolean값을 출력한다.
        for (int i = 0; i < 100000; i++) {
            //1) 이름출력
            out.writeUTF(member.name);
            
            //2) 나이 출력
            out.writeInt(member.age);
            
            //3) 성별 출력
            out.writeBoolean(member.gender);
        }
        
        long endTime = System.currentTimeMillis();
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        System.out.println(endTime - startTime);
        
    }
}
