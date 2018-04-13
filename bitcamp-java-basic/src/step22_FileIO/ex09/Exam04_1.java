//자바 I/O API 사용하기 - Serialize와 transient modifier(변경자)
package step22_FileIO.ex09;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam04_1 {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fileOut = new FileOutputStream("temp/test9_5.data");
        BufferedOutputStream bufout = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufout);
        
        Score s = new Score();
        s.name = "홍길동";
        s.kor = 99;
        s.eng = 80;
        s.math = 92;
        s.compute();
        
        out.writeObject(s);
        
        out.close();
        
    }
}

// - 용어 정리
// Serialize : 객체 ---> 바이트 배열 (Marshalling이라고도 표현)
// Deserialize : 바이트 배열 ---> 객체 (Unarshalling이라고도 표현)
// 








