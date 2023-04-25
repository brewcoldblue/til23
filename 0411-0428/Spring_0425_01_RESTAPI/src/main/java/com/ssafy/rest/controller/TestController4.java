package com.ssafy.rest.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.rest.model.dto.User;

@RestController
@RequestMapping("/rest4")
public class TestController4 {
	
//	@PathVariable //URL 경로에 있는 값을 파라미터로 추출할 수 있다.
	@GetMapping("/board/{id}")
	public String test1(@PathVariable int id) { //query String이 아니라, url에서 뽑아온다는 뜻
//		예를 들어 http://localhost:8080/contextRoot/rest4/board/1에서 1을 빼내기 위해 
		return "article" + id;
	}
	
//	@GetMapping("/board/{id}")
//	public String test2(@PathVariable("id") int no) { //query String이 아니라, url에서 뽑아온다는 뜻
////		{id}랑 파라미터 다르게 하고 싶으면? 이런것도 가능하지만 권장은 안함
//		return "article id : "+no;
//	}
	
	//application/x-www-form-urlencoded
	//form으로 잘 넘기면 알아서 들어가던데요
	@PostMapping("/board")
	public String test3(User user) {
		return user.toString();
	}
	
	//@RequestBody는 json 데이터를 원하는 타입으로 바인딩함
//	{
//		"id":"ssafy",
//	    "password":"1234",
//	    "name":"hansangbin"
//	}
	@PostMapping("/board2")
	public String test4(@RequestBody User user) {
		return user.toString();
	}
	
	//ResponseEntity<응답타입>: 응답하려고 하는 데이터, 응답상태코드, 응답 헤더를 설정할 수 있음!!!
	@GetMapping("/board2")
	public ResponseEntity<String> test5() {
			HttpHeaders headers = new HttpHeaders();
			headers.add("auth", "admin");
			headers.add("Content-Type", "text/plain; charset=utf-8");
//			headers.add("Content-Type", "application/json; charset=utf-8");
			
			//응답, 헤더, 상태 코드
			return new ResponseEntity<String>("OOOKK", headers, HttpStatus.OK);
	}
	
}
