<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 스크립트릿 -->
	<% out.print("Hello"); %>
	<br>
	<!-- 표현식 -->
	<%= "Hello" %>
	<br>
	<!-- EL -->
	<h3>EL</h3>
	문자열: ${"Hello"} <br>
	정수형: ${1127} <br>
	실수형: ${0.0035} <br>
	논리형: ${false} <br>
	null: ${null} (아무것도 찍히지 않는다)<br>
	
	<h3>연산</h3>
	5+2: ${5+2}  <br>
	<!-- 5 div 2: ${5 div 3}  <br> -->
	5 mod 2: ${5 mod 2}  <br>
	empty null: ${empty null}  <br>
	5 gt 2: ${5 gt 2}  <br>
	
	<% pageContext.setAttribute("userInfo", "SY"); %>
	<% pageContext.getAttribute("user"); %> <!-- 스크립트릿에서는 null이 문자열로 뜬다 -->
	<h3>JSP 기본 객체 사용 가능</h3>
	page: ${pageScope.userInfo}   <br>
	request: ${requestScope.userInfo} <br>
	sessionScope: ${sessionScope.userInfo} <br>
	applicationScope: ${applicationScope.userInfo} <br>
	(property name) ${userInfo} 도 가능한데 이렇게 쓰면 page > request > session > application 순으로 객체를 찾는다.
	
	<h3>요런 것도 가능</h3>
	param.id로 파라미터에 있는 key가 id인 값 받아오기 ${param.id} <br> 쿼리스트링을 직접 작성하면 나오게 할 수 있다 <br>
	== : <%= request.getParameter("id") == "ssafy" %> <br>
	equals() : <%= request.getParameter("id").equals("ssafy") %> <br> 
	== (EL) : ${param.id == "ssafy"} 
	eq (EL) : ${param.id eq "ssafy"}
</body>
</html>