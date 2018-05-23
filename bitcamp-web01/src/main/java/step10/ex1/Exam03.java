//Cookie : 한글데이터 보내기
package step10.ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex1/exam03")
public class Exam03 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        //Cookie 데이터의 조건
        // => Cookie의 데이터는 문자열만 가능하다
        // => 응답헤더로 보내기 때문에 반드시 url encoding해야한다.
        // => Tomcat9 에서는 한글데이터를 보내고 받을 수 있다.
        //    만약 9 미만 버전이나 다른 Servlet Container를 사용하는 경우
        //    한글이 깨질 수  있다.
        //    이 경우 URLEncoding하여 보낼것
        
        Cookie cookie1 = new Cookie("c1", 
                URLEncoder.encode("홍길동", "UTF-8"));
        Cookie cookie2 = new Cookie("c2",
                URLEncoder.encode("임꺽정", "UTF-8"));
    
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        
        response.setContentType("text/plain;charset=UTf-8");
        PrintWriter out = response.getWriter();
        out.println("쿠키전송완료");
        
        //
        
    }
}
