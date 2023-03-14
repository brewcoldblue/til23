<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(session.getAttribute("loginUser") == null) response.sendRedirect("loginForm.jsp");
		else
	%>
		<%=session.getAttribute("loginUser")%>님 반갑습니다.
	<form action="Logout.jsp" method="POST">
		<button>ㅂㅂ</button>	
	</form>		
	<h3>메인페이지</h3>
</body>
</html>