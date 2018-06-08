//요청 핸들러의 파라미터-Http요청 헤더 값 받기
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam05_6") 
public class Exam05_6 {
    
    //@RequestHeader("헤더명")을 사용하면 HTTP 요청헤더의 값을 파라미터로 받을 수 있다.
    @GetMapping(value="m1", produces="text/plain")  
    @ResponseBody  
    public String m1(
            @RequestHeader("User-Agent")String userAgent,
            @RequestHeader(required=false, value="Content-Type")String contentType,
            @RequestHeader("Accept")String accept) {
        return String.format("m1() :\n %s\n %s\n %s\n", userAgent, contentType, accept);
    }
    
    //GlobalControllerAdvice 객체에 별도로 프로퍼티 에디터를 초기화 시키는 메서드를 정의해두었기 때문에
    // 다음의 메서드를 이 컨트롤러에 등록하지 않아도 된다.
/*    
    @InitBinder 
    public void initBinder(WebDataBinder binder) {
        
        binder.registerCustomEditor(
                java.sql.Date.class,                
                new PropertyEditorSupport() {       
                    @Override
                    public void setAsText(String text) throws IllegalArgumentException {
                        this.setValue(Date.valueOf(text));
                        
                    }
                });   
}
*/
}

    /* 실행 url주소
    // m1의 실행 url주소 : http://localhost:8888/bitcamp-spring-webmvc/mvc/exam05_5/m1?title=aaa&content=bbb&createDate=2018-06-04
                 
    */
    
    /* 실행 결과 :  m1() : aaa, bbb, 2018-06-04
     */
  
