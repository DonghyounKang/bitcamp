//자바 I/O API 사용하기 - Serialize와 transient modifier
package step22_FileIO.ex09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam04_2 {
    public static void main(String[] args) throws Exception{
        
        FileInputStream fileIn = new FileInputStream("temp/test9_5.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
        

        Score s = (Score) in.readObject();
        //주의!
        // 1) Deserialize를 통해 인스턴스가 생성될 때 생성자 호출이 되지 않는다.
        in.close();
        
        // 2) Transient 변수의 값은 출력되지 않았기 때문에 읽을 수 없다.
        System.out.println(s);
        
        // => trnsient 같은 경우 인스턴스를 준비한 후 별도의 메서드를 통해 다시 계산하여야 한다.
        
        s.compute();
        System.out.println(s);

        // 이렇게 번거롭게 하는 이유?
        // => 데이터 왜곡 방지
        // => 그러니 번거롭다 생각말고 다른 인스턴스 변수의 값을 계산한 결과는
        //    가능한 출력하지 말고 읽을 때 다시 계산하도록 할 것
    }
}












