//로그인 폼 출력과 사용자 인증 처리 서블릿
package bitcamp.java106.pms.servlet.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.support.WebApplicationContextUtils;

@SuppressWarnings("serial")
@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet{
    MemberDao memberDao;

    @Override
    public void init() throws ServletException {
        memberDao = WebApplicationContextUtils.getWebApplicationContext(
                this.getServletContext()).getBean(MemberDao.class);
    }

    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        
        //해당 서블릿 요청하기 이전의 페이지 URL을 session에 보관
        // 이 URL은 로그인 처리후 refresh 실행시 사용
        session.setAttribute("refererUrl", request.getHeader("Referer"));
        
        //웹브라우저가 "id"라는 쿠키를 보냇으면 입력폼을 출력할 때 사용한다.
        String id = "";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for(Cookie cookie : cookies) {
                if(cookie.getName().equals("id")) {
                    id = cookie.getValue();
                    break;
                }
            }
        }


        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>로그인</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>로그인</h1>");
        out.println("<form action='login' method='post'>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("    <th>아이디</th>");
        out.printf("    <td><input type='text' name='id' value='%s'></td>\n", id);
        out.println("</tr>");
        out.println("<tr>");
        out.println("    <th>암호</th>");
        out.println("    <td><input type='password' name='password'></td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("<p><input type='checkbox' name='saveId'> 아이디 저장</p>");
        out.println("<button>로그인</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        Cookie cookie = null;
        if(request.getParameter("saveId") != null) {
            //입력폼에서 로그인시 사용한 ID를 자동으로 출력할 수 있도록
            //웹브라우저로 보내 저장시킨다.
            cookie = new Cookie("id", id);
            cookie.setMaxAge(60 * 60 * 24 * 7);
        } else { // "아이디 저장 체크박스에 체크하지 않았다면
            cookie = new Cookie("id", "");
            cookie.setMaxAge(0); //웹브라우저의 "id"라 저장된 쿠키가 있다면 제거한다. ; 유효기간을 0으로 설정함으로써 "id"라는 이름의 쿠키를 무효화
        }

        response.addCookie(cookie);
        
        Member member;
        try {
            member = memberDao.selectOneWithPassword(id, password);

            HttpSession session = request.getSession();
            
            if (member != null) {   //로그인 성공
                session.setAttribute("loginUser", member);
                
                //로그인 하기 전에 페이지로 이동
                String refererUrl = (String)session.getAttribute("refererUrl");
                session.setAttribute("refererUrl", null); // 사용 후 제거
                if(refererUrl == null) { // 이전 페이지가 없다면 메인화면으로 이동
                    response.sendRedirect(request.getContextPath()); // => 리턴 "/bitcamp-java-project"
                } else {// 이전페이지가 있다면 그 페이지로 이동
                    response.sendRedirect(refererUrl);
                }
                return;
                
            } else {
                session.invalidate();
                
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out = response.getWriter();

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta charset='UTF-8'>");
                out.printf("<meta http-equiv='Refresh' content='1;url=%s'>", 
                        request.getContextPath()+"/auth/login");
                out.println("<title>로그인</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>로그인 실패</h1>\n");
                out.println("<p>아이디 또는 암호가 일치하지 않습니다.</p>");
                out.println("</body>");
                out.println("</html>");
            }

        } catch (Exception e) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/error");
            request.setAttribute("error", e);
            request.setAttribute("title", "로그인 실패");
            requestDispatcher.forward(request, response);
        }

    }
    //웹브라우저                                                                                                     웹서버
    //GET 요청: '/bitcamp-java-project/auth/login      ===> 
    //                                                <===     로그인 폼
    //POST 요청: '/bitcamp-java-project/auth/login     ===>
    //                                                <===   redirectURL
    //GET 요청: '/bitcamp-java-project/                ===>    
    //                                                <===   index.html
}
