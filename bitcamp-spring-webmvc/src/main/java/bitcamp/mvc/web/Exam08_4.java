//Session 다루기( HttpSession 사용)IV - @SessionAttribute Annotation 사용(꺼내기)
package bitcamp.mvc.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller 
@RequestMapping("/exam08_4") 
@SessionAttributes({"name","age"})
// Session의 값을 @ModelAttribute Annotation을 사용하여 꺼내려면
// 마찬가지로 @SessionAttributes Annotation을 사용하여꺼낼 값의 이름을 지정해야 한다. 
public class Exam08_4 {

    @GetMapping(value="m1", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m1(HttpSession session) {
        //session에 보관된 값을 꺼내 출력하기
        return String.format("m1(): name=%s, age=%d, working=%b",
                session.getAttribute("name"), 
                session.getAttribute("age"), 
                session.getAttribute("working"));
    }
    
    //http://localhost:8888/bitcamp-spring-webmvc/mvc/exam08_4/m1
    //=> m1(): name=null, age=null, working=false ; 
    //모델에 저장된 데이터는 ServletRequest 저장소에 저장되므로
    //@SessionAttributes({"name","age","working"})을 붙이지 않는 경우 Session 객체에 데이터가 저장되지 않는다.
    // => Annotation을 설정하지 않는경우 저장된 데이터는 세션과는 아무 관계가 없다!!
    
    @GetMapping(value="m2", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m2(SessionStatus status) {
        //SessionStatus로 세션에 보관된 값 없에기
        status.setComplete();
        return String.format("m2(): session값 삭제");
    }
    
    //m3() 실행시 오류 발생
    @GetMapping(value="m3", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m3(
            //@SessionAttributes()에 지정된 값을 꺼낼 때에는 
            //@ModelAttribute를 사용할 것
            //=> m1()과 다르게파라미터 형식으로 바로 꺼낼 수 있다.
            @ModelAttribute("name") String name, 
            @ModelAttribute("age") int age, 
            
            // @SessionAttributes()에 지정된 값이 아니거나 없을때는 오류가 발생
            @ModelAttribute("working")Boolean working) {
        //session에 보관된 값을 꺼내 출력하기
        return String.format("m3(): name=%s, age=%d, working=%b",
                name, age, working
                );
    }
    
    //위의 에러를 수정하여 정상적인 상황 조성시..
    @GetMapping(value="m4", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m4 (
            //@SessionAttributes()에 지정된 값을 꺼낼 때에는 
            //@ModelAttribute를 사용할 것
            //=> m1()과 다르게파라미터 형식으로 바로 꺼낼 수 있다.
            @ModelAttribute("name") String name, 
            @ModelAttribute("age") int age) {
        //session에 보관된 값을 꺼내 출력하기
        return String.format("m4(): name=%s, age=%d",
                name, age);
    }
    
    
}