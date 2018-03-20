//변수 초기화 - 자동 초기화
package step08;

public class Exam05_1 {
    
    static class A {
        static int a;
        int b;
    }
    public static void main(String[] args) {
        int c;
        
        //클래스 변수는 생성되는 순간 0으로 자동 초기화
        System.out.println(A.a);
        
        A obj1 = new A();
        //인스턴스 변수는 생성되는 순간 0으로 자동초기화
        System.out.println(obj1.b);
        
        //로컬변수는 자동초기화 X
        //반드시 사용전에 값을 저장
        //System.out.println(c);//compile error
    }
}
