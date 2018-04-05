//클래스의 종류 : non static중첩 클래스(nested class)의 사용
package step17_nestedClass.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam01_3 {
    
    // non-static nested class(inner Class)
    //static이 붙지 않은 클래스
    // => 이 클래스는 인스턴가 있어야만 사용할 수 있다.
    // => 보통 인스턴스 멤버를 사용하는 중첩클래스를 만들때 inner class로 정의한다.
    // => 당연히 inner class는 인스턴스메서드에서 주로 사용.
    class JavaFilter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            if(name.endsWith(".java"))
                return true;// 조회 결과에 포함
            return false; // 조회 결과에 제외
        }
    }
    
    public void test() {
        
        File dir = new File(".");
        //inner 클래스의 인스턴스 생성
        JavaFilter javaFilter = new JavaFilter();

        //inner 클래스의 인스턴스를 필터로 사용하여 디렉토리 안의 목록 추출
        String[] names = dir.list(javaFilter);
        for(String name : names) {
            System.out.println(name);
        } 
    }
    


    public static void main(String[] args) throws Exception{
        Exam01_3 obj = new Exam01_3();
        obj.test();

        


    }
}
