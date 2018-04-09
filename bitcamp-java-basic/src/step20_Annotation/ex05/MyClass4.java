// 애노테이션 프로퍼티 타입 - 배열값 지정
package step20_Annotation.ex05;

@MyAnnotation3(
               //배열값 지정시 중괄호 사용
               v1 = {"홍길동", "임꺽정", "유관순"},
               v2 = {1000, 2000, 3000},
               v3 = {1.12f, 2.13f, 3.14f})
public class MyClass4 {
    
    
}
