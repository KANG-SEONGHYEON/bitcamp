// 네트워킹 프로그래밍 - Socket 사용법
package bitcamp.java100.ch15.ex1;

import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		// 서버에 연결 요청한다.
		// 서버 주소는 IP Address 또는 도메인 이름 모두 가능하다.
		
		Socket socket = new Socket("192.168.0.5", 9999);
		System.out.println("서버와 연결되었다!");
		System.out.printf("클라이언트 IP = %s\n", socket.getLocalAddress().getHostAddress());
		System.out.printf("클라이언트 Port = %s\n", socket.getLocalPort());
		System.out.printf("서버 IP = %s\n", socket.getInetAddress().getHostAddress());
		System.out.printf("서버 Port = %d\n", socket.getPort());
		
		socket.close();
	}
}
