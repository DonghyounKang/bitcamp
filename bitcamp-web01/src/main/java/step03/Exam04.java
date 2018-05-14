//GET 요청 파라미터의 값이 한글일 경우 깨지는 현상 해결
package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step03/exam04")
public class Exam04 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void service(
            ServletRequest request, 
            ServletResponse response) throws ServletException, IOException {
        
        // Tomcat7이하 버전의 경우 URL에 한글이 있을 때 
        // GET요청으로 한글 문자열을 파라미터로 보낼 경우 
        // 서버에서 꺼내면 한글이 깨진다.
        // ex)http://localhost:8888/test01/step03/exam04?name=홍길동&age=20
        //이유?
        //  웹브라우저 : 
        //      1) URL에 입력한 값(UTF-8) : "AB가각"(4142EAB080EAB081)
        //      2) URL encoding : "4142%EA%B0%80%EA%B0%81
        //  TomcatServer :
        //      3) URL decoding :"AB가각"(4142EAB080EAB081)
        //          - UTF-8은 자바내부에서 사용하지 않는다.
        //          - 자바의 String 객체는 UTF-16을 사용한다.
        //      4) String 객체(UTF-16) : 0041 0042 00ea 00b0 0080 0041 0042 00ea 00b0 0081
        //          - 각 바이트를 UTF-16으로 변환
        //          - 클라이언트가 보낸 데이터가 어떤 charset로 만든 데이터인지 알려주지 않으면
        //            무조건 ISO-8859-1(ISO-latin-1)이라고 가정하여 '0x00' 1바이트를 붙인다.
        //          - 영어인 경우에는 앞에 0x00을 붙이면 UTF-16이기 때문에 아무런 문제가 없다.
        //          - 그러나 한글의 경우 UTF-8 각 바이트에 그냥 0x00을 붙이면
        //            올바르지 않은 UTF-16코드가 되기 때문에 출력할때 이상한 글자가 보이는 것이다.
        // 해결책
        //  POST 명령으로 보낸 데이터의 경우
        // => 최초로 값을 꺼내기 전(getParameter()를 최초로 호출하기 전)에
        //    클라이언트가 보낸 문자가 어떤 charset으로 되어있는지 알려줘야 한다.
        // => 즉 클라이언트가 보낸 문자가 어떤 문자코드로 되어있는지 알려줘야한다.
        //      UTF-8:"AB가각"(41 42 ea b0 80 ea b0 81)
        //      String 객체(UTF-16): "AB가각" (0041 0042 AC00 AC01)
        //  GET 명령으로 보낸 데이터의 경우
        //  => server.xml 설정파일에서 다음과 같이 태그에 URLEncoding 속성 추가
        //      <Connector connectionTimeout="20000" 
        //          port="8888" 
        //          protocol="HTTP/1.1" 
        //          redirectPort="8443"
        //          URIEncoding="UTF-8"/>
        // 단 Tomcat8이상부터는 server.xml에 위와 같이 편집할 필요가없다.
        // GET요청으로 보낸 UTF-8데이터는 UTF-16으로 문제없이 변환된다.
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        response.setContentType("text/plan; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("이름=%s\n", name);
        out.printf("나이=%d\n", age);
    }
}
