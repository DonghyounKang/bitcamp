//InputStream에 붙이는 플러그인(Decorator)을 다른 플러그인에 붙이려면
//Decorator 클래스도 InputStream의 가족이 되어야 한다.
package step22_FileIO.ex08;

import java.io.IOException;
import java.io.InputStream;
// => 이 상속은 기능을 상속받기 위한 것이 아닌
// => "같은 그룹으로 묶이기"위함이다.
public class DataInputStream extends InputStream {
    
    InputStream in;
    
    //생성자 : 객체가 자신의 기능을 수행하기위해 필요한 최소한의 준비작업을 실행하는 것
    //       필수데이터, 필수 객체 준비
    public DataInputStream(InputStream in) throws Exception { 
        this.in = in;
    }
    
    public String readUTF() throws Exception {
        // 생성자로부터 받은 입력 객체의 read() 메서드를 사용
        int size = in.read(); 
        byte[] bytes = new byte[size];
        in.read(bytes); // 이름 배열 개수 만큼 바이트를 읽어 배열에 저장한다.
        return new String(bytes, "UTF-8");
    }
    
    public int readInt() throws Exception {
        int value = 0;
        
        value = in.read() << 24;
        value += in.read() << 16;
        value += in.read() << 8;
        value += in.read();
        return value;
    }
    
    public long readLong() throws Exception {
        long value = 0;
        value += (long)in.read() << 56;
        value += (long)in.read() << 48;
        value += (long)in.read() << 40;
        value += (long)in.read() << 32;
        value += (long)in.read() << 24;
        value += (long)in.read() << 16;
        value += (long)in.read() << 8;
        value += (long)in.read();
        return value;
    }
    
    public boolean readBoolean() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 boolean 값 출력
        if (in.read() == 1) 
            return true;
        else 
            return false;
    }
    
    public void close() throws IOException {
        in.close();
    }

    @Override
    public int read() throws IOException {
        // TODO Auto-generated method stub
        return 0;
    }
}





