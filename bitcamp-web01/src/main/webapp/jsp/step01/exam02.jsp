<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>exam02</title>
</head>
<body>
<h1>exam02</h1>
<h2>자동 생성된 JAVA 클래스</h2>
<pre>
[JSP 엔진]
- '.jsp' 파일을 가지고 '.java' 서블릿 클래스를 만드는 일을 한다.
- 그래서 .jsp 파일을 템플릿 파일(template file)이라고 부른다.

[JSP 엔진이 JAVA 소스 클래스를 만들 때 규칙]
- HttpJspPage 인터페이스를 구현해야한다.
- 클라이언트 요청이 들어왔을 때 _jspService()가 호출되게 해야한다.

[HttpJspPage 인터페이스의 상속도]
HttpJspPage		===>		JspPage		===>	Servlet
					jspInit()		init()
					jspDestroy()		destroy()
_jspService()		    		service()		service()
								getServletInfo()
								getServletConfig()
													
[Tomcat이 JSP를 가지고 서블릿클래스를 만들때 구성도]
my.jsp
  ===> my_jsp
    ===> HttpJspBase 상속
      ===> HttpJspPage 구현
         ===> HttpServlet 상속
	</pre>
</body>
</html>