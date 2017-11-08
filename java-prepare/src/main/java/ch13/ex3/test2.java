// finally 보다 자원을 해제시키는 더 쉬운 방법
package ch13.ex3;

import java.io.FileReader;

public class test2 {
	public static void main(String[] args) {
		/* 자원을 해제시키지 위해 개발자가 직접
		 * finally 블록에 코드를 작성해야 하는 번거로움이 있다.
		 * 이를 간편하게 해주는 문법이 있다.
		 * try-with-resourced 문법이다.
		 */
		
		try (FileReader in = new FileReader("./build.gradle");){ 
		
		System.out.println("파일 읽기 준비 완료!");
		
			int ch;
			while (true) {
				ch = in.read();
				if (ch == -1) break;
				System.out.print((char)ch);
			}
			System.out.println("==============================");
		} catch (Exception e) {
			System.out.println("파일 읽기 중 오류 발생!");
		}
	}
}
