/* ## String 클래스 사용법 - 기타 메서드들 
 * - String 인스턴스에 대해 사용할 수 있는 기타 인스턴스 메서드의 사용법을 알아보자!
 */

package bitcamp.java100;

import java.io.Console;

public class Pre21_5 {
	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1);
		}
		
		int mul;
		while(true) {
		mul = Integer.parseInt(console.readLine("구구단? "));
			for (int i = 1; i <= 9; i++) {
				if (mul <= 0) {
					System.out.println("다음에 또 봐요!");
					System.exit(1);
					break;
				}
				else if(mul == 1 || mul >= 10) {
					System.out.println("2에서 9단까지만 가능합니다!");
					break;
				}
				else 
					System.out.println(mul + " * " + i + " = " + mul * i);
			}
		}
	}
}


