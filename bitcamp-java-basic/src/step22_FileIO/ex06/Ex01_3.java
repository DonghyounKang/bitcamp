//메모리에서 데이터를 읽기 - byte배열에서 String, int, boolean값 읽기
package step22_FileIO.ex06;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Ex01_3 {
    public static void main(String[] args) throws Exception {
        byte[] buf = {0x0b, 0x41, 0x42, 
                (byte)0xea, (byte)0xb0, (byte)0x80, 
                (byte)0xea, (byte)0xb0, (byte)0x81, 
                (byte)0xea, (byte)0xb0, (byte)0x84,
                0x00, 0x00, 0x00, 0x1b, 0x01};
        
        ByteArrayDataInputStream in = new ByteArrayDataInputStream(buf);
        
        Member member = new Member();
        member.name = in.readUTF();;
        
        member.age = in.readInt();
        member.gender = in.readBoolean();
        in.close();
        
        System.out.println(member);
        //문제
        // => ByteArrayInputStream과 DataInputStream은 생성자를 제외한 나머지 코드가 모두 같다.
        // => 클래스의 코드를 복사하 지 않고 재사용하는 방법이 없다 --> 상속으로 기능 화장시의 한계
        //해결책
        // => 바이트 값을 읽어 String, int, boolean값으로 바꾸는 코드를 
        //    장신구(decorator)처럼 붙였다 뗐다 가능하게 만들면 된다.
    }
}
