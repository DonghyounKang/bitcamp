//session : 생성
package step10.ex3;

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
@WebServlet("/step10/ex3/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        //1) session 생성
        HttpSession session = request.getSession();
        
        //2) session에 값 저장
        // => 서버쪽에 저장하는 것이기 때문에 어떤 값이라도 저장할 수 있다.
        //    즉 문자열 외에 숫자, 객체 모두 저장 가능
        
        session.setAttribute("s1", "aaa");
        session.setAttribute("s2", "100"); //autoBoxing 수행하여 객체로 변환한 후 저장
        session.setAttribute("s3", new Date());
        
        response.setContentType("text/plain;charset=UTf-8");
        PrintWriter out = response.getWriter();
        out.println("create session & input value");
        out.println("transfer session id to Cookie");
        
//Session 생성
// - getSession() 호출하면
//   우선 웹 브라우저가 보낸 쿠키 중에서 session ID가 있는지 확인한다.
//   만약 없다면 새 Session(HttpSession)을 생성한 후 그 session객체를 리턴한다.
//   있다면 기존 session 객체를 리턴한다. 
//- 응답할 때 새로 생성한 세션 객체의 아이디를 웹브라우저로 쿠키에 담아 전달한다.
//  HTTP응답 프로토콜 예:
//        HTTP/1.1 200
//        Set-Cookie: JSESSIONID=D581376410670EB31B4E16228E9DCDE1; Path=/bitcamp-web01; HttpOnly
//        Content-Type: text/plain;charset=UTf-8
//        Content-Length: 61
//        Date: Wed, 23 May 2018 05:22:57 GMT
    }
}
