package com.ssafy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.mysql.cj.Session;
import com.ssafy.model.dto.User;

@Component
public class SessionInterceptor implements HandlerInterceptor {

	// 컨트롤러 호출 전에 실행되어야 한다.
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	//로그인 유저가 없으면, 돌려보낸다.
			throws Exception {
			HttpSession session = request.getSession();
//			if(session.getAttribute("loginUser") == null) return false;
			return true;
	
	}
	
}
