// 예외의 종류 : Try catch로 예외를 처리해야하는 경우

package bitcamp.java100.ch13.ex2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader in = new FileReader("okok.txt"); // 컴파일 오류!
		System.out.println("파일 읽기 준비 완료!");
	
		
	}

}
