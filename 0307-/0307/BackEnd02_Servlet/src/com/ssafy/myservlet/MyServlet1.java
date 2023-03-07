package com.ssafy.myservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//일반 클래스를 servlet으로 만들려면, servlet interface를 구현해야함.
public class MyServlet1 implements Servlet {

	@Override
	public void destroy() {
		// 서블릿이 파괴될 때
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// 서블릿 설정을 건드리는 것 같음
		return null;
	}

	@Override
	public String getServletInfo() {
		// 서블릿 정보
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// 서블릿을 초기화하는 것 같음
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// 클라이언트로부터 요청이 들어왔다면 처리를 하는 것
		
	}
	
}
