package com.ssafy.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.service.UserService;

@RestController
@RequestMapping("/api-user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> userList(Model model) {
		return userService.getUserList();
	}
	
	@PostMapping("/signup")
	public ResponseEntity<Integer> signup(User user) {
		int result = userService.signup(user);
		//result=0이면 등록X, 1이면 등록된것
		//등록한 유저 정보를 반환할거면 int 대신 user를 반환하면
		return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
	}
	
	//로그인 (실제 수행)
	@PostMapping("login")
	public ResponseEntity<?> login(User user, HttpSession session) {
		User tmp = userService.login(user.getId(), user.getPassword());
		//요기에 tmp로 올 수 있는 것은?
		//1. 실제 로그인 할 유저의 정보
		//2. null (아이디는 있는데.... 비번 틀렸어~~)
		if(tmp == null) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		session.setAttribute("loginUser", tmp.getName());
		return new ResponseEntity<String>(tmp.getName(), HttpStatus.OK);
	}
	
	//로그아웃
	@GetMapping("logout")
	public ResponseEntity<Void> logout(HttpSession session) {
//		session.removeAttribute("loginUser");
		session.invalidate();
		
		//로그인 페이지로 날리던지, 목록 페이지로 날리던지...
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	
	
	//유저등록 (회원가입 페이지로 이도옹)
	@GetMapping("signup")
	public String signupForm() {
		return "/user/signupform";
	}
	
	

}
