//servlet 만들기
package step01;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//=> javax.servlet.Servlet 규칙에 따라 클래스를 만들어야 한다.
//=> Servlet 인터페이스
//      호출자? 즉 이 규칙에 따라 호출하는 자는 누구?
//       - Servlet Container 
//          ex) TomcatServer
//=> 일반적으로 실행할 수 잇는 자바 클래스를 만들 듯이 main() 메서드를 만들어봐야 소용없다.
//=> 서블릿 컨테이너가 호출하는 클래스이기 때문에
//   서블릿 컨테이너가 호출하는 메서드를 갖는 클래스를 만들어야 한다.
//=> 서블릿 컨테이너가 어떤 메서드르 호출할 지 이미 규칙으로 정의되어 있다.
//   그 규칙이 Servlet interface이다.
//
// 이렇게 만든 서블릿을 실행하려면 서블릿 컨테이너에 등록해야한다.
//@WebServlet(“실행할 때 사용할 이름”)
// 실행할 때 사용할 이름
//  -root경로(/)로 시작
//  -웹브라우저에서 요청할 때 사용할 이름
//  -파일 경로 처럼 중간에 (/)를 사용하여 이름을 길게 지을 수 있다.
//   ex) /member/list , team/member/list

//웹브라우저에서 이 서블릿의 실행을 요청하는 방법
//주소창에 다음 형식으로 URL 입력
// => http://서버주소:포트번호/웹어플리케이션이름/서블릿이름
//    http://localhost:8888/bitcamp-web01/step01/exam01
@WebServlet("/step01/exam01")
public class Exam01 implements Servlet {
    ServletConfig config;
    
    public Exam01() {
        System.out.println("Exam01()");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        // 객체 생성후 호출 된다.
        // => 서블릿이 작업하는 데 필요한 자원을 준비시키는 코드를 여기에 두면된다.
        this.config = config;
        System.out.println("Exam01.init()");
    }
    
    @Override
        public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
            // 클라이언트가 이 서블릿의 실행을 요청할 때마다 호출
            //=> 서블릿이 해야할 일을 처리하는 코드를 여기에 둔다.
            System.out.println("Exam01.service()");
    }
    
    @Override
    public void destroy() {
        // 웹 어플리케이션을 멈추거나 서블릿 컨테이너를 종료할 때 호출
        // => init()에서 준비한 자원을 해제시키는 코드를 여기에 둔다.
        System.out.println("Exam01.destroy()");
    }
    
    @Override
    public String getServletInfo() {
        // 서버 관리자 메뉴에서 서블릿에 대한 간단한 정보를 출력하려 할 때 호출
        // => 서블릿에 대한 간단한 정보를 리턴한다.
        return "Exam01 servlet";
    }

    @Override
    public ServletConfig getServletConfig() {
        // 서블릿 프로그래밍을 하면서 서블릿에대한 설정정보가 필요할 때 호출
        // => init()에서 파라미터로 받은 객체를 그대로 리턴한다.
        return this.config;
    }
}
