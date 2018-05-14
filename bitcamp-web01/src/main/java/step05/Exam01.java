//파일 업로드
package step05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//웹브라우저에서 파일을 보낼 때 POST 방식으로 보내기 때문에 서블릿에서는
// POST요청을 처리해야한다.
// 그래서 HttpServlet을 상속받아 만들고
// doPost()를 재정의한다.
@WebServlet("/step05/exam01")
public class Exam01 extends HttpServlet{
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        //test 방법 
        //http://localhost:8888/bitcamp-web01/step05/exam01_test.html실행
        
        //POST 요청으로 전송되는 데이터의 문자표를 서블릿 컨테이너에 알려준다.
        //이렇게 알려줘야지만 getParameter()를 호출할 때 UTF-8을 UTF-16으로 변환할 것이다.
        request.setCharacterEncoding("UTF-8");
        
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String photo = request.getParameter("photo");
        

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("이름=%s\n", name);
        out.printf("나이=%s\n", age);
        out.printf("사진=%s\n", photo);
        
        //출력 결과를 보면 name, age, photo의 값이 null이다.
        // 이유?
        //      - multipart/form-data 형식으로 전송된 데이터는
        //          일반적인 방식으로 값을 꺼낼수 없다.
        //      - 즉 request.getParameter()를 사용하여 값을 꺼낼수 없다.
        // 해결책
        //      - multipart형식을 분석하여 값을 추출
        // 개발자가 직접?
        //      - NO , 이미 이런작업을 수행하는 오픈소스 라이브러리가 있다.
        //          해당 라이브러리를 사용할 것
        //      ==> apache라이브러리를 사용할 것
    }
}

//multipart/form-data 형식으로 데이터를 보낸 POST 요청
//- 보내는 데이터를 파트별로 분리하여 보낸다.
//- 파트와 파트의 구분자는 Content-Type 헤더에 정의되어있다.
//  서버는 이 구분자를 사용하여 파트를 식별한다.
// - 서블릿에서 멀티 파트로 전송된 값을 꺼내려면 별도의 라이브러리를 사용할 것
//
/*
POST /bitcamp-web01/step05/exam01 HTTP/1.1
Host: localhost:8888
Content-Length: 190519
Cache-Control: max-age=0
Origin: http://localhost:8888
Upgrade-Insecure-Requests: 1
Content-Type: multipart/form-data; boundary=----WebKitFormBoundary8Mu480rckHbBr403
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,...
Referer: http://localhost:8888/bitcamp-web01/step05/exam01_test.html
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
Connection: keep-alive

------WebKitFormBoundary8Mu480rckHbBr403    <= 경계선
Content-Disposition: form-data; name="name"

홍길동
------WebKitFormBoundary8Mu480rckHbBr403    <= 경계선
Content-Disposition: form-data; name="age"

20
------WebKitFormBoundary8Mu480rckHbBr403    <= 경계선
Content-Disposition: form-data; name="photo"; filename="test.png"
Content-Type: image/png


�PNG

......
------WebKitFormBoundary8Mu480rckHbBr403--    <= 마지막 경계선
*/
