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
	<c:catch var="errmsg">
		예외발생 전만 출력이 되어요<br>
		<%=1/0 %>
		예외발생 후는 출력이 안돼용
	</c:catch>
	${ errmsg } ←여기 어떤 exception인지 나옴.
</body>
</html>