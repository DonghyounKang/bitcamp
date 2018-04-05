//non-static nested class == inner class
package step17_nestedClass.ex03_nonStaticNestedClass;

public class Exam02 {

    int value;
    
    
    //인스턴스 메서드에서는 인스턴스 변수에 접근가능
    //인스턴스 메서드는 this라는 내장변수에 호출될때 넘겨 받은 인스턴스주소를 보관한다.
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void test() {
        Inner innerObj = new Inner();
        //Inner 클래스의 메서드를 호출하면 Inner객체의 주소뿐만 아니라 바깥 객체의 주소까지 전달된다.
        // 즉 m()메서드를 호출 할 때 실제로 두개의 주소가 넘어간다.
        // innerObj의 저장된 객체주소 + test()를 호출할 때 넘겨받은 Exam02객체의 주소
        innerObj.m();
        
    }
    
    class Inner {
        public void m() {
            //non-static nested class도 인스턴스 멤버이다.
            // 따라서 바깥 클래스의 인스턴스 변수에 접근가능하다.
            // 단 바깥 클래스의 인스턴스 주소를 사용하고 싶을 때는 
            // 바깥 클래스명.this 를 사용하라
            // => 그냥 this는 중첩 클래스의 인스턴스를 의미한다.
            
            //this <==== m()메서드를 호출할 때 넘겨받은 Inner객체의 주소가 들어있다.
            //Exam02.this <==== m()메서드를 호출할 때 넘겨받은 바깥클래스의 객체주소가 들어있다.
            
            System.out.println(Exam02.this.value);
        }
    }
    
    //Inner class도 Exam02의 인스턴스 멤버이기 때문에 
    //Inner class안에서는 Exam02의 모든 인스턴스 멤버(변수와 메서드)에 접근할 수 있다.
    
    public static void main(String[] args) {
        Exam02 obj = new Exam02();
        obj.setValue(100);
        
        obj.test();
        
        
    }
}
