package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
	
	@GetMapping("/")
	public String showIndex() {
		//index가 없어서 리스트로 바로 점프한 것임..
		return "redirect:list";
	}
	
	@GetMapping("list")
	public String list(Model model) {
		List<Board> list = bs.getBoardList();
		model.addAttribute("list", list);
		return "/list";
	}
	
	
	@GetMapping("writeform")
	public String writeform() {
		return "/writeform";
	}
	

	@PostMapping("write")
	public String write(Board board) {
		bs.writeBoard(board);
		return "redirect:detail?id="+board.getId();
	}
	
	@GetMapping("detail")
	public String detail(Model model, int id) {
		bs.readBoard(id);
		return "/detail";
	}
	
	@GetMapping("delete")
	public String delete(int id) {
		bs.removeBoard(id);
		//요청이 유지되면 안되니까 리다이렉트
		return "redirect:list";
	}
	
	@GetMapping("search")
//	public String search(Model model, String key, String word, String ord..)
	//이렇게 하지말고 dto 만들어서 담자
	public String search(Model model, SearchCondition condition) {
		model.addAttribute("list", bs.search(condition));
		//list.jsp에서 list를 갖다 쓰는데 그 화면을
		//그대로 재활용해야하기 때문
		return "/board/list";
	}
}
