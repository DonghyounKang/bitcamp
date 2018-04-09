// Annotation property - 선택 프로퍼티

package step20_Annotation.ex03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Annotation의 정책을 지정하지 않으면 기본이 CLASS이다.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
    String value() default "홍길동"; 
        //default 값을 지정하면 
        //Annotation을 사용할 때 값을 지정하지 않아도 된다..
    
}
