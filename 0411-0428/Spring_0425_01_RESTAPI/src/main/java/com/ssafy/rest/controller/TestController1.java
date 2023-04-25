package com.ssafy.rest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.rest.model.dto.User;

@Controller
//@RestController
//restcontroller를 하면, 알아서 responseBody 어노테이션을 붙여준다.
//requestMapping으로 요청 들어오면 뭐든 일단 컨트롤러 1
@RequestMapping("/rest1")
public class TestController1 {
	@GetMapping("/test1")
	public String test1() {
		return "hi rest";
	}
	//GET http://localhost:8080/mvc/rest1/test1 -> 404 Error
	//저렇게 스트링 리턴하면 뷰리졸버가 뷰네임으로 간주해서 hi rest.jsp를 만들어버려서 그걸 찾으려하고,
	//그게 없으니 404가 나는것. 따라서 @ResponseBody를 붙여서 데이터 그 자체를 전달하라고 할 수 있음
	
	@GetMapping("/test2")
	@ResponseBody
	public String test2() {
		return "hi rest!";
	}
	
	@GetMapping("/test3")
	@ResponseBody
	public Map<String, String> test3() {
		Map<String, String> data = new HashMap<>();
		data.put("id","ssafy");
		return data; //jackson databind을 추가했더니 알아서?? json으로 가네? ㅁㅊ
	}
	
	@GetMapping("/test4")
	@ResponseBody
	public User test4() {
		Map<String, String> data = new HashMap<>();
		data.put("id","ssafy");
		User user = new User();
		user.setId("ssssafy");
		user.setPassword("1234");
		user.setName("유지나");
		return user; //jackson databind를 추가했더니 객체를 반환했는데 json으로 바뀌어서 넘어가
	}
	
	@GetMapping("/test5")
	@ResponseBody
	public User[] test5() {
		Map<String, String> data = new HashMap<>();
		data.put("id","ssafy");
		User user = new User();
		user.setId("ssssafy");
		user.setPassword("1234");
		user.setName("유지나");
		User[] arr = {user, user, user};
		return arr; //jackson databind를 추가했더니 배열를 반환했는데 json으로 바뀌어서 넘어가넹;
	}
	@GetMapping("/test6")
	@ResponseBody
	public List<User> test6() {
		
		List<User> users = new ArrayList<>();
		for(int i=1; i<=5; i++) {
			User user = new User();
			user.setId("ssssafy"+i);
			user.setPassword("1234");
			user.setName("유지나 bot "+i);
			users.add(user);
		}
		return users; //jackson databind를 추가했더니 리스트를 반환했는데 json으로 바뀌어서 넘어가넹;
	}
}
