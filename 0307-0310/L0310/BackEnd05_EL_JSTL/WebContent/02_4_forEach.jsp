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
<%
	String[] movieList = {"인셉션", "타짜", "아이언맨", "해리포터", "클레멘타인"};
	pageContext.setAttribute("movieList", movieList); //이거 없으면 안된다^^
%>
<table border="1">
	<tr>
		<th>idx</th>
		<th>count</th>
		<th>title</th>
	</tr>
	<c:forEach var="movie" items="${movieList}" varStatus="status" begin="0" end="10">
	<tr>
		<td>${ status.index }</td>
		<td>${ status.count }</td>
		<td>${ movie }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>