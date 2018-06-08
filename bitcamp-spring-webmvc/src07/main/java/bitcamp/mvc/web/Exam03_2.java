//@RequestMapping - GET/POST/PUT 등 요청 (메서드) 구분 II
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam03_2")
public class Exam03_2 {
    
    //RequestMapping의 method속성을 사용하여 특정 요청에만 호출되도록 설정
    // test 방법 : /exam03_2.html
    @RequestMapping(value="m1", method=RequestMethod.GET)
    @ResponseBody
    public String m1() {
        return "Exam03_2.m1()";
    }
    
    //RequestMapping의 method속성을 사용하여 특정 요청에만 호출되도록 설정
    // test 방법 : /exam03_2.html
    @RequestMapping(value="m2", method=RequestMethod.POST)
    @ResponseBody
    public String m2() {
        return "Exam03_2.m2()";
    }
}