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
	<c:forTokens var = "city" items="서울. 대전, 구미. 광주, 부울경" delims=",">
	${city} <!-- 서울.대전 구미.광주 부울경 -->
	</c:forTokens>
	
	<c:forTokens var = "city" items="서울. 대전, 구미. 광주, 부울경" delims=",.">
	${city} <!-- 서울 대전 구미 광주 부울경 -->
	</c:forTokens>
</body>
</html>