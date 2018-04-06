//IOC Container 만들기 - 4) 파일경로 대신 패키지 이름을 포함한 클래스 이름을 추출

package step19.ex04;

import java.io.File;
import java.util.List;

// => 전체 클래스 이름 출력
public class Exam07 {
    public static void main(String[] args) throws Exception {
        
        ApplicationContext5 appContext = new ApplicationContext5("step19");
        List<String> classnames = appContext.getFiles();
        for(String name : classnames) {
                System.out.printf("%s\n", name);
            }
        }
        
        
    
    
   
   
   
}
