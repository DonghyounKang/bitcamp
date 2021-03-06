//파일 삭제
package step16.ex01;

import java.io.File;

public class Exam04_2 {

    public static void main(String[] args) throws Exception {
        //삭제할 파일 경로 설정
        File file = new File("temp2/a2/test.txt");
        
        if(file.delete()) { // 파일 삭제
            System.out.println("test.txt 삭제 완료");
        } else {
            //존재하지 않는 파일은 삭제할 수 없다..
            //경로가 존재하지 않으면 당연히 그 경로의 파일의 부재로 삭제 불가
            System.out.println("test.txt 삭제 불가");
        }
    }
}
