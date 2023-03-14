<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ page import="com.ssafy.ws.step2.dto.Movie" %> <%@
page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>SSAFY 영화 관리</title>
  </head>
  <body>
    <% Movie m = (Movie) session.getAttribute("movie"); %>
    <h1>SSAFY 등록된 영화</h1>
    <h3>지금까지 등록된 영화: <%=session.getAttribute("movieCount") %>개</h3>
    <table border="1">
      <thead>
        <tr>
          <th>제목</th>
          <th>감독</th>
          <th>장르</th>
          <th>상영시간</th>
        </tr>
      </thead>
      <tr>
        <td><%=m.getTitle() %></td>
        <td><%=m.getDirector() %></td>
        <td><%=m.getGenre() %></td>
        <td><%=m.getRunningTime()+"분" %></td>
      </tr>
    </table>
    <a href="regist.jsp">추가등록</a>
  </body>
</html>
