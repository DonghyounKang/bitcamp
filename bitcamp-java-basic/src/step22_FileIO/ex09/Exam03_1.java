//자바 I/O API 사용하기 - Serializable 인터페이스와  SerialVersionUID변수
package step22_FileIO.ex09;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam03_1 {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fileOut = new FileOutputStream("temp/test9_4.data");
        BufferedOutputStream bufout = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufout);
        
        Member3 member = new Member3();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;

        
            out.writeObject(member);
            //Member3 객체를 Serialize하여 바이트 배열로 출력할 때 
            //버전 번호도 함께 출력된다.
            //Member3의 버전 번호는 100L이다.
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}

// - 용어 정리
// Serialize : 객체 ---> 바이트 배열 (Marshalling이라고도 표현)
// Deserialize : 바이트 배열 ---> 객체 (Unarshalling이라고도 표현)
// 








