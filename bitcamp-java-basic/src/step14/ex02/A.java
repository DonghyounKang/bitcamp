// 인터페이스 정의- 모든 메서드는 public이다.
package step14.ex02;

public interface A {
    
    //1) 문법1 : 
    //인터페이스에 정의하는 메서드는 호출 규칙이다.
    // 규칙은 공개되어야 한다.
    // 그래서 인터페이스에 선언되는 모든 메서드는 public 이다.
    public void m1();
    
    //=> 무조건 public이기 때문에 생략가능
    void m2(); //public 생략 (default가 아니다)
    
    
    // => protected, (default), private 은 없다.
    //private void m3(); //컴파일 오류
    //protected void m4(); //컴파일 오류
    void m5(); // 이것은 default가 아니다.
}
