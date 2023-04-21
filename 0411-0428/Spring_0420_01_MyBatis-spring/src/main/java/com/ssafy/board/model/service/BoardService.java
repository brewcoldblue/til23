package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

//사용자 친화적으로 작성
//필요한 기능이 DAO를 기준으로 정확히 일치할 필요는 없음
//예를 들어 게시글 상세 조회시 자동으로 조회수가 증가해도 됨
/* 
 * 1. 게시글 전체 조회
 * 2. 게시글 상세 조회(클릭 시)
 * 3. 게시글 작성
 * 4. 게시글 삭제
 * 5. 게시글 수정
 */

//컨트롤러에서 바로 dao로 보내지 말고, 서비스에서 dao로 가도록 작성
public interface BoardService {
	//1
	public List<Board> getBoardList();
	//2
	public Board readBoard(int id);
	//3
	public void writeBoard(Board board);
	//4
	public void removeBoard(int id);
	//5
	public void modifyBoard(Board board);
}
