// Annotation property type 
package step20_Annotation.ex05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Annotation의 정책을 지정하지 않으면 기본이 CLASS이다.

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String v1() default "가나다";
    int v2() default 100;
    float v3() default 3.14f;
    
}
