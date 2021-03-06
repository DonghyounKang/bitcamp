//IOC Container 만들기 - 1) 특정 패키지의 파일 목록 알아내기

package step19.ex01;

import java.io.File;

//=> 해당 패키지에있는 파일 및 디렉토리 정보만 알아내기
public class Exam01 {
    public static void main(String[] args) {
        //1) 패키지 경로 준비
        File packageDir = new File("C:\\Users\\salig\\git\\bitcamp\\bitcamp-java-basic\\bin\\step19\\ex01");
        
        //2) 해당 디렉토리에서 파일 목록 가져오기
        File[] files = packageDir.listFiles();
        for(File f : files) {
            if(f.isDirectory()) {
                System.out.printf("d %s\n", f.getName());
            } else {
                System.out.printf("- %s\n", f.getName());
            }
        }
        
        
    }
}
