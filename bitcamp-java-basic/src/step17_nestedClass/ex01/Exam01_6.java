//클래스의 종류 : anonymous class II
package step17_nestedClass.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam01_6 {
    
    public static void main(String[] args) throws Exception{
        
        //anonymous class
        // => 인스턴스를 여러곳에 사용할 것이 아니라면
        // 필요한 그 장소에 정의하라!
        // => 익명클래스가 사용될 곳에 정의되어 있기때문에 소스코드 해석이 편하다.
        //    만약 다른 별도의 장소에 클래스가 정의되어 있다면 그 클래스가 무엇을 하는지
        //    파악하기 위해서는 그 장소가 이동해야한다.
        // => 그런데 다음과같이 익명 클래스가 사용될 장소에 바로 클래스의 정의가 있기 때문에
        // 그클래스가 무엇을 하는지 소스코드를 파악하기 쉽
        
        File dir = new File(".");

        //anonymous 클래스의 인스턴스를 필터로 사용하여 디렉토리 안의 목록 추출
        String[] names = dir.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                if(name.endsWith(".java"))
                    return true;
                return false; 
            }
        });
        for(String name : names) {
            System.out.println(name);
        } 

    }
}
