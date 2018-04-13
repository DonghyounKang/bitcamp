//메모리에서 데이터를 읽기 - byte배열에서 String, int, boolean값 읽기
package step22_FileIO.ex07;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Exam01_3 {
    public static void main(String[] args) throws Exception {
        byte[] buf = {0x0b, 0x41, 0x42, 
                (byte)0xea, (byte)0xb0, (byte)0x80, 
                (byte)0xea, (byte)0xb0, (byte)0x81, 
                (byte)0xea, (byte)0xb0, (byte)0x84,
                0x00, 0x00, 0x00, 0x1b, 0x01};
        
        
        ByteArrayInputStream arrIn = new ByteArrayInputStream(buf);
        
        //FileInputStream에 붙여서 사용했던 DataInputStream을 
        //이번에는 ByteInputStream에 붙여보자
        //이렇게 플러그인, 장신구 처럼 해당 기능이 필요할 때마다 붙여 사용할 수 있는 객체를 
        //"Decorator"라 부른다.
        DataInputStream in = new DataInputStream(arrIn);
        
        Member member = new Member();
        member.name = in.readUTF();;
        
        member.age = in.readInt();
        member.gender = in.readBoolean();
        in.close();
        
        System.out.println(member);
    }
}
