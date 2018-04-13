//버퍼 기능을 입출력 플러그인(Decorator)으로 전환한다.
package step22_FileIO.ex07;

import java.io.IOException;
import java.io.OutputStream;


public class BufferedOutputStream {

    OutputStream out;
    byte[] buf = new byte[8196];
    int cursor;
    
    public BufferedOutputStream(OutputStream out) {
        this.out = out;
    }


    public void write(int b) throws IOException {
        if(cursor == buf.length) { //버퍼가 다 차면
            out.write(buf); //버퍼에 들어있는 데이터를 한번에 출력
            cursor = 0; // cursor를 초기화
        }
        
        
        //1바이트 출력하라고 하면 일단 버퍼에 저장
        buf[cursor++] = (byte)b;
    }
    public void close() throws IOException {
        this.flush();
        out.close();
    }
    
    public void flush() throws IOException{//close()하지 않아도 중간중간에 buf의 내용을 출력
        if(cursor > 0) {
            out.write(buf, 0, cursor);
            cursor = 0;
        }
    }
}

//
