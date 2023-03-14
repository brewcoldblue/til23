package com.ssafy.ws.step2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssafy.ws.step2.dto.Movie;

// 이 서블릿이 호출되기 위해서는 url 상에 http://server_ip:port/context_name/main 이 필요하다.
@WebServlet("/main")
public class MainServlet extends HttpServlet{
	/**
	 * 
	 */
	public static int movieCount = 0;
	private static final long serialVersionUID = 1L;

	//코드를 작성하세요
	public MainServlet() {};
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		doProcess(req, res);
		
	}
	private void doProcess(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String action = req.getParameter("action");
		

		PrintWriter writer = res.getWriter();
		switch(action) {
		case "regist":
			int movieId = 1;
			String title = req.getParameter("title");
			String director = req.getParameter("director");
			String genre = req.getParameter("genre");
			int runningTime = Integer.parseInt(req.getParameter("runningTime"));
			
			Movie mv = new Movie(movieId, title, director, genre, runningTime);
			movieCount++;
			
			HttpSession s = req.getSession();
			s.setAttribute("movie", mv);
			s.setAttribute("movieCount", movieCount);
			
			RequestDispatcher disp = req.getRequestDispatcher("/regist_result.jsp");
			disp.forward(req, res);
			
			break;
		default:
			break;
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); //POST는 따로 바꿔줘야 함
		
		doGet(req, res);
	}
}
