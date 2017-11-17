package ch15.ex6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class HTTPClient {
	public static void main(String[] args) throws Exception {
		// 다음 웹 서버에 접속해보자!
		// 소켓 생성
		Socket socket = new Socket("www.etnews.com", 80);
		
		// 요청 데이터를 보낼 출력 스트림 준비
		PrintStream out = new PrintStream(
				new BufferedOutputStream(
						socket.getOutputStream()));
		
		// HTTP 요청 프로토콜에 따라 출력한다.
		// => request-line 출력
		out.println("GET / HTTP/1.1");
		
		// => 헤더 출력 : 최소한 host 헤더는 보내야 한다.
		out.println("Host: www.etnews.com");
		
		// 빈줄 출력
		out.println();
		out.flush();
		
		// HTTP 서버의 응답을 읽을 스트림 준비
		BufferedReader in = new BufferedReader(
				new InputStreamReader( // 바이너리 스트림 ==> 캐릭터 스트림
				socket.getInputStream()));
		
		String line;
		while (true) {
			line = in.readLine();
			System.out.println(line);
			if (line.equals(""))
				break;
		}
		
		int b;
		while ((b = in.read()) != -1) {
			System.out.print((char)b);
		}
		
		out.close();
		in.close();
		socket.close();
	}
}
