/* ## String 클래스 사용법 - 기타 메서드들 
 * - String 인스턴스에 대해 사용할 수 있는 기타 인스턴스 메서드의 사용법을 알아보자!
 */

package bitcamp.java100;

import java.io.Console;

public class Pre21_6 {
	
	public static void main(String[] args) {
		
		Console console = System.console();
		if (console == null) {
			System.err.println("콘솔을 지원하지 않습니다.");
			System.exit(1);
		}
		
		int i;
		while(true) {
			i = Integer.parseInt(console.readLine("숫자? "));
			
			int[] cnt = new int[10];
			
			while (i > 0) {
				cnt[i % 10]++;
				i /= 10;
			}
			
			int x = 0;
			while (x < cnt.length) {
				System.out.printf("%d = %d\n", x, cnt[x]);
				x++;
			}
		}
		
	}
}

