//객체 읽기 - 파일의 데이터를 읽어 인스턴스로 만들기
package step22_FileIO.ex07;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Exam01_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test7.data");
        
        // 기존의 FileOutputStream 객체에 String, int, boolean 값을 모두 읽는
        // 장신구/보조장치/플러그인(Decorator)를 장착한다.
        DataInputStream in = new DataInputStream(fileIn);
        
        Member member = null;
        
        member = new Member();
        
        //Decorator를 사용하여 String, int, boolean값을 읽는다.
        //1)이름 읽기
        member.name = (String) in.readUTF();
        
        //2)나이 읽기
        member.age = in.readInt();
        
        //3)성별 읽기
        member.gender = in.readBoolean();

        in.close();
        
        System.out.printf("%s\n", member);
        
    }
}


