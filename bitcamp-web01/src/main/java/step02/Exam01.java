// 서블릿을 서블릿 컨테이너에 등록하기 : 애노테이션으로 설정하는 방법
package step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//서블릿 클래스에 @WebServlet 애노테이션을 붙이면
// 서블릿 컨테이너가 알아서 해당 이름의 요청이 들어올 때
// 서블릿 컨테이너가 호출해 줄 것이다.

//서블릿 이름은 URL 경로로 표현해야하고
// 다음과 같이 value 속성에 이름을 지정하면 된다.
//@WebServlet(value="/step02/exam01")
//물론 value 속성값만 지정할 시 value 생략가능
//@WebServlet("/step02/exam01")
//value 대신 urlPatterns 속성에 이름을 지정해도 된다.
//@WebServlet(urlPatterns="/step02/exam01")
//물론 한 서블릿 클래스에 여러개의 이름을 지정할 수 있기 때문에 배열로 표현 가능
//@WebServlet(urlPatterns= {"/step02/exam01"})

@WebServlet(urlPatterns= {"/step02/exam01","/step02/exam01_ok"})
public class Exam01 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("step02.Exam01.service()");
    }
    
}
