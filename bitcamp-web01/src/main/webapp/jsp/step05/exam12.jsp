<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam12</title>
</head>
<body>

<h1>JSTL - c:import</h1>
<pre>
- HTTP요청을 수행하고 그 결과를 저징하는 태그
    &lt;c:import url="URL" var="값을 저장할 때 사용할 이름" scope="저장소">
    &lt;c:import>
- 목록에서 꺼낸 값은 PageContext 보관소에 저장된다.
</pre>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Http를 요청을 수행한 후 그 결과를 가져오기</h2>
<c:url value="http://m.zdnet.co.kr/news_view.asp" 
	   var="url1" 
	   scope="page">
	<c:param name="article_id" value="20180528085226"/>
	<c:param name="lo" value="z36"/>
</c:url>
<c:import url="${url1 }" var="result" scope="page"/>
<textarea rows="15" cols="80">${pageScope.result }</textarea>

</body>
</html>





