<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="com.ssafy.ws.step2.dto.Movie" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>SSAFY 영화 관리</title>
  </head>
  <body>
    <% ArrayList<Movie> movies = (ArrayList<Movie>) session.getAttribute("movie"); %>
    <h1>SSAFY 등록된 영화</h1>
    <h3>지금까지 등록된 영화: ${movies.size()}개</h3>
    <table border="1">
      <thead>
        <tr>
          <th>제목</th>
          <th>감독</th>
          <th>장르</th>
          <th>상영시간</th>
        </tr>
      </thead>

      <c:forEach items="${movies}" var="movie">
        <tr>
	        <td>${movie.getTitle()}</td>
	        <td>${movie.getDirector()}</td>
	        <td>${movie.getGenre()}</td>
	        <td>${movie.getRunningTime()}분</td>
      	</tr>
      </c:forEach>
    </table>
    <a href="regist.jsp">추가등록</a>
  </body>
</html>
