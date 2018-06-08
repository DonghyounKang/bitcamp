// 요청핸들러의 리턴값 - view component url 또는 이름 리턴하기
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.RedirectView;

@Controller 
@RequestMapping("/exam06_3") 
public class Exam06_3 {
    
    //request handler에서 view url을 리턴하면
    //프론트 컨트롤러는 그 URL을 include한다.
    @GetMapping(value="m1")  
    public String m1() {
        //return 값으로 JSP URL을 알려주면 된다.
        return "/exam06_3.jsp";
    }
    
    @GetMapping(value="m2")  
    public View m2() {
        //  view 컴포넌트 URL을 View 구현체에 담아 전달
        return new JstlView("/exam06_3.jsp");
    }

    @GetMapping(value="m3")  
    public View m3() {
        //  view 컴포넌트 URL을 View 구현체에 담아 전달
        return new RedirectView("../exam06_1/m1");
    }
    
    @GetMapping(value="m4")  
    public String m4() {
        //  보톨 redirect는 URL에 'redirect:'라는 접두어를 붙여 문자열로 리턴한다.
        return "redirect:../exam06_1/m2";
    }
    
    @GetMapping(value="m5")  
    public ModelAndView m5() {
        //  데이터와 함께 view url을 리턴할 때는 ModelAndView객체를사용하기도한다.
        //=> 위의 객체에 저장된 데이터는 프론트 컨트롤러가 ServletRequest보관소로 복사한다.
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","홍길동");
        mv.addObject("age",20);
        mv.setViewName("/exam06_3.jsp");
        return mv;
    }

}







