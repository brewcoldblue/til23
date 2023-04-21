package com.ssafy.board.model.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dto.Board;

@Service
public class BoardServiceImpl implements BoardService {


	private BoardDao bdao;
	
	@Autowired
	public void setBoardDao(BoardDao bdao) {
		this.bdao = bdao;
	} //인스턴스 넣으려면 bdao impl 있어야하지 않나용? 아뇽 sqlsession.getmapper 하면 지가 구현체 들고있음 
	
	
	@Override
	public List<Board> getBoardList() {
		System.out.println("모든 게시글을 가져왔어요");
		return bdao.selectAll();
	}

	@Override
	public Board readBoard(int id) {
		System.out.println(id+"번 게시글을 가져왔어요");
			bdao.updateViewCnt(id);
			return bdao.selectOne(id);

	}

	@Override
	public void writeBoard(Board board) {
		System.out.println("게시글을 작성했어요");
			bdao.insertBoard(board);
	}

	@Override
	public void removeBoard(int id) {
		System.out.println(id+"번 게시글을 삭제했어요");
		bdao.deleteBoard(id);
	}

	@Override
	public void modifyBoard(Board board) {
		System.out.println("게시글을 수정했어요");
		bdao.updateBoard(board);
	}

}
