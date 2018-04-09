// Annotation property - 필수 프로퍼티

package step20_Annotation.ex03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Annotation의 정책을 지정하지 않으면 기본이 CLASS이다.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value(); //default 값을 지정하지 않으면 필수 property
                    // 즉 Annotation을 사용할 때 반드시 값을 지정해야한다.
    
}
