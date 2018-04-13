//ObjectOutputStream을 이용하여 객체 출력 - 인스턴스의 값을 출력
package step22_FileIO.ex07;

import java.io.FileOutputStream;

public class Exam01_1 {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fileOut = new FileOutputStream("temp/test7.data");
        
        // 기존의 FileOutputStream 객체에 String, int, boolean 값을 모두 출력할 수 있는
        // 장신구/보조장치/플러그인(Decorator)를 장착한다.
        DataOutputStream out = new DataOutputStream(fileOut);
        
        Member member = new Member();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        //Decorator를 사용하여 String, int, boolean값을 출력한다.
        //1) 이름출력
        out.writeUTF(member.name);
        
        //2) 나이 출력
        out.writeInt(member.age);
        
        //3) 성별 출력
        out.writeBoolean(member.gender);
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}
