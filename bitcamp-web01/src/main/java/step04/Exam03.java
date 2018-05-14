//GET 요청과 POST 요청 구분하기 - HttpServlet 클래스
package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Http 요청을 다루기 위해 매번 ServletRequest와 ServletResponse를 형변환한다면
// 매우 번거롭다.
// 미리 형변환 처리를 한 HttpServlet 클래스를 사용할것
@WebServlet("/step04/exam03")
public class Exam03 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    //test 방법 
    //http://localhost:8888/bitcamp-web01/step04/exam03_test.html실행
    
    // => service() 메서드를 overriding 할 때도 Servlet 인터페이스에 선언된
    //  원래의 service(ServletRequest,ServletResponse)를 overriding하지 말고
    //  HttpServlet클래스에 추가한(overloading) service()메서드를 오버라이딩 하라
    // => 이 메서드는 파라미터 값으로 HttpServletRequest와 HttpServletResponse를 받는다.
    //  물론 서블릿 컨테이너가 이 메서드를 직접 호출하는 것이 아닌 
    //  service(ServletRequest, ServletResponse)를 호출하면 내부적으로
    //  servic(HttpServletRequest, HttpServletResponse)를 호출하는 것이다.
    //
    @Override
    public void service(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        //클라이언트가 보낸 값을 꺼낼때는 GET, POST 구분없이 동일한 방법으로 값을 꺼낸다.
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        // => 위 메서드를 재정의하면 파라미터 값을 형변환할 필요가 없다.
        // => 즉 오리지널 service(ServletRequest,ServletResponse)를 호출하여 
        // 파라미터를 재정의 할 필요가 없어 편하다
        //HttpServletRequest httpRequest = (HttpServletRequest) request;
        
        String method = request.getMethod();
        
        
        //UTF-16 => UTF-8
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("요청 방식 = %s\n", method);
        out.printf("name=%s\n", name);
        out.printf("age=%d\n", age);
    }
}
