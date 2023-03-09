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
	Cookie[] cookies = request.getCookies();
	if(cookies != null) for(Cookie c: cookies) {
		String key = c.getName();
		String value = c.getValue();
		%>
		<h3><%=key %>:<%=value %></h3>
		<%
	}
	else out.print("설정된 쿠키가 없어용");
%>
	<h2>쿠키 설정</h2>
	<form action="make" method="GET">
		이름 : <input type="text" name="key" placeholder="키 입력"> <br>
		값 : <input type="text" name="value" placeholder="값 입력"> <br>
		<button>제출</button>
	</form>
</body>
</html>