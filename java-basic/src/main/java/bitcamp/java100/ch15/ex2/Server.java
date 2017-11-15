// 네트워킹 프로그래밍 - 대기열 다루기
package bitcamp.java100.ch15.ex2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(9999, 3); // 포트번호, 백로그
		System.out.println("서버를 실행하였다!");

		Scanner keyScan = new Scanner(System.in);

		// 10번 반복한다
		for (int i = 0; i < 10; i++) {
			
			System.out.println("다음 클라이언트 승인:");
			keyScan.nextLine();

			Socket socket = ss.accept();
			System.out.println("클라이언트와 연결되었음!");
			System.out.printf("%s:%d\n", 
					socket.getInetAddress().getHostAddress(), 
					socket.getPort());
			
			// 클라이언트 정보를 출력한 후 연결을 끊는다.
			socket.close();
			
		}
		// 사용 후 자원을 해제한다.
		ss.close();
		System.out.println("서버를 종료하였다!");
	}
}
