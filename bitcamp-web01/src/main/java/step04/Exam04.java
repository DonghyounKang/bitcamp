//GET 요청과 POST 요청 구분하기 - HttpServlet 클래스의 doXXX() 사용하기
package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Http 요청을 다루기 위해 매번 ServletRequest와 ServletResponse를 형변환한다면
// 매우 번거롭다.
// 미리 형변환 처리를 한 HttpServlet 클래스를 사용할것
@WebServlet("/step04/exam04")
public class Exam04 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    //test 방법 
    //http://localhost:8888/bitcamp-web01/step04/exam04_test.html실행
    //서블릿 컨테이너는 service(ServletRequest, ServletResponse)를 호출하면 
    //다음 절차를 거치면서 메서드가 호출
    //service(ServletRequest, ServletResponse)
    //      => service(HttpServletRequest, HttpServletResponse)
    //          => doGet(HttpServletRequest, HttpServletResponse)
    //          => doPost(HttpServletRequest, HttpServletResponse)
    //          => doHead(HttpServletRequest, HttpServletResponse)
    // 따라서 
    // GET 요청 : service()를 재정의 하는 것이 아닌 doGet()을 재정의 
    // POST 요청 : service()를 재정의 하는 것이 아닌 doPost()을 재정의 
    // GET과 POST를 한번에 처리하고 싶다면 service() 호출
    @Override
    public void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        //클라이언트가 get요청을 하면 이 메서드가 최종적으로 호출 된다.
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("doGet()호출됨");
        out.printf("name=%s\n", name);
        out.printf("age=%d\n", age);
    }
    
    @Override
    public void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        //클라이언트가 post요청을 하면 이 메서드가 최종적으로 호출 된다.
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("doPost()호출됨");
        out.printf("name=%s\n", name);
        out.printf("age=%d\n", age);
    }
    
}
