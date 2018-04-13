//자바 I/O API 사용하기 - ObjectOutputStream
package step22_FileIO.ex09;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam02_2 {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fileOut = new FileOutputStream("temp/test9_3.data");
        BufferedOutputStream bufout = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufout);
        
        Member2 member = new Member2();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;

        
            out.writeObject(member);
            //Member2클래스는 java.io.Serializable을 구현했기 때문에
            //바이트 배열로 자동 변환하는 것이 가능하다.
            //그래서 writeObject()를 호출하여 인스턴스의 값을 출력할 수 있다.
            
            //writeObject()는 단순히 데이터만 출력하는 것이 아니다.
            //인스턴스의 클래스 이름과 인스턴스변수의 타입 정보도 함께 출력한다.
            // => 출력 데이터 = 클래스 이름 + 인스턴스 타입 + 인스턴스 변수 정보 + 인스턴스 변수 값
        
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}

// - 용어 정리
// Serialize : 객체 ---> 바이트 배열 (Marshalling이라고도 표현)
// Deserialize : 바이트 배열 ---> 객체 (Unarshalling이라고도 표현)
// 








