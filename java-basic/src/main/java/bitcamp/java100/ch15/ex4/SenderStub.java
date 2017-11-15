package bitcamp.java100.ch15.ex4;

import java.net.Socket;
import java.util.Scanner;

public class SenderStub {
	Socket socket;
	Scanner in;
	
	public SenderStub(Socket socket) throws Exception {
		this.socket = socket;
		
		System.out.printf("송신자(%s)가 연결되었음", 
				socket.getInetAddress().getHostAddress());
		// sender는 서버쪽으로 데이터를 보내기만 한다.
		in = new Scanner(socket.getInputStream());
	}

	// 소켓과 연결된 클라이언트로부터 메세지를 한 줄 읽어서 리턴한다.
	public String nextMessage() {
		return in.nextLine();
	}
}
