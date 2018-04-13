//Character Stream -문자 배열 출력하기
package step22_FileIO.ex02;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Exam02_1 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileWriter out = new FileWriter("temp/test2.txt");
        
        char[] chars = new char[] {'A', 'B', 'C', '가', '각', '간', '똘', '똥'};
        
        
        out.write(chars); //문자 배열 전체 출력
        //당연히 UTF-16을 JVM 기본 문자표에 따라 변환 하여 출력
        //JVM이 입출력 문자 코드표로 UTF-8을 사용한다면
        // 영어: 1바이트로 변환 출력
        // 한글: 3바이트로 변환 출력
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}
