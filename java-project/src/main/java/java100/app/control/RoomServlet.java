package java100.app.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import java100.app.AppInitServlet;
import java100.app.dao.MemberDao;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
// Controller라는 규칙을 따르는 클래스이기도 하다!
@WebServlet(urlPatterns="/room/*")
public class RoomServlet implements Servlet {

	ServletConfig servletConfig;
	
	RoomDao roomDao;

	@Override
	public void destroy() {}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
		roomDao = AppInitServlet.iocContainer.getBean(RoomDao.class);
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return this.servletConfig;
	}

	@Override
	public String getServletInfo() {
		return "강의실 관리 서블릿";
	}
	// 다음 메서드는 Controller 규칙을 따르기로 했기 때문에,
	// Controller 선언된 추상 메서드를 오버라이딩 한 것이다.
	// 만약 추상 메서드를 오버라이딩 하지 않는다면,
	// 이 클래스는 추상 클래스가 되어야 한다.
	@Override
	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException, IOException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		httpResponse.setContentType("text/plain;charset=UTF-8");
		
		switch (httpRequest.getPathInfo()) {
		case "/list": this.doList(httpRequest, httpResponse); break;
		case "/add": this.doAdd(httpRequest, httpResponse); break;
		case "/delete": this.doDelete(httpRequest, httpResponse); break;
		default: 
			response.getWriter().println("해당 명령이 없습니다.");
		}
	}

	private void doList(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("[강의실 목록]");

		try {
			List<Room> list = roomDao.selectList();

			for (Room room : list) {
				out.printf("%d, %s, %4s, %d\n", 
						room.getNo(), 
						room.getLocation(),
						room.getName(),
						room.getCapacity());
			}

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	}

	private void doAdd(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("[강의실 등록]");
		try {
			Room room = new Room();
			room.setLocation(request.getParameter("loc"));
			room.setName(request.getParameter("name"));
			room.setCapacity(Integer.parseInt(request.getParameter("capacity")));

			roomDao.insert(room);
			out.println("등록 되었습니다.");

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}
	} 

	private void doDelete(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("[강의실 삭제]");

		try {
			int no = Integer.parseInt(request.getParameter("no"));

			if (roomDao.delete(no) > 0) {
				out.println("삭제했습니다.");
			} else {
				out.printf("'%d'의 강의실 정보가 없습니다.\n", no);
			}

		} catch (Exception e) {
			e.printStackTrace(); // for developer
			out.println(e.getMessage()); // for user
		}

	}

}










