package com.ssafy.ws.step2.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.ws.step2.dto.Movie;

/**
 * Servlet implementation class MainServlet
 */

/**
 * <servlet>
 * 	<servlet-name>mainServlet</servlet-name> //camel case로 바꿔주는게 좋다
 * 	<servlet-class>
 * </servlet>
 * <servlet-mapping>
 * 	<servlet-name>mainServlet</servlet-name>
 * 	<url-pattern>/</url-pattern> //실제로 user이 보는 url
 * </servlet-mapping>
 * @author SSAFY
 *
 */
@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //req의 인코딩을 설정함(한글 파라미터 처리)
		process(request, response);
	}
	
	//front controller pattern
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
			case "regist":
				doRegist(request, response);
				break;
		}
	}
	private void doRegist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String title = request.getParameter("title");
		String director = request.getParameter("director");
		String genre = request.getParameter("genre");
		int runningTime = Integer.parseInt(request.getParameter("runningTime"));
		
		Movie m = new Movie(title, director, genre, runningTime);
		
		StringBuilder output = new StringBuilder();
		
		//response 인코딩 해야함
		response.setContentType("text/html; charset=UTF-8"); 
		output.append("<html><body>")
				.append("<h1>영화 정보</h1>")
				.append(m.toString())
				.append("</body></html>");
		
		response.getWriter().write(output.toString());
		
	}

}
