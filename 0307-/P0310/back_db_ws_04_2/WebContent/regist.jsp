<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <fieldset>
      <legend>영화 정보 입력</legend>
      <form action="main" method="POST">
      	<input type="hidden" name="action" value="list" />
        <label for="title">
          <span>제목</span>
          <input type="text" id="title" name="title" />
        </label>
        <br />
        <label for="director">
          <span>감독</span>
          <input type="text" id="director" name="director" />
        </label>
        <br />
        <label for="genre">
          <span>장르</span>
          <input type="text" id="genre" name="genre" />
        </label>
        <br />
        <label for="runningTime">
          <span>상영시간</span>
          <input type="text" id="runningTime" name="runningTime" />
        </label>
        <br />
        <input type="submit" value="등록하기" />
        <input type="submit" value="초기화" />
      </form>
    </fieldset>
  </body>
</html>
