package com.ssafy.board.test;

import java.sql.SQLException;

import com.ssafy.board.config.MyAppSqlConfig;
import com.ssafy.board.dao.BoardDao;
import com.ssafy.board.dto.Board;

public class Test {
	public static void main(String[] args) {
		BoardDao dao = MyAppSqlConfig.getSession().getMapper(BoardDao.class); //boardDAO의 구현체를 내부적으로 만들어서 가지고 있겠다
		System.out.println("전체");
		for(Board b : dao.selectAll()) {
			System.out.println(b);
		}
		System.out.println("상세");
		try {
			System.out.println(dao.selectOne(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("삽입");
		
		System.out.println("삭제");
		
		System.out.println("수정(조회수 증가)");
	}
}
