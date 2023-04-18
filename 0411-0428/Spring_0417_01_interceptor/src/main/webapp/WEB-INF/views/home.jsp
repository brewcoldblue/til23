<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<P>  The time on the server is ${serverTime}. </P>
<a href="regist.jsp">regist.jsp로 가자</a>

<c:choose>
	<c:when test="${empty id}">
		<a href="login">로그인 페이지</a>
	</c:when>
	<c:otherwise>
		${id} 님 반갑습니다.
	</c:otherwise>
</c:choose>

</body>
</html>
