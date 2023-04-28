package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.service.BoardService;

@RestController
@RequestMapping("/api")
public class BoardRestController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
//  뭐가 리턴될지 모른다는 의미에서 제네릭 안에 ?도 가능하다.
//	public ResponseEntity<List<Board>> list(SearchCondition condition) {
	public ResponseEntity<?> list(SearchCondition condition) {
//		List<Board> list = boardService.getBoardList();
		List<Board> list = boardService.search(condition);
		
//		if(list == null || list.size() == 0) return new ResponseEntity<List<Board>>(HttpStatus.NO_CONTENT);
		if(list == null || list.size() == 0) return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		//condition이 없으면 알아서 동적쿼리가 작동하지 않게 되고, 전체 글을 가져온다
		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/board/{id}")
	public ResponseEntity<?> detail(@PathVariable int id) {
		Board board = boardService.readBoard(id);
		
		//사용자가 url을 입력해서 들어갔을 때 그 글이 없다면, 빈 board에 OK응답이 무조건 가기 때문에
		//예외 처리를 해야한다.
		if(board == null) new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}
	
	@PostMapping("/board")
	public ResponseEntity<?> write(Board board) {
		boardService.writeBoard(board);
		//지금 우리 서비스에서는 키가 절대로 중복이 안되기 때문에 db에 등록이 되긴 하는데
		//가끔가다 이상한 억까가 있을 수 있음... 그럼 ok처리를 해주면 안되기때문에 예외를 처리해야함
		//어떻게? db에 다녀올 때 테이블을 변경하는 작업이라면, 테이블에 건드린 행 개수가 리턴되는걸 이용
		
		//처리해
		return new ResponseEntity<Board>(board, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/board/{id}")
	public ResponseEntity<Void> delete(@PathVariable int id) {
		//이것도 리턴이 1이상이어야 지워진것이고
		//남의 글 못지우게 해야함. 로그인유저 != 작성자면 쿼리문 못 날리게 사전에 컷해야함
		//당연히 프론트 단에서도 해줘야함
		boardService.removeBoard(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/board")
		//delete에서 했던 처리 고대로 하십쇼. 근데 이제 req가 json이라면 @RequestBody 붙이기.
	public ResponseEntity<Void> update(@RequestBody Board board) {
		boardService.modifyBoard(board);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
