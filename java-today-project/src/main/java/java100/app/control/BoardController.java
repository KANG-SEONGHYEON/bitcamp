package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
@Component("/board")
public class BoardController implements Controller {

	@Autowired
	BoardDao boardDao;

	@Override
	public void destroy() {}

	@Override
	public void init() {}

	@Override
	public void execute(Request request, Response response) {
		switch (request.getMenuPath()) {
		case "/board/list": this.doList(request, response); break;
		case "/board/add": this.doAdd(request, response); break;
		case "/board/view": this.doView(request, response); break;
		case "/board/update": this.doUpdate(request, response); break;
		case "/board/delete": this.doDelete(request, response); break;
		default: 
			response.getWriter().println("해당 명령이 없습니다.");
		}
	}

	private void doList(Request request, Response response) {

		PrintWriter out = response.getWriter();
		out.println("[게시물 목록]");
		
		try {
			List<Board> list = boardDao.selectList();
			
			for (Board board : list) {
				out.printf("%d, %s, %s, %d\n",
						board.getNo(),
						board.getTitle(), 
						board.getRegDate(),
						board.getViewCount());
			}

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	}

	private void doAdd(Request request, Response response) {

		PrintWriter out = response.getWriter();
		out.println("[게시물 등록]");

		try {
			Board board = new Board();
			board.setTitle(request.getParameter("title"));
			board.setContent(request.getParameter("content"));

			boardDao.insert(board);
			out.println("저장하였습니다.");

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	} 

	private void doView(Request request, Response response) {

		PrintWriter out = response.getWriter();
		out.println("[게시물 상세 정보]");

		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studydb", "study", "1111");
				){

			int no = Integer.parseInt(request.getParameter("no"));

			try (
					PreparedStatement pstmt = con.prepareStatement(
							"update ex_board set vwcnt = vwcnt + 1 where no=?")) {
				pstmt.setInt(1, no);
				pstmt.executeUpdate();
			} catch (Exception e) {}

			try (PreparedStatement pstmt = con.prepareStatement(
					"select no,title,conts,regdt,vwcnt from ex_board where no=?")) {
				pstmt.setInt(1, no);

				ResultSet rs = pstmt.executeQuery();

				if (rs.next()) {
					out.printf("번호: %d\n", rs.getInt("no"));
					out.printf("제목: %s\n", rs.getString("title"));
					out.printf("내용: %s\n", rs.getString("conts"));
					out.printf("등록일: %s\n", rs.getDate("regdt"));
					out.printf("조회수: %d\n", rs.getInt("vwcnt"));
				} else {
					out.printf("'%s'번의 게시물 정보가 없습니다.\n", 
							request.getParameter("no"));
				}
				rs.close();
			} catch (Exception e) {}

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	}

	private void doUpdate(Request request, Response response) {

		PrintWriter out = response.getWriter();
		out.println("[게시물 변경]");

		try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studydb", "study", "1111");
				PreparedStatement pstmt = con.prepareStatement(
						"update ex_board set title=?, conts=? where no=?");
				){

			pstmt.setString(1, request.getParameter("title"));
			pstmt.setString(2, request.getParameter("content"));
			pstmt.setInt(3, Integer.parseInt(request.getParameter("no")));

			if (pstmt.executeUpdate() > 0) {
				out.println("변경하였습니다.");
			} else {
				out.printf("'%s'번 게시물이 없습니다.\n", 
						request.getParameter("no"));
			}

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	}

	private void doDelete(Request request, Response response) {

		PrintWriter out = response.getWriter();
		out.println("[게시물 삭제]");

		try {
			int no = Integer.parseInt(request.getParameter("no"));
			

			if (boardDao.delete(no) > 0) {
				out.println("삭제했습니다.");
			} else {
				out.printf("'%d'번의 게시물 정보가 없습니다.\n", no);
			}

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	}
}








