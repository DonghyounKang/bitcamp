// Annotation property - 일반 프로퍼티

package step20_Annotation.ex04;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Annotation의 정책을 지정하지 않으면 기본이 CLASS이다.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
    String tel(); 
}
