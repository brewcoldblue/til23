package com.ssafy.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/") //슬래시 여기 넣는순간, index.html 동작 안하고 컨트롤러 단의 요청으로서 동작함
	public String hello(Model model) {
		model.addAttribute("msg", "hu");
		return "hello";
	}
}
