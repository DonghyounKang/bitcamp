//메서드 정보 추출
package step18.ex03;

import java.lang.reflect.Method;

public class Exam01 {
    public static void m1() {}
    public void m2() {}
    protected void m3() {}
    void m4() {}
    private void m5() {}
    
    
    public static void main(String[] args) {
        Class clazz = Exam01.class;
        
        //클래스에서 메서드 정보 추출
        // => 해당 클래스에 선언된 public 메서드 + 상속받은 public 메서드
        Method[] list = clazz.getMethods();
        for(Method m:list) {
            System.out.println(m.getName());
        }
    
    }
}
