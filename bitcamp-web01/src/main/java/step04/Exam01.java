//GET 요청과 POST 요청의 HTTP Protocol 비교
package step04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step04/exam01")
public class Exam01 extends GenericServlet {
    private static final long serialVersionUID = 1L;

    //test 방법 
    //http://localhost:8888/bitcamp-web01/step04/exam01_test.html실행
    @Override
    public void service(
            ServletRequest request, 
            ServletResponse response) throws ServletException, IOException {
        
        //클라이언트가 보낸 값을 꺼낼때는 GET, POST 구분없이 동일한 방법으로 값을 꺼낸다.
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        
        //UTF-16 => UTF-8
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.printf("name=%s\n", name);
        out.printf("age=%d\n", age);
    }
}

//HTTP 프로토콜 : GET요청
//request-URI에 데이터를 포함해서 보낸다.
//  => URL?파라미터명=값&파라미터명=값&파라미터명=값.....
// ex)  /bitcamp-web01/step04/exam01?name=aaa&age=20
/*
*GET /bitcamp-web01/step04/exam01?name=aaa&age=20 HTTP/1.1 <== request-line
*Host: localhost:8888 <== header(general/request/entity)
*Connection: keep-alive
*Pragma: no-cache
*Cache-Control: no-cache
*Upgrade-Insecure-Requests: 1
*User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36
*Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,/*;q=0.8
*Referer: http://localhost:8888/bitcamp-web01/step04/exam01_test.html
*Accept-Encoding: gzip, deflate, br
*Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
*(빈줄) <== empty line ; 서버에 보낸 데이터가 끝났음을 의미한다.
*/

//HTTP 프로토콜 : POST요청
//- message-body(entity-body)에 데이터를 포함해서 보낸다.
//- post 요청 할 때 보내는 데이터의 정보를 추가한다.
//  즉 content-Length와 content-Type를 추가하여 보낸다.
/*
POST /bitcamp-web01/step04/exam01 HTTP/1.1 <== request-line
Host: localhost:8888 <== header(general/request/entity)
Connection: keep-alive
Content-Length: 15 <==post 요청시 보내는 header 값(빈줄 다음에 읽어야할 바이트 수)
Pragma: no-cache
Cache-Control: no-cache
Origin: http://localhost:8888
Upgrade-Insecure-Requests: 1
Content-Type: application/x-www-form-urlencoded <==post 요청시 보내는 header 값
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*;q=0.8
Referer: http://localhost:8888/bitcamp-web01/step04/exam01_test.html
Accept-Encoding: gzip, deflate, br
Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
(빈줄) <== empty line
name=ccc&age40 <== post 요청은 빈줄 다음에 데이터를 보낸다.
*/

//GET VS POST
//[GET]
//  - URL에 데이터가 포함되기 때문에 binaryData를 보낼 수 없다.
//    바이너리 데이터를 BASE64(텍스트) 형식으로 변환하여 보낼 수는 있다.
//  - 대용량 데이터 전송 불가능
//    대부분의 웹 서버는 request-line 및 header의 최대 크기를 8192(8kb)로 제한 되어있다. 
//    => 파일 업로드나 게시글 등록, 변경에는 GET요청 사용하지 않는다.
//  - URL에 데이터가 포함되기 때문에 보내는 데이터가 타인에게 노출
//  - 보안에 취약
//    => 로그인 데이터 전송시 GET방식을 사용하지 않는다.
//  - URL과 값을 동시에 보낼 때 유용하다.
//    => URL에 값이 포함되기 때문
//      ex) 검색을 요청하는 URL일 경우 
//  - 즐겨찾기에 저장할 수 있으며 방문 내역 등에 자동으로 저장될 수 있다.
//      => 그래서 더더욱 로그인에서 GET을 사용하면 안된다.
//
//
//[POST]
//  - 멀티파트 형식으로 binaryData(이미지 등)를 보낼 수 있다.
//  - 대용량 데이터 전송가능
//    빈줄 다음에 데이터를 보내기 때문에 데이터의 크기에 제한이 없다.
//    서버쪽에서 허용하는 만큼 보낼 수 있다.
//    => 파일 업로드나 게시글 등록, 변경에 주로 사용
//  - 보내는 데이터가 URL에 노출되지 않는다.
//    => 로그인 값을 보낼 때 이 방식을 사용한다.
//  - 즐겨찾기에 저장하거나 방문기록에 저장된것은 무효하다
//    => 왜? URL만 저장되기 때문이다.(데이터가 포함되어 있지 않기 때문)
//    => 게시물, 검색 결과 등 의 데이터 조회 결과를 출력하는 URL을 저장시 적합하지 않다. 
//
//Base64 : 바이너리 데이터를 텍스트로 변환하여 전송할 때 사용한다.
//          바이너리 데이터를 ASCII 코드의 문자로 변환하는 방식
//          이렇게 텍스트로 만든 데이터를 OS, 프로그래밍 언어, 네트워크 프로토콜에 상관없이
//          언제든 주고받을 수 있다는 장점이 있다. 
