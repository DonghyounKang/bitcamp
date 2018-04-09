// Annotation property type  - 배열
package step20_Annotation.ex05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation3 {
    //배열 값이 한개일 경우, 중괄호 생략할 수 있다.
    String[] v1() default "가나다";
    int[] v2() default 100;
    float[] v3() default 3.14f;
    
}
