//인스턴스 메서드와 클래스 메서드
package step08;

public class Exam02_1 {
    
    static class A{
        //1) 클래스 메서드
        //static이 붙은 메서드
        //클래스이름으로 호출 가능
        //Static method라고 부른다.
        static void m1(){
            System.out.println("A.m1()");
        }
        
        //2) 인스턴스 메서드
        //static이 붙지않은 메서드
        //인스턴스 주소가 있어야만 호출할 수 있다.
        void m2() {
            System.out.println("m2()");
        }
            
    }
    
    public static void main(String[] args) {
        // 클래스 메서드 호출
        // 클래스명.메서드명();
        A.m1();//ok
        
       // => 인스턴스 메서드는 클래스 이름으로 호출할 수 없다.
       //A.m2(); //컴파일 오류
        
        A obj1 = new A();
        
        obj1.m1(); //ok but 이렇게 하지 말라  
                   //물론 "클래스 메서드"를 인스턴스 주소를 사용하여 호출할 수 있지만
                   // 다른 개발자가 그냥"인스턴스 메서드"인줄 착각 할 수 있기 때문에
                   // 사용하지 않을 것을 권고
        obj1.m2(); //ok 인스턴스 메서드를 반드시 인스턴스 주소를 사용하여 호출
       /* 
        A obj2 = null;
        obj2.m2(); // 컴파일 ok , 실행은 error why? obj2 변수에 들어있는 인스턴스 주소가 무효하기 때문이다.
        */    
        }

}




