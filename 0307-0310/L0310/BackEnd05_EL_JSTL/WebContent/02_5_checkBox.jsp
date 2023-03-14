<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>반찬 고르기</h2>
<form action="02_6_checkBoxResult.jsp">
	<input type="checkbox" name="dish" value="맥주"> 맥주
	<input type="checkbox" name="dish" value="교수님의 사랑"> 교수님의 사랑
	<input type="checkbox" name="dish" value="미나리"> 미나리  <br>
	<input type="checkbox" name="dish" value="장조림"> 장조림
	<input type="checkbox" name="dish" value="삼겹살"> 삼겹살
	<input type="checkbox" name="dish" value="시래깃국"> 시래깃국  <br>
	<button>구 매</button>
</form>
</body>
</html>