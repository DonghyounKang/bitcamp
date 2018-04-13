package step22_FileIO.ex05;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream{
    byte[] buf = new byte[8196];
    int cursor;
    
    public BufferedOutputStream(String filename) throws Exception {
        super(filename);
    }


    @Override
    public void write(int b) throws IOException {
        if(cursor == buf.length) { //버퍼가 다 차면
            this.write(buf); //버퍼에 들어있는 데이터를 한번에 출력
            cursor = 0; // cursor를 초기화
        }
        
        
        //1바이트 출력하라고 하면 일단 버퍼에 저장
        buf[cursor++] = (byte)b;
    }
    @Override
    public void close() throws IOException {
        this.flush();
        super.close();
    }
    
    @Override
    public void flush() throws IOException{//close()하지 않아도 중간중간에 buf의 내용을 출력
        if(cursor > 0) {
            this.write(buf, 0, cursor);
            cursor = 0;
        }
    }
}

//
