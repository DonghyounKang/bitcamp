// 저장소 사용
package step11;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/step11/exam01")
public class Exam01 extends HttpServlet {
    
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        //servletContext 저장소
        ServletContext sc = this.getServletContext();
        
        //HttpSession
        HttpSession session = request.getSession();
        
        //저장소
        sc.setAttribute("v1", "aaa"); // 웹 어플리케이션 당 한개씩 생성
        session.setAttribute("v2", "bbb"); // 클라이언트 당 한개씩 생성 (세션이 다르면 값을 가져올 수 없다)
        request.setAttribute("v3", "ccc"); //요청될 때 마다 매번 요청되고 생성(요청이 다르면 값을 가져올 수 없다.)
        request.getRequestDispatcher("/step11/exam02").forward(request, response);
    }
}
