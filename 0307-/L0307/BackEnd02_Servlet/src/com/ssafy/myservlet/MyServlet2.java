package com.ssafy.myservlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//GenericServlet은 추상클래스이므로 반드시 추상메서드를 구현해야함
public class MyServlet2 extends GenericServlet {

	//여기서는 service만 구현하면 되는디요?
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
