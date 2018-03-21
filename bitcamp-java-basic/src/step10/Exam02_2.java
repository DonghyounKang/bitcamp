//Wrapper 클래스 - "auto-boxing/auto-unboxing"
package step10;

public class Exam02_2 {
    public static void main(String[] args) {
        int i1 = 100;
        
        //int => Integer
        Integer obj1 = new Integer(i1);
        
        //Integer => int
        Integer obj2 = new Integer(200);
        int i2 = obj2.intValue();
        
        //JDK 1.5 부터 auto-boxing, auto-unboxing 기능 제공
        
        // 1) auto-boxing : int값을 자동으로 Integer wrapper 객체를 만든다. 
        Integer obj3 = i1; //내부적으로 new Integer(i1);으로 바뀐다.
        
        //즉 int 값이 obj3에 저장되는 것이 아니라 내부적으로 Integer객체가 생성되어
        //그 주소가 저장된다.
        // => 객체에 값을 넣어 포장한다고 하여 auto-boxing이라 한다. 
        
        
        // 2) auto-unboxing : Integer객체에서 값을 꺼내  리턴
        // 객체 안의 값을 자도으로 꺼낸다고 해서 auto-unboxing이라한다.
        Integer obj4 = new Integer(300);
        int i3 = obj4; // 내부적으로 obj4.intValue(); 로 바뀐다.
        
        // 즉 obj4에 들어있는 인스턴스 주소가 i3에 저장되는 것이 아닌
        // obj4 인스턴스에 들어있는 값을 꺼내 i3에 저장하는 것
        
    }
}
