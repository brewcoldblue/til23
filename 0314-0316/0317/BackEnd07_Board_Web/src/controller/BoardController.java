package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssafy.board.dao.BoardDao;
import com.ssafy.board.dao.BoardDaoImpl;
import com.ssafy.board.dto.Board;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//요렇게 dao를 위에서 선언하면 모든 메서드에서 갖다쓰기 편함
	private BoardDaoImpl dao = BoardDaoImpl.getInstance();
	
	@Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getMethod().equals("POST")) {
			request.setCharacterEncoding("UTF-8");
		}
		
		String act = request.getParameter("act");
		
		switch(act) {
		case "list":
			doList(request, response);
		case "writeform":
			doWriteForm(request, response);
		case "write":
			doWrite(request, response);
		case "detail":
			doDetail(request, response);
		}
    }


	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			dao.updateViewCnt(id);
			//dao.selectOne(id)가 없으면 에러페이지나 돌려보내거나 그런 식의 접근은 하지 마세요 같은 거 주면 좋음.
			request.setAttribute("board", dao.selectOne(id));
			request.getRequestDispatcher("/board/detail.jsp").forward(request, response);
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}


	private void doWrite(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Board board = new Board();
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		board.setWriter(request.getParameter("writer"));
		try {
			dao.insertBoard(board);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//등록했으면 1. 상세페이지로 가서 그 글의 내용을 보여주기?
		//2. 전체 글 목록으로 다시 돌아가기..
		
//		request.getRequestDispatcher("/board/list.jsp").forward(request, response);
		// url이 바뀌지 않고 리퀘스트가 url에 들어있기 때문에 응답을 못받고 등록만 계속되는것임..
//		doList(request, response); //이거 이렇게 할 수도 있는데... 그러지마^^ 보일지 몰라도 똑같은 일 계속 발생함
		
		response.sendRedirect("/board?act=list");

	}


	private void doWriteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Controller를 거쳐서 들어가자,,
		request.getRequestDispatcher("/board/writeform.jsp").forward(request, response);
		
	}


	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Board> list = dao.selectAll();
		//Controller -> Model -> DAO -> DB
		//DB -> DAO -> Model -> Controller
		
		//session에서 sendredirect 해도 될것같지만 req에다 저장해도됨
		request.setAttribute("list", list);
		//list라는 이름으로 전체 게시글을 DAO에서 가져와 집어넣고, list.jsp로 포워딩한다.
		request.getRequestDispatcher("/board/list.jsp").forward(request, response);

		
	}


}
