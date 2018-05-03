//Servlet Container가 실행하는 서버프로그램
package bitcamp.java106.pms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bitcamp.java106.pms.AppConfig;
import bitcamp.java106.pms.controller.Controller;

//역할
//- 클라이언트로부터 요청이 들어오면 해당 요청을 컨트롤러에게 위임하는 역할을 수행한다.
//- Spring IOCContainer를 사용하여 컨트롤러 및 DAO 등을 관리한다.
//
@WebServlet("/*") //클라이언트의 모든 요청을 이 servlet이 처리하겠다는 선언
public class DispatcherServlet implements Servlet {

    ApplicationContext iocContainer;
    ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        // 클라이언트로부터 최초로 요청이 들어올 때 딱 한번 실행한다.
        // Servlet 실행에 필요한 자원을 준비하는 코드를 작성한다.
        this.config = config;
        
        //Spring IOC Conatainer 객체 생성
        // => 파라미터로 넘기는 값은 IOC Container 관련 설정작업을 수행하는 클래스 정보이다.
        iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
        
    }

    @Override
    public ServletConfig getServletConfig() {
        // Servlet 설정정보를 리턴하는 일을 수행 
        // => init()에서 받은 값을 보관하고 있다가 리턴
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 클라이언트로부터 요청이 들어올 때마다 Servlet Container가 호출하는 메서드
        // => 클라이언트의 요청을 처리하는 코드를 작성한다.
        
        //파라미터의 값을 원래의 객체로 형변환한다.
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)res;

        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //ServletPath(): 클라이언트가 요청한 자원의 이름을 알아낸다.
        // 클라이언트가 보낸 명령어를 처리할 컨트롤러를 찾는다.
        String path = request.getPathInfo();
        Controller controller = (Controller) iocContainer.getBean(path);
                
                if (controller != null) {
                    controller.service(
                            new ServerRequestAdapter(request), 
                            new ServerResponseAdapter(response));
                } else {
                    out.println("해당 명령을 처리할 수 없습니다.");
                }

        
    }

    @Override
    public String getServletInfo() {
        // Servlet에 대한 정보를 간단한 문자열로 리턴
        return "DispatcherServlet: 요청처리를 중계하는 servlet";
    }

    @Override
    public void destroy() {
        // 서버 종료 전에 ServletContainer가 호출한다.
        // => Servlet이 실행되는 동안 만들었던 자원을 해제하는 코드를 작성한다.
        //    ex) file, DBConnection, socket 등의 자원을 해제한다.
        
        
    }

}

// ** Tomcat Server에 프로그램 배치하기 **
// 1) 프로그램 폴더 생성
//  > 톰켓홈/webapps/pms 폴더 생성
// 2) 자바 클래스 파일을 둘 폴더를 만든다.
//  > 톰켓홈/webapps/pms/WEB-INF/classes 폴더 생성
// 3) 컴파일된 클래스 파일 및 패키지를 배치한다.
//  > *project/bin/main/* --> WEB-INF/classes로 복사
// 4) 외부 라이브러리 배치
//  > *.jar --> WEB-INF/lib/*.jar로 복사
//**주의
//*.jar 파일 복사하는 방법
// gradle을 이요하여 이클립스 설정파일을 만든경우 
// 이클립스에서 컴파일하거나 실행할 때 사용하는 외부 라이브러리는
// gradle에서 관리하는 라이브러리이다. 
//=> 이 라이브러리를 배포하려면 gradle을 통해 라이브러리를 복사해야한다.
//   > gradle build

//.war 파일
// => build.gradle에 war파일을 다루는 플러그인 장착
// => gradle build 실행하여 war 파일 생성
//.war 파일 배치
//=> war파일을 배치할 때는 그냥 >톰켓홈/webapps/폴더에 저장하면된다.

//Application 실행
//  1) TomcatServer 실행 or 재실행
//  2) webBrowser 요청
//     http://localhost:8888/pms/board/list
