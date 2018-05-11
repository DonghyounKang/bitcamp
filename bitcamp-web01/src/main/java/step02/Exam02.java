// 서블릿을 서블릿 컨테이너에 등록하기 : XML 파일에 설정하는 방법
package step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//애노테이션이 등장하기 전에는 XML 파일에 서블릿 클래스 정보 등록
//  /WEB-INF/web.xml
//web.xml은 웹 어플리케이션의 배치정보를 담고 있는 파일이다.
//그래서 "Deployment Descriptor File(DDFile)"이라 부른다.
//
public class Exam02 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.println("step02.Exam01.service()");
    }
    
}
