/* ## ver 48
 - Spring IoC 컨테이너를 사용하여 객체 관리(Bean Container) 및
   의존 객체 주입(DI)을 자동화하라!
 - 학습 목표
   - Spring IoC 컨테이너의 설정 및 사용방법을 익힌다.
   - Spring IoC 컨테이너의 역할을 이해한다.
*/
package java100.app;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.control.Controller;
import java100.app.control.Request;
import java100.app.control.Response;
import java100.app.util.DataSource;

/* 기존 방식의 문제점
 * - HTTP 프로토콜을 정교하게 제어하지 못한다.
 * - 그래서 웹브라우저의 일반적인 요청을 처리하지 못했다.
 *   예를 들면, favicon.ico이나 기타 정적인 HTML 문서를 요청할 때
 *   적절하게 처리하지 못했다.
 * - 가장 중요한 문제는 컨트롤러를 만들 때 자체 인터페이스를 정의하여
 *   만들었기 때문에 다른 프로젝트나 다른 제품과 호환되지 않는다.
 *   
 * 해결 방안
 * - 이미 검증되고 널리 사용되는 표준 규격에 따라 프로그램을 만들어
 *   다양한 프로젝트나 시스템에서도 적용될 수 있게 호환성을 확보한다.
 * - 그래서 JavaEE의 Servlet 기술을 도입하여 처리한다.
 * - 변경코드 
 *   0) JavaEE의 서블릿 기술을 다룰 수 있도록 라이브러리를 가져온다.
 *     => mvnrepository.com에서 servlet-api를 찾는다.
 *     => build.gradle에 의존 라이브러리 정보를 등록한다.
 *        - 'war' gradle 플러그인을 추가한다.
 *        - 의존 라이브러리 정보를 추가한다.
 *     => "gradlew eclipse"를 실행하여 이클립스 설정 파일을 갱신한다.
 *     => 이클립스 프로젝트를 "Refresh"한다.
 *   1) App 클래스 변경
 *     => App 클래스도 "톰캣" 서블릿 컨테이너에서 실행하도록 만든다.
 *        즉, Servlet 규칙에 따라 만든다.
 *     => 컨트롤러를 호출하는 것은 "톰캣" 서블릿 컨테이너에게 맡긴다.
 *     => 대신 스프링 IoC 컨테이너를 이용하여 DAO와 DB 커텍션풀을 준비한다.
 *     
 *   2) 컨트롤러를 JavaEE의 Servlet 규격에 맞춰 변경한다.
 *     => 각 컨트롤러의 이름에서 접미사 Controller 대신에 Servlet으로 바꾼다.
 *     => 우리가 만든 Controller 인터페이스 대신에
 *        JavaEE에서 제공하는 Servlet 인터페이스를 구현한다.
 *     => 컨트롤러에 @WebServlet을 붙여 서블릿 컨테이너가 알아 볼 수 있게 한다.
 *     
 *   3) 서블릿 컨테이너 제품 중에 하나인 "톰캣"을 다운로드 받는다.
 *     => tomcat.apache.org 사이트에 간다.
 *     => servlet 3.1 규격에 따라 만든 8.5.x 버전을 다운로드 받는다.
 *     => windows(c:\Users\사용자폴더\에 압축을 푼다), linux/macOS(홈폴더에 푼다)
 *     
 *   4) 톰캣 웹 애플리케이션 폴더에 이 프로그램을 배치한다.
 *    => $tomcat_home/webapps/bitcamp 폴더를 생성한다.
 *    => bitcamp/classes 폴더를 생성한다.
 *       이 폴더에 우리가 만든 클래스 파일(.class)을 둔다.
 *    => 이 모든 것을 한 방에 배치할 수 있는 방법이 있으니,
 *       gradle 빌드 도구를 사용하는 것이다.
 *       - "gradlew build"를 실행한다.
 *       - 프로젝트 폴더/build/libs/프로젝트명.war 파일이 생성되었을 것이다.
 *       - 이 war(Web ARchive 파일)에 우리가 만든 클래스들과 라이브러리 파일들이
 *         묶여서 들어 있다.
 *       - 이 파일을 $tomcat_home/webapps/폴더에 복사해 놓으면 된다.
 *       - 웹 애플리케이션 이름은 .war 파일명이 될 것이다.
 *    5) 톰캣 서버의 포트 번호를 8080에서 9999로 변경한다.
 *     => 이유?
 *        운영체제에 이미 8080을 사용하는 프로그램이 있을 수 있다.
 *        특히 오라클 DBMS를 설치하면 오라클 기본 웹서버가 8080을 사용한다.
 *     => 이런 경우를 방지하고자 그냥 무조건 포트번호를 9999로 바꾼다.
 *     => 톰캣홈/conf/server.xml 파일에서 8080 포트 부분을 찾아 9999로 바꾼다.
 *    
 *    6) 톰캣 서버를 실행한다.
 *     => "echo %JAVA_HOME%을 실행하여 JDK 폴더가 제대로 설정되었는지 확인한다.
 *        linux/macOS는 'echo $java_
 *     
 */

// 이 클래스가 스프링 IoC 컨테이너를 위한 설정 클래스임을 표시!
@Configuration
// @Component 붙은 클래스가 어느 패키지에 있는지 표시
@ComponentScan("java100.app")
public class App {

	ServerSocket ss;

	// Spring IoC 컨테이너 객체
	AnnotationConfigApplicationContext iocContainer;
	
	/* Spring IoC 컨테이너에게 getDataSource() 메서드를 호출해서
	 * 이 메서드가 리턴한 객체를 꼭 컨테이너에 보관해 달고 표시!
	 */
	@Bean
	DataSource getDataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/studydb");
		ds.setUsername("study");
		ds.setPassword("1111");
		return ds;
	}
	
	void init() {
		
		iocContainer = new AnnotationConfigApplicationContext(App.class);
	}

	void service() throws Exception {
		// 서버 소켓 준비
		ss = new ServerSocket(9999);
		System.out.println("서버 실행!");

		while (true) {
			// 클라이언트가 연결되면, 스레드에 처리를 위임한다.
			new HttpAgent(ss.accept()).start();
		}
	}

	private void request(String command, PrintWriter out) {

		String menuName = command;

		int i = command.indexOf("/", 1);
		if (i != -1) {
			menuName = command.substring(0, i);
		}

		Object controller = iocContainer.getBean(menuName);

		if (controller == null && controller instanceof Controller) {
			out.println("해당 명령을 지원하지 않습니다.");
			return;
		}

		// Controller를 실행하기 전에 컨트롤러가 작업하기 편하게
		// 클라이언트가 보낸 명령을 분석하여 객체 담아 둔다.
		Request request = new Request(command);

		Response response = new Response();
		response.setWriter(out);

		((Controller)controller).execute(request, response);
	}

	private void hello(String command, PrintWriter out) {
		out.println("안녕하세요. 성적관리 시스템입니다.");
		out.println("[성적관리 명령들]");
		out.println("목록보기: /score/list");
		out.println("상세보기: /score/view?name=이름");
		out.println("등록: /score/add?name=이름&kor=점수&eng=점수&math=점수");
		out.println("변경: /score/update?name=이름&kor=점수&eng=점수&math=점수");
		out.println("삭제: /score/delete?name=이름");
		out.println("[회원]");
		out.println("[게시판]");
		out.println("[강의실]");

	}

	public static void main(String[] args) throws Exception {
		App app = new App();
		app.init();
		app.service();
	}

	class HttpAgent extends Thread {
		Socket socket;

		public HttpAgent(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try (
					Socket socket = this.socket; // 왜? 자동 close() 호출!
					BufferedReader in = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
					PrintWriter out = new PrintWriter(
							new BufferedOutputStream(socket.getOutputStream()));
				) {
				// HTTP 요청 읽기
				// => request-line 읽기
				// 예) GET /score/list HTTP/1.1 (CRLF)
				String command = in.readLine().split(" ")[1];

				// => header 읽기
				String header = null;
				while (true) {
					header = in.readLine();
					if (header.equals("")) // 빈 줄을 만나면 요청 데이터의 끝!
						break;
				}

				// HTTP 응답 출력하기 
				// => status-line 출력
				// 예) HTTP/1.1 200 ok (CRLF)
				out.println("HTTP/1.1 200 OK");

				// => 콘텐츠의 MIME 타입과 인코딩 문자집합에 대한 정보를 출력한다. 
				out.println("Content-Type:text/plain;charset=UTF-8");

				// => 헤더의 끝임을 표시하기 위해 빈 줄을 출력한다.
				out.println();

				// 명령어에 따라 처리를 분기하여 콘텐츠를 출력한다.
				if (command.equals("/")) {
					hello(command, out);
				} else {
					request(command, out);
				}
				out.println(); // 응답을 완료를 표시하기 위해 빈줄 보냄.
				out.flush();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}















