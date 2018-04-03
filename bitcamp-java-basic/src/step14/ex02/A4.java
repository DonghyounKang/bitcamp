// 인터페이스 정의 - 결론 
package step14.ex02;

public interface A4 {
    
    /// => 규칙이기 때문에 new 명령으로 인스턴스 생성 불가능
    // => 인터페이스에 선언되는 모든 변수는 public 으로 공개되고
    //    static으로 클래스 변수가 된다.
    //    규칙은 변경되어서는 안된다. 따라서 모든 변수는 final로 선언한다. 
    // => final 변수는 선언과 동시에 특정값으로 초기화 해야한다. 
    public static final int v1 = 100;
    
    //인터페이스의 모든 변수는 모주건 public 이고 static이고 final이기 때문에 생략가능
    /*public static final*/int v2 =200;
  
    
    
}
