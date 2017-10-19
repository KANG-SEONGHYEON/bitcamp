// ## 키보드로부터 입력 받기 - 연습I

package bitcamp.java100;

import java.io.Console;

public class Test21_7 {
	
	public static void main(String[] args) {
	
		Console console = System.console();
		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1); // JVM을 종료한다.
		}
		System.out.print("문자열");
		
		String input = console.readLine("");
		
		System.out.printf("입력한 값: %s\n", input);
		
		System.out.printf("거꾸로 바꾼 값: ");
		for(int i = input.length()-1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
	}
}
