package com.ssafy.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.model.dto.Board;
import com.ssafy.model.service.BoardService;


@Controller
public class UserController {

	@Autowired
	ResourceLoader resLoader;

	@Autowired
	BoardService service;

	
	@GetMapping("/board")
	public String showBoard() {
		return "board";
	}

	
	@GetMapping("/write")
	public String showWriteForm() {
		return "write";
	}

	
	@PostMapping("/write")
	public String doWrite(@ModelAttribute Board board, @RequestPart(required = false) MultipartFile file, Model model)
			throws IllegalStateException, IOException {
		
		//입력된 user 데이터를 받아서 insert메서드를 작동시킨다.
//			board.setImg(file.getOriginalFilename());
			service.writeBoard(board);
				return "detail";

		
	}

	@GetMapping("/detail")
	public void showList(Model model) {
		
		//전체 조회를 진행한 후, model에 그 결과(list)를 담는다.
		model.addAttribute("users", service.getBoardList());
	}

	@GetMapping("/error/404")
	public void showError404() {
	}
}
