//Annotation property 값 지정하기 - value property 이름 생략
package step20_Annotation.ex04;

//@MyAnnotation2(tel="222-2222") // OK!
@MyAnnotation2("222-2222") // value 속성이 아닌 경우 생략 불가!
public class MyClass2 {
}
