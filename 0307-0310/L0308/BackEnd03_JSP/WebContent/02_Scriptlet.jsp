<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿</title>
</head>
<body>
	<h2>스크립트릿 연습</h2>
	<%
		int A = 10;
		int B = 20;
		int sum = A+B;
		out.print(A+"+"+B+"="+sum); //기본 객체 out을 이용한 출력
	%>
</body>
</html>