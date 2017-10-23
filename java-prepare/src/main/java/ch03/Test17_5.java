/* 메서드 - 메서드 정의 문법 IV
 * - 메서드 정의 기본 문법을 알아 보자!
 */
package ch03;

public class Test17_5 {
	
	static String m1() {
		return "Hello";
	}
	
	static int m2() {
		return 100;
	}
	
	static boolean m3() {
		return true;
	}
	
	static int m6() {
		return 100;
	}
	
	public static void main(String[] args) {
		String v = m1();
		System.out.println(v);
		
		System.out.println(m1());
		
		m1();
	}
}
