//InputStream에 붙이는 플러그인(Decorator)을 다른 플러그인에 붙이려면
//Decorator 클래스도 InputStream의 가족이 되어야 한다.
package step22_FileIO.ex08;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//InputStream을 상속받아 InputStream의 가족으로 거듭난다.
//하지만 InputStream을 상속받았다고 하여 특별히 그 상속받은 기능을 이용하는 것은 아니다.
//단지 같은 InputStream 그룹에 소속되기 위함이다.
// => 이 상속은 기능을 상속받기 위한 것이 아닌
// => "같은 그룹으로 묶이기"위함이다.
public class BufferedInputStream extends InputStream{
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
