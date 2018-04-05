//클래스의 종류 : Local class
package step17_nestedClass.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam01_4 {
    
    public static void main(String[] args) throws Exception{
        
        //local class
        // => 특정 메서드 안에서만 사용할 메서드라면 그 메서드 안에 클래스를 정의하라
        // => 메서드 안에 정의된 클래스를 로컬 클래스(local class)라 부른다.
        class JavaFilter implements FilenameFilter {
            public boolean accept(File dir, String name) {
                if(name.endsWith(".java"))
                    return true;// 조회 결과에 포함
                return false; // 조회 결과에 제외
            }
        }
        
        File dir = new File(".");
        
        //로컬 클래스의 인스턴스 생성
        JavaFilter javaFilter = new JavaFilter();

        //로컬 클래스의 인스턴스를 필터로 사용하여 디렉토리 안의 목록 추출
        String[] names = dir.list(javaFilter);
        for(String name : names) {
            System.out.println(name);
        } 

    }
}
