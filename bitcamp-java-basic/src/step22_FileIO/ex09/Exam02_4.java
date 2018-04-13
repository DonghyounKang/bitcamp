//자바 I/O API 사용하기 - Serialize의 대상 클래스가 변경된 경우
package step22_FileIO.ex09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam02_4 {
    public static void main(String[] args) throws Exception{
        
        FileInputStream fileIn = new FileInputStream("temp/test9_3.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
        

        // 실행하기전 해야할 일 :
        // 1) 
        // test9_3.data를 읽기 전에 Member2 클래스에
        // 전화번호를 저장할 수 있는 인스턴스 변수를 추가하라
        Member2 member = (Member2) in.readObject();
        // Serialized 된 데이터를 읽어 Member2인스턴스를 생성하려고하면
        
        // java.io.InvalidClassException 발생 : step22_FileIO.ex09.Member2; 
        //local class incompatible: stream classdesc serialVersionUID = -2257478714022409057, 
        //local class serialVersionUID = -237705543586668058
        
        //이유?
        // => Serialize 데이터를 출력할 때 사용한 Member2 클래스의 데이터 버전과
        //    Serialize 데이터를 읽을 때 사용한 Member2 클래스의 버전이 다르기 때문이다.
        //    -> 버전의 경우 가시적으로 보여주지 않는다.
        // => 개발자가 클래스를 작성할 때 버전 미지정시
        //    컴파일러가 자동으로 임의의 버전 번호를 저장한다.
        // => private static final long SerialVersionUID 변수를 만들어
        //    임의의 값 저장
        //    -> 그러면 모든 클래스가 serialVersionUID 변수를 가지고 있을까?
        //       => 아니다.
        //       => java.io.Serializable 인터페이스를 구현한 클래스 만이 해당 변수를 가진다.
        //    -> 클래스 번호를 개발자가 임의로 관리 가능할까?
        //       => 명시적으로 변수를 선언하여 값을 지정할 수 있다.
        //          클래스가 변경되더라도 이 변수의 값이 같으면 실행 오류를 발생시키지 않고
        //          정상적으로 읽을 수 있다.
        //    
        
        
        in.close();
        
        System.out.println(member);
    }
}
// 그냥 실행시











