package step11.ex11;

public class C2 extends C {
    //다음은 C의 메서드를 오버라이딩 한 것이 아니다
    //왜? C의 m1()은 private기 때문에 오직 C에서만 사용할 수 있다.
    // => C2에서 접근 불가하므로 오버라이딩은 불가능하다
    /*
    @Override
    private void m1() { // 컴파일 오류
    }
    */
    
    //@Override 제거시 m1()정의 가능? --> 오버라이딩이 아니다!
    // => C2의 새로운 메서드 추가
    // => 오버라이딩이라면 @Override 애노테이션을 붙였을 때 오류가 발생하면 안된다.
    
    /* 전형적인 overriding의 예
    private void m1() { }
    //결론 : 접근권한이 없는 메서드는 오버라이딩 불가
    
    @Override
    protected void m2() {
    }
    
    @Override
    void m3() {
    }
    
    @Override
    public void m4() {
    }
    */
    
    //오버라이딩 할때 (매서드 재정의 시)
    // 원본보다 접근 범위를 확대할 수는 잇지만 좁힐 수는 없다.
    //@Overriding void m2() {} // 접근범위를 protected에서 default로 좁혔기 때문에 컴파일 오류
    //
    
    //=> 확대는 상관없음
    @Override
    public void m2() {}
    
    @Override protected void m3() {}
}

//멤버의 접근범위
//private < (default) < protected < public

//private : 같은 클래스안에서
//default : 같은 클래스와 같은 패키지
//protected : 같은 클래스 + 같은 패키지 + subClass
//public : 모두 접근 가능

//결론
//수퍼클래스의 메서드를 서브클래스가 재정의 할 때 
//접근범위는 확대 가능하지만, 좁힐 수는 없다.
