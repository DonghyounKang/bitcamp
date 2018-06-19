//Session 다루기( HttpSession 사용)I - 보관하기
//Session객체에 직접 데이터를 집어넣기
package bitcamp.mvc.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam08_1") 
public class Exam08_1 {

    @GetMapping(value="m1", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m1(String name, HttpSession session) {
        //테스트
        //  http://localhost:8888/bitcamp-spring-webmvc/mvc/exam08_1/m1?name=hong
        //1) 세션에 데이터 보관
        session.setAttribute("name",name);
        
        return String.format("m1(): name=%s", name);
    }
    
    
    @GetMapping(value="m2", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m2(int age, HttpSession session) {
        //테스트
        //  http://localhost:8888/bitcamp-spring-webmvc/mvc/exam08_1/m2?age=20
        //1) 세션에 데이터 보관
        session.setAttribute("age",age);
        
        return String.format("m2(): age=%d", age);
    }
    
    @GetMapping(value="m3", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m3(boolean working, HttpSession session) {
        //테스트
        //  http://localhost:8888/bitcamp-spring-webmvc/mvc/exam08_1/m3?working=true
        //1) 세션에 데이터 보관
        session.setAttribute("working",working);
        
        return String.format("m3(): working=%b", working);
    }
    
}