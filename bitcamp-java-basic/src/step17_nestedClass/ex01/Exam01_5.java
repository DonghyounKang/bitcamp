//클래스의 종류 : anonymous class
package step17_nestedClass.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam01_5 {
    
    public static void main(String[] args) throws Exception{
        
        //anonymous class
        // => 인스턴스를 여러개 만들게 아니라면 클래스 이름 없이
        //    중첩클래스를 정의
        // => 클래스 이름이 없기때문에 나중에 new 연산자로 따로 인스턴ㅅ르를 생성할 수 없다.
        //    그래서 중첩클래스를 정의하는 순간 바로 인스턴스를 만든다.
        FilenameFilter javaFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                if(name.endsWith(".java"))
                    return true;
                return false; 
            }
        };
        
        File dir = new File(".");

        //anonymous 클래스의 인스턴스를 필터로 사용하여 디렉토리 안의 목록 추출
        String[] names = dir.list(javaFilter);
        for(String name : names) {
            System.out.println(name);
        } 

    }
}
