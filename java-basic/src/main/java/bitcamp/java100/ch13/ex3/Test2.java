// 자원을 해제시키는 더 쉬운 방법
package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test2 {
	// 예외를 발생 시키는 코드 중에 finally 블록이 필요한 예외가 있다.
	public static void main(String[] args) {
				
		try (
			FileReader in = new FileReader("./build.gradle");
			// String s = new String("test...") // 컴파일 오류!
			// ArrayList<String> list = new ArrayList();
			) {
			System.out.println("파일 읽기 준비 완료!");
			
			int ch;
			while (true) {
				ch = in.read();
				if (ch == -1) break;
				System.out.print((char)ch);
			}
			System.out.println("-----------------------------------");
			
		} catch (Exception e) {
			System.out.println("파일 읽기 중 오류 발생");
			
		}
	}
}