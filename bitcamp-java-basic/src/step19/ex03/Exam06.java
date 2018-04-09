//IOC Container 만들기 - 3).class 파일만 추출하기, 중첩클래스 제외

package step19.ex03;

import java.io.File;
import java.util.List;

// => FileFillter를 사용하여 .class 파일만 추출한다.
public class Exam06 {
    public static void main(String[] args) throws Exception {
        
        ApplicationContext4 appContext = new ApplicationContext4("step19/ex01");
        List<File> files = appContext.getFiles();
        for(File f : files) {
                System.out.printf("%s\n", f.getCanonicalPath());
            }
        }
        
        
    
    
   
   
   
}