//@RequestMapping을 사용하여 한 클래스에 여러개의 요청 핸들러 두기 II
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam01_3") // 클래스 선언부에 상위 공통 url을 두고
public class Exam01_3 {
    
    
    // 각각의 RequestMapping 애노테이션에는 하위 url을 정의하는 방식이다. 
    @RequestMapping("m1")
    @ResponseBody
    public String m1() {
        return "Exam01_3.m1()";
    }
    
    @RequestMapping("m2")
    @ResponseBody 
    public String m2() {
        return "Exam01_3.m2()";
    }
    
    
}
