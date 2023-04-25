<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 사용자 관리</title>

</head>
<body>
	<%@ include file="include/header.jsp"%>
	<main>
		<h1>사용자 목록</h1>
		<div class="menus">
		<a href="./index" class="btn">홈으로</a>
		<a href="./regist" class="btn">추가등록</a>
		</div>
		
		<%-- request 영역에 users로 등록된 리스트를 반복문을 이용해 출력한다. --%>

			<div class="user_list-wrapper">
				<c:forEach items="${users }" var="user" varStatus="vs">
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
				</c:forEach>
			</div>

	</main>
</body>
</html>