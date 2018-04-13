//Character Stream - 문자 배열의 특정 부분 출력하기
package step22_FileIO.ex02;

import java.io.FileWriter;

public class Exam03_1 {
    public static void main(String[] args) throws Exception{
        
        // 1) File로 데이터를 출력하는 객체를 준비한다.
        FileWriter out = new FileWriter("temp/test2.txt");
        
        char[] chars = new char[] {'A', 'B', 'C', '가', '각', '간', '똘', '똥'};
        
        out.write(chars, 2, 3); //2번 데이터부터 3개의 문자를 출력
        
        out.close();
        
        System.out.println("데이터 출력 완료");
        
    }
}
