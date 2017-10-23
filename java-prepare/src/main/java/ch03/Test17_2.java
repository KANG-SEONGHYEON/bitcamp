/* 메서드 - 메서드 정의 문법 I
 * - 메서드 정의 기본 문법을 알아 보자!
 */
package ch03;

public class Test17_2 {
	static void m1() {
		System.out.println("m1() 메서드 실행됨!");
	}
	
	public static void main(String[] args) {
		m1();
		
		m1();
		m1();
		m1();
		
		//m1(100);
		
		//int r = m1();
	}
}
