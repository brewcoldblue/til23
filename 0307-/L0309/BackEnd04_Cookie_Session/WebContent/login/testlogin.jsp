<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//JSP -> Servlet -> JSP를 지금까지 했는데, 이번에는 JSP -> JSP 구조로
//JSP도 서블릿이므로 이렇게 활용할 수도 있읍니다
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	if(id.equals("ssafy") && pw.equals("1234")) {
//		HttpSession s = request.getSession();
//		s.setAttribute("loginUser", id);

//		JSP에는 기본적으로 세션 객체가 있어서 이렇게 쓰면 됩니다,,,
		session.setAttribute("loginUser", id);
//		메인 화면으로 보내줌
		response.sendRedirect("main.jsp");
	} else {
//		실패시 다시 돌려보냄
		response.sendRedirect("loginForm.jsp");
	}
%>