//IOC Container 만들기 - 1) 특정 패키지의 파일 목록 알아내기

package step19.ex01;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

//=> 파일 및 디렉토릴 정보를 알아내는 코드를 메서드로 별도로 분리
public class Exam02 {
    public static void main(String[] args) {
        //1) 패키지 경로 준비
        File packageDir = new File("C:\\Users\\salig\\git\\bitcamp\\bitcamp-java-basic\\bin\\step19\\ex01");
        
        //2) 해당 디렉토리에서 파일 목록 가져오기
        List<File> files = findFiles(packageDir);
        for(File f : files) {
            if(f.isDirectory()) {
                System.out.printf("d %s\n", f.getName());
            } else {
                System.out.printf("- %s\n", f.getName());
            }
        }
        
        
    }
    
    // Vector, ArrayList, LinkedList => 목록을 관리하는 클래스
    // 목록 관리하는 클래스들의 기능에 대한 메서드를 List인터페이스로 규칙을 선언하였다.
    // 리턴 타입을 List로 설정하여 유지보수의 효율성을 추구
    
    static List<File> findFiles(File dir) {
        //배열을 사용하는 것볻 ArrayList를 사용하는 것이 편하기 때문에 
        //배열에 들어있는 File 객체들을 ArrayList로 복사한다.
        LinkedList<File> list = new LinkedList<>();
        File[] files = dir.listFiles();
        for(File f : files) {
            list.add(f);
        }
        return list;
    }
    
/*    static Vector<File> findFiles(File dir) {
        //배열을 사용하는 것볻 ArrayList를 사용하는 것이 편하기 때문에 
        //배열에 들어있는 File 객체들을 ArrayList로 복사한다.
        Vector<File> list = new Vector<>();
        File[] files = dir.listFiles();
        for(File f : files) {
            list.add(f);
        }
        return list;
    }*/
    
    /*static LinkedList<File> findFiles(File dir) {
        //배열을 사용하는 것볻 ArrayList를 사용하는 것이 편하기 때문에 
        //배열에 들어있는 File 객체들을 ArrayList로 복사한다.
        LinkedList<File> list = new LinkedList<>();
        File[] files = dir.listFiles();
        for(File f : files) {
            list.add(f);
        }
        return list;
    }
    */
    /*static ArrayList<File> findFiles(File dir) {
        //배열을 사용하는 것볻 ArrayList를 사용하는 것이 편하기 때문에 
        //배열에 들어있는 File 객체들을 ArrayList로 복사한다.
        ArrayList<File> list = new ArrayList<>();
        File[] files = dir.listFiles();
        for(File f : files) {
            list.add(f);
        }
        return list;
    }*/
}
