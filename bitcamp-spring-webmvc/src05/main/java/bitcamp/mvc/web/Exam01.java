package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Exam01 {
    
    @RequestMapping("/exam01/m1")
    @ResponseBody //리턴값이 viewUrl이 아닌 컨텐츠임을 가리킨다.
    public String test1() {
        return "Hello!";
    }
}
