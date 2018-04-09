// 애노테이션 프로퍼티 타입
package step20_Annotation.ex06;

//@MyAnnotation은 메서드 와 타입(인터페이스와 클래스)앞에만 붙일 수 있다.
@MyAnnotation//OK
public class MyClass {
    @MyAnnotation int i;// 컴파일 오류
    
    // Target을 통해 지정
    @MyAnnotation public void m() {} //OK
}
