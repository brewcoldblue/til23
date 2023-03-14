<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Hello SSAFY" />
	<c:set var="msg" value="hello1" />
	${msg} <br>
	
	<!-- 이런 것도 가능 -->
	<c:set var="msg2">hello2</c:set>
	${msg2} <br>
	
</body>
</html>