package com.ssafy.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
	
	//컨트롤러 동작 이전에 로그인했는지 검사
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//여기서 검사해야함
		
		//로그인 정보는 보통 session에 저장함! 근데 파라미터가 저런데 세션 어케 가져옴?
		HttpSession session = request.getSession(); //이렇게 가져올수 있었음
		//로그인이 된 상태라면(여기서는 id가 세션에 있다고 가정)
		if(session.getAttribute("id") == null) {
			response.sendRedirect("login"); //로그인 페이지로 보내드립니다
			return false;
		}
		return true; //ㅇㅋ 통과
	}
}
