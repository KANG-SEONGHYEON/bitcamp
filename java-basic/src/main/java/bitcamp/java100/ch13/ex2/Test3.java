// 예외의 종류 : Try catch로 예외를 처리해야하는 경우

package bitcamp.java100.ch13.ex2;

import java.io.FileReader;

public class Test3 {
	
	public static void main(String[] args) {
		
		// FileReader in = new FileReader("okok.txt"); // 컴파일 오류!
		
		try {
			FileReader in = new FileReader("./build.gradle");
			System.out.println("파일 읽기 준비 완료!");
		} catch (Exception e) {
			System.out.println("FileReader 객체 준비중 오류 발생!");
		}
		
	}

}
