<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>exam09_error</title>
</head>
<body>
<h1>오류처리 jsp</h1> 
<pre>
오류를 처리할 목적으로 만든 JSP페이지는 다음과 같이
page 지식 태그에 속성을 추가해줘야한다.

==> isErrorPage="true"

이 속성이 추가되면 오류정보를 저장하고 있는 exception이라는 Throwable타입의 빌트인 객체가 추가된다.
</pre>

<%-- 다른 서블릿에서 이 페이지를 실행한다면, exception이라는 변수에 그 예외 정보가 들어있을 것이다. --%>
<%=exception %>
</body>

</html>