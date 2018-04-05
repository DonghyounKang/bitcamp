//디렉토리 생성
package step16.ex01;

import java.io.File;

public class Exam03_1 {

    public static void main(String[] args) throws Exception {
        //생성할 디렉토리 경로 설정
        File dir = new File("temp");
        if(dir.mkdir()) { // 디렉토리 생성
            System.out.println("temp dir 생성 완료");
        } else {
            System.out.println("temp dir 생성 불가");
        }
    }
}
