//@RequestMapping - Http 요청에서 Accept 헤더 다루기
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam04_3")
public class Exam04_3 {
    
    // Http 요청에서 "Accept" 헤더의 값에 따라 호출될 메서드 구분하기
    // -> Accept : 클라이언트가 리턴 받기를 원하는 타입이 무엇인지를 지정하는 헤더
    // Accept의 역할 : 서버에 요청시 리턴 타입 양식을 설정
    // test 방법 : 
    //예 1 : exam04_3.html
    @GetMapping(value="get", produces="text/plain")
    @ResponseBody
    public String m1() {
        //이 메서드는 실행한 결과를 순수한 text로 만들어 보내야한다.
        return "Exam04_3.m1()";
    }
    
    @GetMapping(value="get", produces="text/html")
    @ResponseBody
    public String m2() {
      //이 메서드는 실행한 결과를 html text로 만들어 보내야한다.
        return "Exam04_3.m2()";
    }
    
    @GetMapping(value="get", produces="application/pdf")
    @ResponseBody
    public String m3() {
      //이 메서드는 실행한 결과를 pdf로 만들어 보내야한다.
        return "Exam04_3.m3()";
    }
    
}
