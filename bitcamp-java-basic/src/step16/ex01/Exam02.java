//파일 정보 조회
package step16.ex01;

import java.io.File;

public class Exam02 {
    public static void main(String[] args) throws Exception {
        //file 클래스
        // => 파일이나 디렉토리 정보를 관리
        // => 파일이나 디렉토리를 생성, 삭제, 변경
        
        // 1) 현재 파일 정보 조회
        // "." : 현재폴더
        // ".." : 상위폴더
        File file1 = new File("src/step16/Exam01.java"); // 잘못된 경로(폴더)
        System.out.printf("파일명: %s\n", file1.getName());
        System.out.printf("파일크기: %d\n", file1.length());
        System.out.printf("경로: %s\n", file1.getPath());
        System.out.printf("절대경로: %s\n", file1.getAbsolutePath());
        System.out.printf("계산된 절대경로: %s\n", file1.getCanonicalPath());
        //존재하지 않는 폴더인 경우 크기를 알아낼 수 없다.
        System.out.printf("총 크기: %d\n", file1.getTotalSpace());
        System.out.printf("남은 크기: %d\n", file1.getFreeSpace());
        System.out.printf("가용 크기: %d\n", file1.getUsableSpace());
        //존재하지 않는 폴더인 경우 정보를 알아낼 수 없다.
        System.out.printf("디렉토리 여부: %b\n", file1.isDirectory());
        System.out.printf("파일 여부: %b\n", file1.isFile());
        System.out.printf("숨긴 폴더: %b\n", file1.isHidden());
        System.out.printf("숨긴 폴더: %b\n", file1.exists());
        System.out.printf("실행 가능 여부: %b\n", file1.canExecute());
        
        System.out.println("-------------");
        
        //2) 존재하지 않는 파일 정보 조회
        File file2 = new File("src/step16/ok.java");
        System.out.printf("파일명: %s\n", file2.getName());
        System.out.printf("파일크기: %d\n", file2.length());
        System.out.printf("경로: %s\n", file2.getPath());
        System.out.printf("절대경로: %s\n", file2.getAbsolutePath());
        System.out.printf("계산된 절대경로: %s\n", file2.getCanonicalPath());
        System.out.printf("총 크기: %d\n", file2.getTotalSpace());
        System.out.printf("남은 크기: %d\n", file2.getFreeSpace());
        System.out.printf("가용 크기: %d\n", file2.getUsableSpace());
        System.out.printf("디렉토리 여부: %b\n", file2.isDirectory());
        System.out.printf("파일 여부: %b\n", file2.isFile());
        System.out.printf("숨긴 폴더: %b\n", file2.isHidden());
        System.out.printf("숨긴 폴더: %b\n", file2.exists());
        System.out.printf("실행 가능 여부: %b\n", file2.canExecute());
            
        
    }
}
