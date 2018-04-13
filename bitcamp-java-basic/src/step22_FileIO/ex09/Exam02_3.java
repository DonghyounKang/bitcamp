//자바 I/O API 사용하기 - ObjectInputStream으로 Serialize 된 데이터 읽기
package step22_FileIO.ex09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam02_3 {
    public static void main(String[] args) throws Exception{
        
        FileInputStream fileIn = new FileInputStream("temp/test9_3.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
        

        
            // Serialize된 데이터를 읽어 다시 원래의 객체로 만들기
            Member2 member = (Member2) in.readObject();
        
        
        in.close();
        
        System.out.println(member);
    }
}

// - 용어 정리
// Serialize : 객체 ---> 바이트 배열 (Marshalling이라고도 표현)
// Deserialize : 바이트 배열 ---> 객체 (Unarshalling이라고도 표현)
// 








