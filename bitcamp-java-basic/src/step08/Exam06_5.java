//초기화 블록 - 클래스 블록(스태틱 블록)의 목적
package step08;

public class Exam06_5 {
    static class A{
        
      static float pi;
      static float area(int r) {
          return 2 * pi * r;
      }
        // 스태틱 블록은 클래스 맴버를 사용하기 전에 유효한 값으로 초기화 시키는 것이 목적
      static {
          pi = 3.14759f;
      }
      
    }
    
   
    public static void main(String[] args) throws Exception{
        System.out.println(A.area(25));
    }
}
