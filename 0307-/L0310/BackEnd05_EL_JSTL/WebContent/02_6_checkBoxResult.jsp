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
	<h2>반찬?</h2>
	<c:forEach items="${paramValues.dish}" var="p" varStatus="status">
		<c:if test="${not status.last}">${p},</c:if>
		<c:if test="${status.last}">${p}</c:if>
	</c:forEach>
</body>
</html>