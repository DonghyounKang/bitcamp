//OutputStream에 붙이는 플러그인(Decorator)을 다른 플러그인에 붙이려면
//Decorator 클래스도 OutputStream의 가족이 되어야 한다.
package step22_FileIO.ex08;

import java.io.IOException;
import java.io.OutputStream;


public class BufferedOutputStream extends OutputStream {

    OutputStream out;
    byte[] buf = new byte[8196];
    int cursor;
  //하지만 InputStream을 상속받았다고 하여 특별히 그 상속받은 기능을 이용하는 것은 아니다.
  //단지 같은 InputStream 그룹에 소속되기 위함이다.
  // => 이 상속은 기능을 상속받기 위한 것이 아닌
  // => "같은 그룹으로 묶이기"위함이다.
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
