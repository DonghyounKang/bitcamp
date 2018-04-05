// 클래스의 종류 패키지 멤버 클래스
package step17_nestedClass.ex01;

import java.io.File;
import java.io.FilenameFilter;


// 다음 클래스와 같이 패키지에 직접 소속되는 클래스를 패키지 멤버 클래스라부른다.
// 일반적인 클래스들이 패키지 멤버 클래스이다.
//패키지 멤버는 여러 다른 패키지에서 사용가능


//패키지 멤버 접근범위
// public - 모두 접근가능
// (default) - 같은 패키지에 소속된 클래스만 접근가능
public class JavaFilter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            if(name.endsWith(".java"))
                return true;// 조회 결과에 포함
            return false; // 조회 결과에 제외
    }
        
    
}
