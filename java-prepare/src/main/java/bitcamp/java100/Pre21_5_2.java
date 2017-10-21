/* ## String 클래스 사용법 - 기타 메서드들 
 * - String 인스턴스에 대해 사용할 수 있는 기타 인스턴스 메서드의 사용법을 알아보자!
 */

package bitcamp.java100;

import java.io.Console;

public class Pre21_5_2 {
	public static void main(String[] args) {
		Console console = System.console();

		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1);
		}

		int i, j;

		i = Integer.parseInt(console.readLine("구구단? => "));

		if (i >= 10 || i == 1) {
			System.out.println("2단에서 9단까지만 가능합니다!");
			return;

		} else if (i == 0) {
			System.out.println("다음에 또 봐요!");
			return;
		}

		for (j = 1; j < 10; j++) {
			System.out.printf("%d * %d = %d\n", i, j, i * j);
		}
	}
}