<%@page import="java.util.ArrayList"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03_4</title>
</head>
<body>
<h1>JSP 전용 태그: useBean + type 과 class 속성 </h1>
<pre>
type과 class 속성을 모두 지정했을 때

type 
	generic 표현을 사용할 수 있다.
class
	generic 표현을 사용할 수 없다.
</pre>
<%
Member obj = new Member();
obj.setId("홍길동");
obj.setEmail("hong@test.com");
obj.setPassword("1111");

Member obj2 = new Member();
obj2.setId("홍길동");
obj2.setEmail("hong@test.com");
obj2.setPassword("1111");

ArrayList<Member> arr = new ArrayList();
arr.add(obj);
arr.add(obj2);

pageContext.setAttribute("list", arr);
%>
<h2>type과 class 속성을 동시에 설정하기</h2>
<jsp:useBean id="list"
	type="java.util.List<Member>" 
	class="java.util.ArrayList"></jsp:useBean>
<%--
//type 속성값은 변수 선언 시 사용
java.util.List<Member> list = 
	(java.util.List<Member>)pageContext.getAttribute("member")
if(list == null) {
//class 속성 값은 객체 생성 시 사용
	list = new java.util.ArrayList<>();
	pageContext.setAttribute("list", list);
}
 --%>
<%
for (Member member : list) {
%>
아이디:<%=member.getId() %><br>
이메일:<%=member.getEmail() %><br>
암호:<%=member.getPassword() %><br>
<%} %>

</body>
</html>







