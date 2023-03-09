package com.ssafy.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/make")
public class MakeCookieServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String key = req.getParameter("key");
		String value = req.getParameter("value");
		
		Cookie cookie = new Cookie(key, value);
		
		res.addCookie(cookie);
		
		//유효시간: 초 단위
		//만료시간을 0으로 하면 쿠키를 삭제하는 것과 같음
		cookie.setMaxAge(60);
		
		//req.getCookies();
		//로 여전히 req에 있는 쿠키를 꺼내올 수 있다..
		
		res.sendRedirect("01_cookie.jsp");

	}
}
