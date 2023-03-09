<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 로그아웃 시키기: 세션에서 속성을 지우거나, 세션을 지우거나  -->
//	<% session.removeAttribute("loginUser"); %>
	<% session.invalidate(); %>
	<script type="text/javascript">
		alert("log out 됨");
		location.href="loginForm.jsp"; //요청 주소를 이걸로 바꿔버리겠다
	</script>
</body>
</html>