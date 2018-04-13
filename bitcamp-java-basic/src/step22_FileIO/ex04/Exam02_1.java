//ObjectOutputStream을 이용하여 객체 출력 - 인스턴스의 값을 출력
package step22_FileIO.ex04;

import java.io.FileOutputStream;

public class Exam02_1 {
    public static void main(String[] args) throws Exception{
        
        DataOutputStream out = new DataOutputStream("temp/test4_1.data");
        
        Member member = new Member();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        //인스턴스의 값을 출력하라
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
