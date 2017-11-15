// 네트워킹 프로그래밍 - ServerSocket 사용법
package bitcamp.java100.ch15.ex1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		/* 클라이언트 연결을 받는 객체 준비
		 * => IP Address : 인터넷에 연결된 컴퓨터를 구분하는 식별 번호
		 * => Port : 컴퓨터에서 실행 중인 통신 프로그램을 구분하는 식별 번호
		 * 
		 * 포트 번호
		 * => 클라이언트 요청을 받는 서버의 경우 포드 번호를 프로그램에서 지정한다.
		 *    이때 다른 프로그램이 사용하지 않는 번호로 지정한다.
		 * => 클라이언트 프로개램의 포트 번호는 OS로부터 자동으로 부여받는다.
		 * 
		 * 널리 알려진 포트번호 (0 ~ 1023)
		 * => 특정 프로그램이 관습적으로 사용하는 포트번호.
		 *    일반 프로그램은 가능한 이 번호를 피해서 사용하는 것이 좋다.
		 *    예) 
		 *    20, 21   : FTP 서버 관련
		 *    22, 23   : 원격 접속 프로그램
		 *    109, 110 : 이메일 수신 서버 (POP2, POP3)
		 *    143      : IMAP4 프로토콜로 이메일 수신 서버
		 *    80       : 웹서버(HTTP)
		 *    8080     : 프록시
		 *    443      : 보안 웹서버(HTTP)
		 *    
		 *    널리 알려진 포트번호가 아니더라도 
		 *    이미 관습적으로 특정 프로그램이 사용하는 포트 번호가 있다.
		 *    가능한 그런 포트 번호도 피하는 것이 좋다.
		 *    예) 8080(프록시), 3306(MySQL DBMS), 1521(Oracle DBMS) 등
		 */
		
		// 이 프로그램은 서버 역할을 하기 때문에 
		// 프로그램에서 어떤 포트를 사용할지 결정해야 한다.
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("서버를 실행하였다!");
		
		Socket socket = ss.accept();
		System.out.println("클라이언트와 연결되었음!");
		System.out.printf("서버 IP = %s\n", socket.getLocalAddress().getHostAddress());
		System.out.printf("서버 Port = %s\n", socket.getLocalPort());
		System.out.printf("클라이언트 IP = %s\n", socket.getInetAddress().getHostAddress());
		System.out.printf("클라이언트 Port = %d\n", socket.getPort()); 
		
		// 사용 후 자원을 해제한다.
		ss.close();
		System.out.println("서버를 종료하였다!");
	}
}
