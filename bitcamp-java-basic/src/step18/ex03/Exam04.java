//메서드 정보 추출 - 특정 메서드  추출 II
package step18.ex03;

import java.lang.reflect.Method;

public class Exam04 {
    
    public void m1( ) {}
    public void m2(String s) {}
    public void m3(String s, int i) {}
    
    
    
    public static void main(String[] args) throws Exception  {
        Class clazz = Exam04.class;
        
        //파라미터가 없는 메서드를 찾을 때는 파라미터의 타입 정보를 넘기지 않는다.
        System.out.println(clazz.getMethod("m1").getName());
        
        //String 파라미터가 있는 메서드를 찾을 때 해당 타입정보를 넘겨야 한다.
        // 타입정보 = 클래스 정보 = Class객체
        
        //System.out.println(clazz.getMethod("m2", String.class).getName());
        Class parameterType = String.class;
        Method m = clazz.getMethod("m2", String.class);
        System.out.println(m.getName());
        
        //System.out.println(clazz.getMethod("m2", Class.forName("java.lang.String")).getName());
        parameterType = Class.forName("java.lang.String");
        m = clazz.getMethod("m2", parameterType);
        System.out.println(m.getName());
        
        
        //primitive Type 도 클래스 정보가 있다.
        //int = int.class
        //byte
        //short
        //long
        //float
        //double
        //boolean
        //char
        //위의 타입은 클래스는 아니지만 일반 클래스 처럼 타입정보를 꺼낼수 있도록 "class"라는 변수를 제공
        
        Class intType = int.class;
        Class stringType = String.class;
        m = clazz.getMethod("m3", stringType, intType); //파라미터 순서주의
        System.out.println(m.getName());
        
        
    }
}
