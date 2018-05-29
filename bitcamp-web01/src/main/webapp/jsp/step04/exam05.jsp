<%@page import="jsp.Team"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam05</title>
</head>
<body>
<h1>객체의 프로퍼티값 꺼내기II</h1>
<pre>
- 직접 Getter를 호출하여 값을 꺼낼 수 있다.
</pre>
<%
Member member1 = new Member();
member1.setId("user01");
member1.setEmail("user01@test.com");
member1.setPassword("1111");

Member member2 = new Member();
member2.setId("user02");
member2.setEmail("user02@test.com");
member2.setPassword("1111");

Team team = new Team();
team.setName("팀1");
team.setDescription("웹 개발팀");
team.setMembers(new Member[] {member1, member2});

pageContext.setAttribute("team", team);
%>

${pageContext.getAttribute("team").getName()}<br>
${pageScope.team.name}<br>
${team.name}<br>

</body>
</html>