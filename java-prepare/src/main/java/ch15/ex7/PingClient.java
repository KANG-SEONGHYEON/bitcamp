package ch15.ex7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class PingClient {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("서버 주소? ");
		String serverAddr = keyboard.nextLine();
		
		System.out.print("보낼 메시지? ");
		String message = keyboard.nextLine();
		
		keyboard.close();
		
		// 비연결성 소켓 준비
		DatagramSocket socket = new DatagramSocket();
		
		// 보낼 데이터를 보관하고 있는 바이트 배열 준비
		byte[] bytes = message.getBytes("UTF-8");
		
		// 받는 쪽 IP 주소
		InetAddress ip = InetAddress.getByName(serverAddr);
		
		// 받는 쪽 port
		int port = 9999;
		
		// 데이터와 받는이 정보를 저장할 봉투를 준비한다.
		DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, ip, port);
		
		// 소켓을 이용하여 네트웍으로 방출한다.
		socket.send(packet);
		socket.close();
		
		System.out.println("데이터 출력 완료!");
	}
}
