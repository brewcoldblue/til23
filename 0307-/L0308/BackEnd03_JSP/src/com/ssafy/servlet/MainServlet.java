package com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.dto.Person;
import com.ssafy.manager.PersonManager;

//Front Controller pattern을 이용해서, 처리를...했으면...좋겠다...
@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "regist":
			regist(request, response);
			break;
		case "list":
			showlist(request, response);
			break;
		}
		
	}

	private void showlist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PersonManager pm = PersonManager.getInstance();
		request.setAttribute("list", pm.getAll());
		request.getRequestDispatcher("/WEB-INF/list.jsp").forward(request, response);
	}

	private void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		
		Person p = new Person(age, name, gender);
		PersonManager pm = PersonManager.getInstance();
		pm.regist(p);
		
		request.setAttribute("person", p);
		request.setAttribute("size", pm.getAll().size());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
		dispatcher.forward(request, response); //포워딩
		
//		response.sendRedirect(request.getContextPath()+"/result.jsp"); //리다이렉션
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
