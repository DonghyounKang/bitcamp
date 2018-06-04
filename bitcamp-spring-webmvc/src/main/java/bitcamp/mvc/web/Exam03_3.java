//@RequestMapping - GET/POST/PUT 등 요청 (메서드) 구분 III
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam03_3")
public class Exam03_3 {
    
    //RequestMapping의 method속성을 사용하여 특정 요청에만 호출되도록 설정
    // test 방법 : /exam03_3.html
    //@RequestMapping(value="m1", method=RequestMethod.GET)
    @GetMapping(value="m1")
    @ResponseBody
    public String m1() {
        return "Exam03_3.m1()";
    }
    
    //RequestMapping의 method속성을 사용하여 특정 요청에만 호출되도록 설정
    // test 방법 : /exam03_3.html
    //@RequestMapping(value="m2", method=RequestMethod.POST)
    @PostMapping(value="m2")
    @ResponseBody
    public String m2() {
        return "Exam03_3.m2()";
    }
}