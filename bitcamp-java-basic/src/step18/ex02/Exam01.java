//클래스 정보 추출 - 클래스 이름 알아내기
package step18.ex02;

public class Exam01 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.String");
        
        System.out.printf("getName:", clazz.getName());
        System.out.printf("getCanonicalName:", clazz.getCanonicalName());
        System.out.printf("getSimpleName:", clazz.getSimpleName());
        System.out.printf("getTypeName:", clazz.getTypeName());
        
        
    }
}
