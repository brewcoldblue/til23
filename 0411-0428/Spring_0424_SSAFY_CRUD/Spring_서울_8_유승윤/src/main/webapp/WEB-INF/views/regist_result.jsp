<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 등록 결과</title>

</head>
<body>
<%@ include file="include/header.jsp"%>

	<main>
		<h2>사용자가 등록되었어요.</h2>
		<div class="menus">
			<a href="./index" class="btn">홈으로</a>
			<a href="./regist" class="btn">추가등록</a>
			<a href="./list" class="btn">사용자 목록</a>
		</div>
		<div class="user_result-wrapper">
			<div class="user_card">
						<div class="imgContainer">
						<c:choose>
						<c:when test="${not empty user.img}">
						<img class="profile" src="${pageContext.servletContext.contextPath}/resources/upload/${user.img }">
						</c:when>
						<c:otherwise>
						<div class="placeholder"></div>
						</c:otherwise>
						</c:choose>
						</div>
						<div class="userinfo">
						<h4 class="userinfo_content_dept">${user.department_code}</h4>
						<h3 class="userinfo_content_name">${user.name } (${user.age}세)</h3>
						<h4 class="userinfo_content_id">${user.id }</h4>
						<h5 class="userinfo_content_email">${user.email }</h5>
						</div>
					</div>
		</div>
	</main>
</body>
</html>