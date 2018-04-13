//Byte(Binary) Stream - 바이트 단위로 출력하기
package step22_FileIO.ex01;

import java.io.FileOutputStream;

public class Exam01_1 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileOutputStream out = new FileOutputStream("temp/test1.data");
        
        // 2) 1byte를 출력한다.
        // => write() : int 값을 argument롤 넘기더라도 맨 마지막 1byte만 출려한다.
        //    따라서 출력하는 값은 4d이다.
        out.write(0x7a6b5c4d);
        
        // 3) 출력도구를 닫는다.
        // => 항상 입출력도구 사용 후 닫아야 한다.
        // => 어떤 입출력도구는 닫지 않으면 Buffer(임시메모리)에 남아있는 데이터가 
        //    출력되지 않고 버려진다.
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}
