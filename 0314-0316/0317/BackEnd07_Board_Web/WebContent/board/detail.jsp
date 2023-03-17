<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글상세</h2>
	<hr>
	<h3>${board.title}</h3>
	<div>
		조회수: ${board.viewCnt} <br>
		글쓴이: ${board.writer} <br>
		등록일: ${board.regDate} <br>
	</div>
	<div>
		${board.content}
	</div>
</body>
</html>