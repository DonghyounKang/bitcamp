//변수 초기화 - 초기화 문장
package step08;

public class Exam05_2 {
    
    static class A {
        
        //"변수 초기화 문장" : 변수선언과 동시에 값을 저장하는 것
        //변수 생성 즉시 할당연산자(=) 실행
        
        static int a = 100;
        int b = 200;
    }
    
    public static void main(String[] args) {
        int c = 300;
        
        //클래스의 변수는 생성되는 순간 0으로 자동 초기화
        System.out.println(A.a);
        
        A obj1 = new A();
        //인스턴스 변수는 생성되는 순간 0으로 자동초기화
        System.out.println(obj1.b);
        
        //로컬변수는 자동초기화 X
        //반드시 사용전에 값을 저장
        System.out.println(c);
    }
}
