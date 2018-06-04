//@RequestMapping을 사용하여 한 클래스에 여러개의 요청 핸들러 두기 
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class Exam01_2 {
    
    //한 클래스에 여러개의 요청 핸들러를 정의하는 경우
    // 각각의 RequestMapping 애노테이션 URL을 저장한다. 
    @RequestMapping("/exam01_2/m1")
    @ResponseBody
    public String m1() {
        return "Exam01_2.m1()";
    }
    
    @RequestMapping("/exam01_2/m2")
    @ResponseBody 
    public String m2() {
        return "Exam01_2.m2()";
    }
    
    
}
