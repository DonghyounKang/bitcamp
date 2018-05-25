<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>exam01</title>
</head>
<body>
<h1>Jsp 주석</h1>
<pre>
JSP 엔진이 자바 소스 파일을 만들때 무시한다
주의!
HTML 주석과 착가하지말라!
</pre>
<%-- 
JSP 주석이다. 이안에 작성하는 모든내용은 JSP 엔진이 무시한다.
<p> 오호라.. 이 태그 무시된다
 --%>
 
 <!--  
 HTML 주석이다. JSP 이것도 출력 내용으로 간주한다.
 따라서 클라이언트로 출력한다.
  -->
</body>
</html>