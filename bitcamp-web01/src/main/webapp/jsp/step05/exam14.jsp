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
<title>exam14</title>
</head>
<body>

<h1>JSTL - fmt:parseDate</h1>
<pre>
- 문자열을 입력받아 분석하여 java.util.Date 객체 생성하는 태그
    &lt;fmt:parseDate 
    	value="날짜를 표현하는 문자열 ; 예) 2018-05-28" 
    	pattern="입력값의 형식 지정 ; 예) yyyy-mm-dd" 
    	var="생성한 Date 객체를 저장할 때 사용할 이름"
    	scope="저장소"/>
</pre>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h2>다양한 형식의 문자열을 가지고 java.util.Date 객체 생성</h2>

<c:choose>
	<c:when test="${param.type ==1 }">
		<fmt:parseDate value="${param.date }" pattern="yyyy-MM-dd" var="d1"/>
	</c:when>
	<c:when test="${param.type ==2 }">
		<fmt:parseDate value="${param.date }" pattern="MM/dd/yyyy" var="d1"/>
	</c:when>
	<c:otherwise>
		<c:set var="d1" value="유효한 형식이 아닙니다."/>
	</c:otherwise>
</c:choose>

닐찌 = ${d1}<br>

</body>
</html>




