//overriding - 응용 예 equals()
package step11.ex12;

public class Exam03_3 {
    
    
    
    
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        
        System.out.println(s1 == s2); //f
        System.out.println(s1.equals(s2)); //t
        //String 클래스에서 equals()를 오버라이딩 했기 때문에 
        //s1.equals(s2)의 결과가 true로 나온 것이다.
        
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        
        System.out.println(sb1 == sb2); //f
        System.out.println(sb1.equals(sb2)); //f
        
        //왜?
        // StringBuffer는 Object로 부터 상속받은 equals()를 오버라이딩 하지 않았다
        // 따라서 Object의 equals가 호출된것이다.
        // Object의 equals는 데이터가 같은지를 비교하는 것이 아닌 인스턴스가 같은지를 비교한다.
        
         
        
        
        
    }
}

// Object로부터 상속받은 기본 메서드인 equals()는
// 같은 인스턴스인지를 비교하는 메서드이다.
// 인스턴스의 데이터가 같은지를 비교하고 싶다면
// 이 메서드를 재정의(오버라이딩)해야한다.
// 오버라이딩의 예: String, 렙퍼클래스(Byte, Short, Integer, Long, Float, Double, Boolean, Character)


