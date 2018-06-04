
package bitcamp.mvc.web;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam05_5") 
public class Exam05_5 {
    
    @GetMapping(value="m1")  
    @ResponseBody  
    public String m1(String title, String content, Date createDate) {
        return String.format("m1() : %s, %s, %s", title, content, createDate);
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
  
