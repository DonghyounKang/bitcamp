//생성자: 생성자 호출
package step18.ex04;

import java.lang.reflect.Constructor;

public class Exam03 {
    
    int value;
    
    public Exam03(int i) {
        this.value = i;
    }
    
    public void print() {
        System.out.printf("value = %d\n", this.value);
    }
    
    public static void main(String[] args) throws Exception {
        Class clazz = Exam03.class;
        
        //newInstance()는 객체 생성후 기본생성자 호출(but 현재 기본생성자가 존재하지않는다.)
        // 따라서 Exam03은 실행 오류 발생
        //Exam03 obj = (Exam03)clazz.newInstance();// 실행 오류
        
        //해결 방안
        //생성자를 준비한다.
        Constructor c = clazz.getConstructor(int.class);
        
        //생성자 객체를 통해 인스턴스 생성 
        Exam03 obj = (Exam03) c.newInstance(200);
        obj.print();
        
        
    }
}
