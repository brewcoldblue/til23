<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="mvc/upload/${fileName}">${fileName}</a>
	<!-- contextRoot는 위처럼 직접 적지 말고 아래처럼 적읍시다. -->
	<img src="${pageContext.request.contextPath}/upload/${fileName}" />
	<a href="download?fileName=${fileName }">${fileName} Download</a>
	
	<h2>파일 여러개</h2>
	<c:forEach items="${list}" var="fileName">
	
		${fileName} <br>
	
	</c:forEach>
</body>
</html>