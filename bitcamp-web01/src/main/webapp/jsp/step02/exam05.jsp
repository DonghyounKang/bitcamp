<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>exam05</title>
</head>
<body>
<h1>선언문(declaration element)</h1> 
<pre>
[선언문(declaration element)]
- 서블릿 클래스 생성시 멤버(클래스 / 인스턴스 변수나 클래스 / 인스턴스 메서드, 스테틱 블록 / 인스턴스 블록)를
추가하고 싶을 때 사용

문법
[JSP 코드]
&lt;%! 클래스에 삽입할 변수, 메서드, 블록 선언문 %>

[자바코드] 변환
- 위의 태그안에 작성한 자바코드는 그래도 클래스 블록안에 복사된다.
_jspService() 메서드 밖에 복사된다.
</pre>

aaa
<%! int i = 10; %>
bbb
<%! public void m() {} %>
ccc
<%!
	static {
    	System.out.println("okok");
}
%>
ddd<br>
<p>10 + 20 = <%=plus(10, 20)%> </p>
<%-- 
      out.write("<p>10 + 20 = ");
      out.print(plus(10, 20));
      out.write(" </p>\n");
--%>
</body>
</html>
<%!
private int plus(int a, int b) {
    return a + b;
}
%>
