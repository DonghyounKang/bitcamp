//오류 처리 작업을 수행하는 servlet - forward 적용
package bitcamp.java106.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/error")
public class ErrorServlet extends HttpServlet {
    //forward를 하는 이전 서블릿의 메서드 유형(doPost인지 doGet)에 맞춰 같은 메서드로 설정 --> service()를 호출
    
     @Override
    protected void service(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
         
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
         
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<meta charset='UTF-8'>");
         String refererUrl = request.getHeader("Referer"); //해당 서블릿의 이전 서블릿
         if (refererUrl != null) {
             out.printf("<meta http-equiv='Refresh' content='5;url=%s'>", refererUrl);
             
         }
         out.println("<title>서비스 실행오류</title>");
         out.println("</head>");
         out.println("<body>");
         out.printf("<h1>%s</h1>\n", request.getAttribute("title"));
         out.println("<pre>");
         Exception e = (Exception)request.getAttribute("error");
         e.printStackTrace(out);
         out.println("</pre>");
         out.println("</body>");
         out.println("</html>");
    }
}
