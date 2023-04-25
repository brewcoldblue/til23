package com.ssafy.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest3")
public class TestController3 {
	@GetMapping("/test1")
	public String test1() {
		return "GET";
	}
	
	@PostMapping("/test1")
	public String test2() {
		return "POST";
	}
	
	@PutMapping("/test1")
	public String test3() {
		return "PUT-UPDATE";
	}
	
	@DeleteMapping("/test1")
	public String test5() {
		return "DELETE";
	}
}
