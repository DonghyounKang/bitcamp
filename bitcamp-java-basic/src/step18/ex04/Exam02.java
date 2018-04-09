//생성자: 특정 생성자 정보 가져오기
package step18.ex04;

import java.lang.reflect.Constructor;

public class Exam02 {
    
    public Exam02(String s, int i) {}
    public Exam02() {}
    public Exam02(int i) {}
    
    public static void main(String[] args) throws Exception {
        Class clazz = Exam02.class;
        
        //특정 생성자만 가져오기
        Constructor c= clazz.getConstructor(int.class); //생성자의 파라미터 타입을 지정
        System.out.printf("%s(%d)\n",c.getName(),c.getParameterCount());
        
    }
}