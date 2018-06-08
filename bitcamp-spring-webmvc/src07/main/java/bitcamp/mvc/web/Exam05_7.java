//요청 핸들러의 파라미터-Map model 받기
package bitcamp.mvc.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping("/exam05_7") 
public class Exam05_7 {
    
    //View Component(JSP)에게 전달할 데이터가 있다면
    // 프론트 컨트롤러에게 Map 또는 Model 객체를 요구하라
    // 그리고 이들 객체의 값을 담아놓으면 
    // 프론트 컨트롤러가 이들 객체에 담아놓은 값을 View Component가 사용할 수 있도록 다시 ServletRequest 보관소로 복사한다(옮긴다).
    @GetMapping(value="m1")  
    public String m1(Map<String,Object> map) {
        map.put("name", "홍길동");
        map.put("age", "20");
        return "/exam05_7.jsp";
    }

    @GetMapping(value="m2")  
    public String m2(Model model) {
        model.addAttribute("name", "안중근");
        model.addAttribute("age", "30");
        return "/exam05_7.jsp";
    }
    
    @GetMapping(value="m3")  
    public ModelAndView m3() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "안중근");
        mv.addObject("age", "30");
        mv.setViewName("/exam05_7.jsp");
        return mv;
    }
}

  
