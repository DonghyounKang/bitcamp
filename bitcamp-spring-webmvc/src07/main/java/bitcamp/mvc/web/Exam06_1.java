// 요청핸들러의 리턴값 - 컨텐트를 직접 리턴하기
package bitcamp.mvc.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam06_1") 
public class Exam06_1 {
    
    
    //request handler에서 컨텐트를 직접 리턴할 때는 
    // 메서드 선언 부에 @ResponseBody를 붙여야한다.
    @GetMapping(value="m1")  
    @ResponseBody  
    public String m1() {
        //response Header
        //Content-Type: text/html;charset=ISO-8859-1 이다
        //따라서 한글 출력시 ISO-8859-1에 한글이 정의되어있지 않기 때문에
        //출력시 '?'문자로 바뀌어 출력된다.

        return "Exam06_1.m1() ==> 012ABCabc#!?가각간";
    }
    
    @GetMapping(value="m2", produces="text/plain;charset=UTF-8")  
    @ResponseBody  
    public String m2() {
        // @ResponseBody로 컨텐트를 출력할 때 
        //Content-Type을 설정하고 싶다면
        //@RequestMapping,@GetMapping,@PostMapping애노테이션에
        // produces 속성에 컨텐트 타입을 지정할것
        //원래 produces는 클라이언트의 HTTP 요청헤더인 Accept 값과 일치하는지 비교할 때 
        //호출되도록 사용하는 속성이지만
        //이렇게 콘텐트를 직접 출력할 때에
        // 프론트 컨트롤러는 produces에 설정된 정보를 참고하여
        //Content-Type을 설정하는 용도로 사용한다.
        

        return "Exam06_1.m2() ==> 012ABCabc#!?가각간";
    }
    
    
}







