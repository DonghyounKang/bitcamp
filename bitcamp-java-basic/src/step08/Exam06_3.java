//초기화 블록 - 인스턴스 블록의 초기화 순서
package step08;

public class Exam06_3 {
    static class A{
        int a = 100;
        
        A(){
            a = 300;
        }
        
        {
            a = 200;
        }
        //1) 인스턴스 변수 생성 및 할당 연산자 실행(초기화)
        //2) 인스턴스 블록 실행
        //3) 생성자 실행
    }
    
    public static void main(String[] args) {
        
        A obj1 = new A();
        System.out.println(obj1.a);
        
    }
}
