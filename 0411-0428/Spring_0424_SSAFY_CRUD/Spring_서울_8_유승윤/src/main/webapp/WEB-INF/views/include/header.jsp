<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.ssafy.user.model.dto.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet" type="text/css">

	</head>
	<body>
<nav id="nav-header">
	<%-- session에서 loginUser를 가져와서 존재 여부에 따라 로그인 폼 또는 사용자 정보를 출력한다. --%>
		<h1><a href="./index">Logo</a></h1>
	<div class="nav_login-wrapper">

		<c:if test="${empty loginUser}">
		<form method="post" action="login">
		<input type="text" name="id" placeholder="ID"> 
		<input type="password" name="password" placeholder="PASS"> 
		<input type="submit" value="SIGN IN">
		</form>
		</c:if>
		<c:if test="${!empty loginUser}">
		<div>
			<p class="greeting">${loginUser.name}님 반갑습니다! <a href="./logout" class="btn">로그아웃</a></p>
		</div>
		</c:if>
	</div>
</nav>
<script>
	// request 영역에 msg라는 이름의 attribute가 있다면 화면에 alert으로 출력한다.
	let msg = "${msg}";
	if (msg) {
		alert(msg)
	}
</script>
</body>
</html>