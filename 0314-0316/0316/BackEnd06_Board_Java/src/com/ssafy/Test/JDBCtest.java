package com.ssafy.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.Board;

public class JDBCtest {
/** 
 * 1. JDBC 드라이버 로드 
 * 2. 데이터베이스 연결
 * 3. SQL 준비 및 실행
 * 4. 연결 해제 
 * */	
	
	//1. JDBC 드라이버 로드
	public JDBCtest() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//2. DB 연결
		JDBCtest db = new JDBCtest();
		
		for(Board b : db.selectAll()) {
			System.out.println(b);
		}
		
	}
	private List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssafy_board?serverTimezone=UTC", "root", "ssafy");
			Statement stmt = conn.createStatement();
			String sql = "SELECT(*) FROM board";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Board board = new Board();
				
//				rs.getInt(1); //위와 같은말
				//DB에서 인덱스는 1부터다.
				board.setId(rs.getInt("id"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getString("reg_date"));
				board.setViewCnt(rs.getInt("view_cnt"));
				
				list.add(board);
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
