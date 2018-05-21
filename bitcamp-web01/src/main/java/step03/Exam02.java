//한글 출력 깨짐
package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step03/exam02")
public class Exam02 extends GenericServlet {

    @Override
    public void service(
            ServletRequest request, 
            ServletResponse response) throws ServletException, IOException {
        //출력할 컨텐츠의 type(MIME Type)과 charset을 선언한다.
        response.setContentType("text/plain; charset=UTF-8");

        
        //출력스트림을 꺼낼 때 문자를 출력할 때 사용할 문자표를 지정하지 않으면 
        // 기본으로 ISO-8859-1문자표를 사용하여 문자열을 출력
        //즉 다음과 같이 클라이언트로 문자열을 보낸다
        //String(UTF-16) ==> ISO8859-1
        // 즉 String 객체의 문자열을 ISO-8859-1코드표에 따라 변환하여 클라이언트로 보낸다.
       
        PrintWriter out = response.getWriter();
        out.println("Hello");
        
        //문제는 한글
        //한글은 ISO-8859-1에 코드 명시가 되어 있지 않다.
        // 따라서 해당 코드표로 값을 바꿀수 없기 때문에 
        // '?'문자를 대신 보낸다.
        out.println("안녕하세요");
        
        //해결책
        //=> ServletResponse객체에서 출력스트림을 꺼내기 전에 사용할 문자표를 설정한다.
    }
}
//MIME(multi-purpose Internet Mail Extension)type
// 원래는 메일을 보낼 때 콘텐츠의 타입을 알려주기 위해 만들었다.
// 지금은 메일 뿐만 아니라 다방면에서 콘텐츠 타입을 지정하는 용도로 사용하고 있다.
// ex) text/html, text/plain, application/excel 등
