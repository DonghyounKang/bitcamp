//메모리에서 데이터를 읽기 
package step22_FileIO.ex06;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Ex01_1 {
    public static void main(String[] args) throws IOException {
        byte[] buf = {0x0b, 0x41, 0x42, 
                (byte)0xea, (byte)0xb0, (byte)0x80, 
                (byte)0xea, (byte)0xb0, (byte)0x81, 
                (byte)0xea, (byte)0xb0, (byte)0x84,
                0x00, 0x00, 0x00, 0x1b, 0x01};
        
        //바이트 배열에서 데이터를 읽는 도구
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        
        //보통 바이트 배열에서 데이터를 읽을 때 인덱스를 가지고 직접
        //바이트 배열의 값을 읽는다.
        // 예) int b = buf[2];
        //그런데 바이트 배열도 그냥 데이터 저장소로 간주하고 
        //read()를 사용해서 읽을 수 있다면
        // 개발자는 파일이 되었던 메모리가 되었던 일관된 방법(read()메서드 호출)
        //으로 데이터를 읽을 수 있기 때문에
        // 유지보수가 편하게 된다.
        // 즉, 데이터가 저장된 장소에 상관없이 데이터를 읽을 때는 read()를 호출한다. 는
        //일관성있는 규칙이 생기게 되는 것이다.
        // 규칙이 있다는 것은 코딩을 매우 편하게 만든다.
        
        int b;
        while(true) {
            b = in.read();
            if(b == -1)
                break;
            System.out.printf("%x ",b);
        }
        System.out.println();
        
        in.close();
    }
}
