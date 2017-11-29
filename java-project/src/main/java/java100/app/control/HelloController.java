package java100.app.control;

import java.io.PrintWriter;
import java.util.List;

import java100.app.annotation.Component;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
// Controller라는 규칙을 따르는 클래스이기도 하다!
@Component("/hello")
public class HelloController implements Controller {

	@Override
	public void destroy() {}

	@Override
	public void init() {}


	// 다음 메서드는 Controller 규칙을 따르기로 했기 때문에,
	// Controller 선언된 추상 메서드를 오버라이딩 한 것이다.
	// 만약 추상 메서드를 오버라이딩 하지 않는다면,
	// 이 클래스는 추상 클래스가 되어야 한다.
	@Override
	public void execute(Request request, Response response) {
		switch (request.getMenuPath()) {
		case "/hello/hi": this.doHi(request, response); break;
		case "/hello/hi2": this.doHi2(request, response); break;
		default: 
			response.getWriter().println("해당 명령이 없습니다.");
		}
	}

	private void doHi(Request request, Response response) {
		PrintWriter out = response.getWriter();
		out.println("Hi");
	}

	private void doHi2(Request request, Response response) {
		PrintWriter out = response.getWriter();
		out.println("Hi2");
	}
}










