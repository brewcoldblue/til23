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
			
			<form action="search" class="row">
				<div class="col-2">
					<label>정렬 기준: </label>
					<select name="key" class="form-select">
						<!-- .../search?key="..."&writer="..."... -->
						<option value="none">없음</option>
						<option value="writer">글쓴이</option>
						<option value="title">제목</option>
						<option value="content">내용</option>
					</select>
				</div>
				<div class="col-5">
					<label>검색 내용</label>
					<input type="text" name="word" class="form-control">
				</div>
				<div class="col-2">
					<label>정렬 방향</label>
					<select name="orderBy" class="form-select">
						<option value="none">없음</option>
						<option value="writer">글쓴이</option>
						<option value="title">제목</option>
						<option value="content">내용</option>
						<option value="view_cnt">저 그 뭐더라</option>
					</select>
				</div>
				<div class="col-2">
					<label>정렬 방향</label>
					<select name="orderByDir" class="form-select">
						<!-- .../search?key="..."&writer="..."... -->
						<option value="asc">오름차순</option>
						<option value="desc">내림차순</option>
					</select>
				</div>

				<div class="col-1">
					<input type="submit" value="검색" class="btn btn-primary">
				</div>
			</form>
			
			<div class="d-flex justify-content-end">
				<a href="writeform" class="btn btn-outline-primary">글 쓰 기</a>
			</div>
		</div>
	</div>
</body>
</html>