<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="exam09_error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>exam09</title>
</head>
<body>
<h1>JSP 빌트인 객체</h1> 
<pre>
- JSP 엔진이 JSP 파일을 가지고 서블릿 클래스를 만들 때 반드시 다음 객체를 사용할 수 있도록
정의해야한다. 
HttpServletRequest  ==> request
HttpServletResponse ==> response
JSPWriter           ==> out
HttpSession         ==> session
ServletContext      ==> application
PageContext         ==> pageContext
ServletConfig       ==> config
Servlet 객체 자신           ==> page
Throwable           ==> exception

오류객체?
- 다른 서블릿에서 오류가 발생했을 때 그 오류를 처리하는 JSP는
	오류 정보를 담은 객체를 받는다.
- 바로 그 객체의 변수명이 exception이다.

errorPage 속성
- 오류발생시 forwading할 JSP 페이지를 가리킨다.
ex: errorPage="exam09_error.jsp"
	
</pre>
<%
//이 페이지에서 오류 발생
if (request.getParameter("error") != null) {
    throw new Exception("예외발생");
    
}
%>


</body>
</html>