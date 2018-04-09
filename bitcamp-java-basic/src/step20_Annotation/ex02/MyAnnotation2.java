// Annotation 유지 정책
// => SOURCE : 소스 파일에만 남긴다. 컴파일 후 제거된다.
// => CLASS : .class 파일에 남긴다. 실행 시에 추출할 수는 없다.**(default)
// => RUNTIME : .class 파일에 남긴다. 실행 시에 추출할 수 있다.

package step20_Annotation.ex02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Annotation의 정책을 SOURCE라 지정하면 해당 Annotation은 컴파일 시 제거
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation2 {
    String value();
}
