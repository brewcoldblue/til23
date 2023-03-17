package com.ssafy.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.dto.Board;

import com.ssafy.board.util.DBUtil;

//싱글턴..
public class BoardDaoImpl implements BoardDao{

	private final com.ssafy.board.util.DBUtil util = com.ssafy.board.util.DBUtil.getInstance();
	
	private BoardDaoImpl() {}
	private static BoardDaoImpl instance = new BoardDaoImpl();
	
	public static BoardDaoImpl getInstance() {
		return instance;
	}
	
	@Override
	public List<Board> selectAll() {
		String sql = "SELECT * FROM board";
		List<Board> list = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssafy_board?serverTimezone=UTC", "root", "ssafy");
			stmt = conn.createStatement();
			//util에 가져오는 것들 있음
			rs = stmt.executeQuery(sql);
			
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
		} finally {
			util.close(rs, stmt, conn);
		}
		return list;
	}

	@Override
	public Board selectOne(int id) {
		String sql = "SELECT * FROM board WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Board board = new Board();
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			//resultSet 포인터가 BOF를 가리키고 있어서 한칸 밀어준다
			//즉 rs에 있는 데이터 한 줄만 가져올거면 요렇게 해도 댐
			rs.next();
			board.setId(rs.getInt(1));
			board.setWriter(rs.getString(2));
			board.setTitle(rs.getString(3));
			board.setContent(rs.getString(4));
			board.setViewCnt(rs.getInt(5));
			board.setRegDate(rs.getString(6));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			util.close(conn, pstmt);
		}
		return board;
		
	}

	@Override
	public void insertBoard(Board board) throws SQLException {
//		String sql = "INSERT INTO board (title, writer, content) VALUES ('"+board.getTitle()+"','....";
		//statement를 쓰면 이렇게 준비된 SQL을 집어넣어야 해서 불편한데, PreparedStatement를 쓰면
		//아래처럼 쓸 수 있음
																	//   ↓ 1번 인덱스
		String sql = "INSERT INTO board (title, writer, content) VALUES (?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
//		ResultSet 테이블을 업데이트하는 것이므로 없어도 됨
		
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			
			pstmt.executeUpdate(); // 반환된 결과는 int형 (idx?)
			
			util.close(pstmt, conn);

	}

	@Override
	public void deleteBoard(int id) {
		String sql = "DELETE FROM board WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
		conn = util.getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, id);
		int result = pstmt.executeUpdate();
		System.out.println(result+"개의 데이터 삭제");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(conn, pstmt);
		}
	}

	@Override
	public void updateBoard(Board board) throws SQLException {
		String sql = "UPDATE board SET title=?, content=? WHERE id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(conn, pstmt);
		}
	}

	@Override
	public void updateViewCnt(int id) throws SQLException {
		String sql = "UPDATE board SET view_cnt = view_cnt+1 WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			util.close(conn, pstmt);
		}
	}

}
