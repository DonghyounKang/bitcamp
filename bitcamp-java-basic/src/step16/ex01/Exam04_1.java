//파일 생성
package step16.ex01;

import java.io.File;

public class Exam04_1 {

    public static void main(String[] args) throws Exception {
        //생성할 파일 경로 설정
        File file = new File("temp2/a/test.txt");
        
        if(file.createNewFile()) { // 파일 생성
            System.out.println("test.txt 생성 완료");
        } else {
            //이미 파일이 존재한다면 다시 생성할 수 없다.
            //해당경로의 디렉토리가 없다면 파일을 생성할 수 없다 - 예외 발생
            System.out.println("test.txt 생성 불가");
        }
    }
}
