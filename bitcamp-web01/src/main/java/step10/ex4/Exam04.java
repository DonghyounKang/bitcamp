//session : 응용 - 서블릿 간의 데이터를 공유할 때 사용
package step10.ex4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/step10/ex4/exam04")
public class Exam04 extends HttpServlet {
    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        //세션에 보관된 이름, 나이를 가져온다.
        
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String name = (String)session.getAttribute("name");
        int age = (int)session.getAttribute("age");//autoUnboxing
        
        //파라미터로 받은 데이터는 그대로 getParameter로 출력
        String tel = request.getParameter("tel");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>확인</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <h1>확인</h1>");
        out.printf("    이름 : %s<br>\n", name);
        out.printf("    나이 : %d<br>\n", age);
        out.printf(" 전화번호 : %s<br>\n", tel);
        out.println("</body>");
        out.println("</html>");
    }
}
