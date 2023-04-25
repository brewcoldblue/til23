<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>SSAFY BOARD</title>
  </head>
  <body>
    <%@ include file="include/header.jsp"%>
    <main>
    <div class="user_index-wrapper">
      <h1>게시판을 이용하려면 로그인해야 해요.</h1>
      <div class="user_index-menus">
        <a href="./board" class="btn">게시판</a>
        <a href="./regist" class="btn">사용자 등록</a>
        <a href="./list" class="btn">사용자 목록</a>
      </div>
    </div>
    </main>
  </body>
</html>
