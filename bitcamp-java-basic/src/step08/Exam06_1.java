//초기화 블록 - 인스턴스 블록
package step08;

public class Exam06_1 {

    static class A {
        int a;
        int b;
        
        {
            //아무 이럼없이 선언하는 블록이 "초기화 블록"
            //인스턴스 생성한 후, 생성자를 호출하기 전에 자동으로 실행한다. 
            System.out.println("{}1");
        }
        
        A(){
            System.out.println("A()");
        }
        
        {
            //초기화 블록은 여러 개 만들수 있다.
            // 순서대로 호출
            System.out.println("{}2");
            //초기화 블록을 굳이 여러개 나눠서 정의하면 코드의 유지보수에 어렵다.
            //초기화 블록을 정의한다면 한개만!
        }
    }
    
    public static void main(String[] args) {
        A obj1 = new A();
    }
}
