//@RequestMapping - Http 파라미터로 메서드 구분하기
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam04_1")
public class Exam04_1 {
    
    // 파라미터 값의 존재여부에 따라 메서드를 구분할 수 있다.
    // url이 같더라도 파라미터의 존재유무에 따라 호출되는 메서드가 달라진다.
    // test 방법 : 
    //예 1 : /mvc/exam04_1/get?name=aaa
    //예 1 : /mvc/exam04_1/get?age=20
    //예 3 : /mvc/exam04_1/get?name=aaa&age=20
    @GetMapping(value="get", params="name")
    @ResponseBody
    public String m1() {
        return "Exam04_1.m1()";
    }
    
    @GetMapping(value="get", params="age")
    @ResponseBody
    public String m2() {
        return "Exam04_1.m2()";
    }
    
    @GetMapping(value="get", params= {"name","age"})
    @ResponseBody
    public String m3() {
        return "Exam04_1.m3()";
    }
}
