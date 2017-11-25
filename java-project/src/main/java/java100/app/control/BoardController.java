package java100.app.control;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import java100.app.domain.Board;

public class BoardController implements Controller {

	@Override
    public void destroy() {}
    
    @Override
    public void init() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException ex) {
			throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다.");
		}
    }
    
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
        
        try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studydb", "study", "1111");
			PreparedStatement pstmt = con.prepareStatement(
					"select no,title,conts,regdt,vwcnt from ex_board");
					ResultSet rs = pstmt.executeQuery();) {
			
			while (rs.next()) {
				out.printf("%d, %s, %s, %s, %d\n", 
						rs.getInt("no"), 
						rs.getString("title"), 
						rs.getString("conts"), 
						rs.getDate("regdt"), 
						rs.getInt("vwcnt"));
			}
			
		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
    }

    private void doAdd(Request request, Response response) {
    	PrintWriter out = response.getWriter();
    	out.println("[게시물 등록]");
    	
      /*  board.setNo(Integer.parseInt(request.getParameter("no")));
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        board.setRegDate(new Date(System.currentTimeMillis()));
        
        list.add(board);*/
        
       
        out.println("저장하였습니다.");
        
    	try (Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studydb", "study", "1111");
			PreparedStatement pstmt = con.prepareStatement(
					"insert into ex_board(name,email,,regdt)"
					+ " values(?,?,password(?),now())");
		) {
			pstmt.setInt(1, request.getParameter("name"));
			pstmt.setString(2, request.getParameter("email"));
			pstmt.setString(3, request.getParameter("password"));
			
			pstmt.executeUpdate();
			out.println("저장하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
    } 
    
    private void doView(Request request, Response response) {
    	PrintWriter out = response.getWriter();
    	int no = Integer.parseInt(request.getParameter("no"));

    	Board board = findByNo(no);

    	if (board == null) {
    		out.printf("%d번 게시물이 없습니다.\n", no);
    		return;
    	}

    	out.printf("제목: %s\n", board.getTitle());
    	out.printf("내용: %s\n", board.getContent());
    	out.printf("등록일: %s\n", board.getRegDate().toString());
    	board.setViewCount(board.getViewCount() + 1);
    	out.printf("조회수: %d\n", board.getViewCount());
    } 

    private void doUpdate(Request request, Response response) {
    	PrintWriter out = response.getWriter();
    	int no = Integer.parseInt(request.getParameter("no"));
    	
    	out.println("[게시물 변경]");

        
        Board board = findByNo(no);
        
        if (board == null) {
            out.printf("%d번 게시물이 없습니다.\n", no);
            return;
        } 
        
        board.setNo(Integer.parseInt(request.getParameter("no")));
        board.setTitle(request.getParameter("title"));
        board.setTitle(request.getParameter("content"));
        
        out.println("변경하였습니다.");
    }
    
    private void doDelete(Request request, Response response) {
    	PrintWriter out = response.getWriter();
    	int no = Integer.parseInt(request.getParameter("no"));
    	
    	out.println("[게시물 삭제]");
        
        Board board = findByNo(no);
        
        if (board == null) {
            out.printf("%d번 게시물이 없습니다.\n", no);
            return;
        } else {
            list.remove(board);
            out.println("삭제하였습니다.");
        }
    }
    
    private Board findByNo(int no) {
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            if (board.getNo() == no) {
                return board;
            }
        }
        return null;
    }
}








