//특정 폴더를 생성하여 그 폴더에 파일을 만든다.
package step16.ex01;

import java.io.File;

public class Exam04_3 {

    public static void main(String[] args) throws Exception {
        //생성할 파일 경로 설정
        File file = new File("temp/a/test.txt");
        
        //File dir = new File(file.getParent());
        File dir = file.getParentFile();
        
        if(dir.mkdirs()) {
            System.out.println("temp/a dir 생성완료");
        } else {
            System.out.println("temp/a dir 생성불가");
        }
        
        if(file.createNewFile()) { // 파일 생성
            System.out.println("test.txt 생성 완료");
        } else {
            //존재하지 않는 파일은 삭제할 수 없다..
            //경로가 존재하지 않으면 당연히 그 경로의 파일의 부재로 삭제 불가
            System.out.println("test.txt 생성 불가");
        }
    }
}
