<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>exam01</title>
</head>
<body>
<h1>표현식(Expression element)</h1>
<pre>
[표현식(Expression element)]
- 결과를 리턴하는 자바코드를 의미한다.
    예) 변수, 계산식, 값을 리턴하는 메서드 호출 등

- 표현식이 아닌 경우
   예) 값을 리턴하지 않는 메서드 호출 등
문법
JSP 코드
&lt;%= 표현식 %>

자바코드 변환
- 위의 JSP 코드는 다음과 같이 자바 출력문으로 만든다.
out.print(표현식)
</pre>

aaa, <%= 2+3 %>, bbb, <%= System.currentTimeMillis() %>, ccc

<%= /*작성할 수 있는 자바코드는?; 넣으면 안되남... */ System.currentTimeMillis(); %>
<%--
위의 JSP 코드는 다음과같이 변환
out.print("/*작성할 수 있는 자바코드는?; 넣으면 안되남... */ System.currentTimeMillis();");
out.print(여기에(괄호안에; 출력하는 파라미터에) 넣을수 있는 자바코드를 <%= %>태그안에 작성할 것);
 --%>
</body>
</html>