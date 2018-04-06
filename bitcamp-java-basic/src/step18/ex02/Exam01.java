//클래스 정보 추출 - 클래스 이름 알아내기
package step18.ex02;

public class Exam01 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.String");
        
        System.out.printf("getName:%s\n", clazz.getName()); 
        System.out.printf("getCanonicalName: %s\n", clazz.getCanonicalName());
        System.out.printf("getSimpleName: %s\n", clazz.getSimpleName());
        System.out.printf("getTypeName: %s\n", clazz.getTypeName());
        
        
    }
}
