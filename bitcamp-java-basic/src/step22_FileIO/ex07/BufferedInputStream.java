//버퍼 기능을 입출력 플러그인(Decorator)으로 전환한다.
package step22_FileIO.ex07;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream {
    byte[] buf = new byte[8196];
    int size; // 배열에 저장되어있는 바이트의 수 
    int cursor; // 바이트를 읽은 배열의 위치
    
    InputStream in;
    public BufferedInputStream(InputStream in) {
        this.in = in;
    }
    
    public int read() throws IOException {
        if (cursor == size) { //buf에 저장된 데이터를 모두 읽었다.
            if ((size = in.read(buf)) == -1) { //파일에서 데이터를 읽는 중에 데이터가 없는 경우
                return -1;
            }
            cursor = 0;
        }
        return 0x000000ff & buf[cursor++];
    }

    public void close() throws IOException {
        in.close();
    }

    
}
