/* ## String 클래스 사용법 - 기타 메서드들 
 * - String 인스턴스에 대해 사용할 수 있는 기타 인스턴스 메서드의 사용법을 알아보자!
 */

package bitcamp.java100;

import java.io.Console;

/*4단계: 예외 처리 추가
 * 
 */
public class Pre21_5_4 {

	static Console console;

	static void prepareInput() {
		console = System.console();

		if (console == null) {
			throw new RuntimeException("콘솔 생성 오류!");
		}
	}

	static int promptGugudan() {
		int i = Integer.parseInt(console.readLine("구구단? => "));

		if (i >= 10 || i == 1) {
			throw new RuntimeException("구구단의 범위를 초과했습니다.");

		} else if (i == 0) {
			System.out.println("다음에 또 봐요!");
			System.exit(1);
		}
		return i;
	}

	static void printGugudan(int i) {
		for (int j = 1; j < 10; j++) {
			System.out.printf("%d * %d = %d\n", i, j, i * j);
		}
	}

	public static void main(String[] args) {
		try {
			prepareInput();

			int i = promptGugudan();

			printGugudan(i);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
}
