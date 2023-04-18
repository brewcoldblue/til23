<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>fileupload</h2>
	<!-- multipartResolver을 추가해놨기 때문에 enctype 설정 -->
	<form action="upload" method="POST" enctype="multipart/form-data">
		<input type="file" name="upload_file">
		<input type="submit" value="파일 업로드">
	</form>
	<br>
	<h2>파일 여러개 올리기</h2>
	<!-- 여러 파일을 올려용 -->
	<form action="upload2" method="POST" enctype="multipart/form-data">
		<input type="file" name="upload_files" multiple="multiple">
		<input type="submit" value="파일 업로드">
	</form>
</body>
</html>