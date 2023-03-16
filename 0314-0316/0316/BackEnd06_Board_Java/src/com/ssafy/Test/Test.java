package com.ssafy.Test;

import java.sql.SQLException;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;

public class Test {
	public static void main(String[] args) {
		BoardDao dao = BoardDaoImpl.getInstance();

//		Board nb = new Board("제가 왕이 된 이유는요", "한장민", "관찰력이 아주 뛰어나기 때문입니다");
//		try {
//			dao.insertBoard(nb);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//		try {
//			dao.deleteBoard(12);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		try {
			dao.updateViewCnt(4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		for(Board b : dao.selectAll()) {
			System.out.println(b);
		}
	}
}
