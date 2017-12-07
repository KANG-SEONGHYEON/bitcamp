package java100.app.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
// Controller라는 규칙을 따르는 클래스이기도 하다!
@WebServlet(urlPatterns="/hello/*")
public class HelloServlet implements Servlet {

	ServletConfig servletConfig;
	
	@Override
	public void destroy() {}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return this.servletConfig;
	}

	@Override
	public String getServletInfo() {
		return "성적관리 서블릿";
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
		case "/hi": this.doHi(httpRequest, httpResponse); break;
		case "/hi2": this.doHi2(httpRequest, httpResponse); break;
		default: 
			response.getWriter().println("해당 명령이 없습니다.");
		}
	}

	private void doHi(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hi");
	}

	private void doHi2(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hi2");
	}
}










