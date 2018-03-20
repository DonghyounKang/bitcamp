//초기화 블록 - 클래스 블록(스태틱 블록)
package step08;

public class Exam06_4 {
    static class A{
        
      static int a;
      static void m() {
          
      }
        // 클래스 블록은 클래스가 로딩된 후에 순서대로 자동 실행
      static {
          System.out.println("static{}1");
      }
      
      static {
          System.out.println("static{}2");
      }
    }
    
    
    public static void main(String[] args) throws Exception{
        //클래스가 로딩되는 경우
        
        // => 레퍼런스를 선언할 때 로딩되지 않는다.
        A obj1;
        A obj2;
        
        //1) 클래스 멤버(변수, 메서드)를 최초로 사용할 때 
        //A.a = 100;
        System.out.println("--------------");
        //A.m();
        System.out.println("**************");
        
        //2) 해당 클래스에 인스턴스를 최초로 생성할 때
        // => 인스턴스를 생성하기 위해서는 설계도가 있어야하고 설계도는 메모리에 로딩되어있어야 한다.
        // 따라서 설계도가 없으면 즉시 설계도를 로딩할 것이다.
        //new A();
        
        //3) 자바에서 제공하는 도구를 사용하여 강제로 클래스를 로딩 시키는 경우
        // 이미 클래스가 로딩되어 있다면 다시 로딩시키지 않는다.
        // 자바는 중복하여 클래스를 메모리에 로딩하지 않느다.
        Class.forName("step08.Exam06_4$A");
    }
}
