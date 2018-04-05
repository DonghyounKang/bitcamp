//디렉토리 생성
package step16.ex01;

import java.io.File;

public class Exam03_2 {

    public static void main(String[] args) throws Exception {
        //생성할 디렉토리 경로 설정
        File dir = new File("temp2/a");
        
        // 해당 경로(./temp2)의 디렉토리가 존재하지 않을경우
        // 하위 경로(a)의 디렉토리를 새로 만들 수 없다.
        if(dir.mkdir()) { 
            System.out.println("temp2/a dir 생성 완료");
        } else {
            System.out.println("temp2/a dir 생성 불가");
        }
        
        
        System.out.println("-------------");
        
        //mkdirs() : 
        //지정된 경로에 디렉토리가 존재하지 않으면 그 디렉토리도 만든다.
        //상위폴더가 존재하지 않으면 생성한다.
        
        if(dir.mkdirs()) { 
            System.out.println("temp2/a dir 생성 완료");
        } else {
            System.out.println("temp2/a dir 생성 불가");
        }
    }
}
