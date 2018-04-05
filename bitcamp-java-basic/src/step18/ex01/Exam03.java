//Reflection API : 클래스 로딩과 "class"라는 스태틱 변수
package step18.ex01;

public class Exam03 {
    
    static class A {
        static int s_var = 100;
        int i_var = 200;
        
        static void s_m() { }
        void i_m() { }
        
        static {
            System.out.println("A 클래스 로딩");
        }
    }
    
    public static void main(String[] args) throws Exception {
        Class<?> clazz = A.class;
        //자바의 모든 클래스는 "class"라는 특별한 스테틱 변수를 가지고 있다.
        //"class" 변수에는 해당 클래스의 정보를 담은 Class 객체의 주소가 저장되어 있다.
        // 즉 다음코드와 같은 값을 리턴한다.
        //Class<?> clazz = Class.forName("step18.ex01.Exam03$A");
        
        //하지만 이방식으로 클래스를 로딩하면 static {} 블록을 실행하지 않는다.
        //물론 스테틱 멤버를 사용하는 최초의 순간에 static블록은 실행될 것이기 때문에
        // "클래스 로딩 후 스테틱 블록 실행" 명제는 지켜진다.
        
        //forName()을 호출하는 것 보다 안좋은 이유
        //forName()의 파라미터는 문자열
        // => 외부에서 문자열을 받아 해당클래스를 임의 로딩 가능
        //"class" 스태틱 변수사용하는 경우
        // => 자바소스안에 명확히 해당클래스를 지정해야한다.
        // => 임의로 다른 클래스를 로딩하는 코드를 작성할수 없다.
        // 다른 클래스를 로딩할 때 따로 코드를 수정해야한다. 
       
    }

}

