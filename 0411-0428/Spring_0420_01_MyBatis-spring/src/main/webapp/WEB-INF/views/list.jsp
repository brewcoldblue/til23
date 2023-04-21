<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="./bootstrap.jsp" %>
</head>
<body>
	<div class="container">
		<h2>게시글</h2>
		<hr>
		<div>
			<table class="table">
				<thead>
					<tr>
						<th>아이디</th>
						<th>제목</th>
						<th>글쓴이</th>
						<th>조회수</th>
						<th>작성일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="board"> 
					<tr>
						<td>${board.id }</td>
						<td><a href="detail?id=${board.id }">${board.title }</a></td>
						<td>${board.writer }</td>
						<td>${board.viewCnt }</td>
						<td>${board.regDate }</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="d-flex justify-content-end">
				<a href="writeform" class="btn btn-outline-primary">글 쓰 기</a>
			</div>
		</div>
	</div>
</body>
</html>