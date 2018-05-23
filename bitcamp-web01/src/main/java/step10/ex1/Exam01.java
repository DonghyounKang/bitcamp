//Cookie : 클라이언트 쪽의 데이터를 보관하는 방법
package step10.ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex1/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        //Cookie 보내기
        //1) key-value 한쌍의 값을 갖는 쿠키 객체 생성
        Cookie cookie1 = new Cookie("c1", "aaa");
        Cookie cookie2 = new Cookie("c2", "123");
    
        //2) 응답 헤더에 쿠키정보를 붙인다.
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        
        response.setContentType("text/plain;charset=UTf-8");
        PrintWriter out = response.getWriter();
        out.println("쿠키전송완료");
        
        //쿠키(Cookie)
        //웹서버에서 데이터를 보내 클라이언트(웹브라우저)쪽에 일정기간 데이터를 보관하는 방법.
        //클라이언트의 상태정보를 본인 하드디스크에 저장하였다가 필요할 때 참조, 재사용 
        //웹서버에 요청할 때마다 다시 보낸다.
        //Cookie 객체를 사용한다.
        //순서
        //1. 쿠키를 생성한다.
        //2. 응답 헤더에 쿠키 정보를 붙인다.

        
        //쿠키를 클라이언트로 보내는 HTTP 프로토콜
      /*HTTP/1.1 200
        Set-Cookie: c1=aaa
        Set-Cookie: c2=123
        Content-Type: text/plain;charset=UTf-8
        Content-Length: 20
        Date: Wed, 23 May 2018 01:18:38 GMT
        (빈줄)
                내용...*/
        
    }
}
