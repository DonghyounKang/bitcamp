//객체 읽기 - 파일의 데이터를 읽어 인스턴스로 만들기
package step22_FileIO.ex04;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Exam02_2 {
    public static void main(String[] args) throws Exception {
        DataInputStream in = new DataInputStream("temp/test4_1.data");
        
        Member member = null;
        
        member = new Member();
       
        //1)이름 읽기
        member.name = (String) in.readUTF();
//        
//        byte[] buf = new byte[100];
//        int size = in.read();// 이름이 저장된 바이트 배열의 수
//        in.read(buf,0,size); // 이름 배열 개수 만큼 바이트를 읽어 배열에 저장
//        member.name = new String(buf,0,size,"UTF-8");
        
        //2)나이 읽기
        member.age = in.readInt();
//        
//        member.age = in.read() << 24;
//        member.age += in.read() << 16;
//        member.age += in.read() << 8;
//        member.age += in.read();
        
        //3)성별 읽기
        member.gender = in.readBoolean();
//        if(in.read() == 1)
//            member.gender = true;
//        else
//            member.gender = false;
//        
        in.close();
        
        System.out.printf("%s\n", member);
        
    }
}


//Byte Stream - Input(Output)Stream : 변환하지 않는 byteStream
//Character Stream - ~ ~ Writer(Reader) : 변환하는 charactorStream
