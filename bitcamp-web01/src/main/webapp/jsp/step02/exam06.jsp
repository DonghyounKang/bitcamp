<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"
    import="java.net.Socket"
    import="java.net.ServerSocket,java.io.File"
    trimDirectiveWhitespaces="true"
    buffer="1kb"
    autoFlush="false"%>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.FileWriter" %>
<%@ page import="java.io.FileInputStream,java.io.FileOutputStream" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>exam06</title>
</head>
<body>
<h1>지시문(directive element) : page</h1> 
<pre>
[지시문(directive element)]
- 지시문의 특성에 따라 적절한 자바 코드를 생성한다. 

문법
[JSP 코드]
&lt;%@ page 속성명 = "값" %>

[laguage 속성]
- 스크립트릿이나 표현식, 선언문 등의 태그 안에 코드를 작성할 때 사용할 언어를 지정한다.
- 현재는 java 언어만 가능하다.
- JSP를 만들 당시에 JSP 페이지를 작성할 때 Java 언어 외에 다른 언어를 사용할 것을 대비해서 
  laguage라는 속성을 만들었다.
  초창기에는 여러 JSP 페이지에 다른 언어를 삽입하려는 여러시도가 있었다.
  지금은 Java만 넣는다.
  그래서 language 속성의 값으로는 'java'만 가능하다.
  생략해도 상관없다.

[contentType 속성]
- response.setContenetType()

[pageEncoding 속성]
- JSP 페이지 저장할 때 사용한 문자표(charset)를 지정한다.
- JSP 엔진이 JSP 파일을 읽을 때 이 속성에 지정된 charset을 사용하여 읽는다.
- 생략해도 된다.

[import 속성]
- Java import문 생성

[trimDirectiveWhitespaces]
- 값이 true이면 지시문 사이에 있는 공백(white sapce : 스페이스, 탭, 줄바꿈)을 제거

[buffer 속성]
- 출력버퍼의 크기를 지정한다.
- 기본값 : 8kb 즉 8196바이트를 초과하면 autoFlush 정책에 따라 처리된다.

[autoFlush 속성]
- 기본값은 true이다.
- 즉 버퍼가 차면 바로 클라이언트로 출력한다. 
- false로 설정 시 버퍼가 꽉찼을 때 오류가 발생한다.

</pre>

</body>
</html>
