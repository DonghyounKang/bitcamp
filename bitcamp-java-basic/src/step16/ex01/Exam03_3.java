//디렉토리 삭제
package step16.ex01;

import java.io.File;

public class Exam03_3 {

    public static void main(String[] args) throws Exception {
        //생성할 디렉토리 경로 설정
        File dir = new File("temp");
        
        // 해당 경로(./temp2)의 디렉토리가 존재하지 않을경우
        // 하위 경로(a)의 디렉토리를 새로 만들 수 없다.
        if(dir.delete()) { 
            System.out.println("temp dir 삭제 완료");
        } else {
            //디렉토리 안에 파일이나 다른 하위 디렉토리가 있다면 삭제할 수 없다.
            //존재하지 않는 디렉토리도 삭제할 수 없다.
            System.out.println("temp dir 삭제 불가");
        }
        
        
        System.out.println("-------------");
        
    }
}
