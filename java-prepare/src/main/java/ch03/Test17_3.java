/* 메서드 - 메서드 정의 문법 II
 * - 메서드 정의 기본 문법을 알아 보자!
 */
package ch03;

public class Test17_3 {
	static void m1(String name) {
		System.out.printf("%s님 반갑습니다!\n", name);
	}
	
	static void m2(String name, int age) {
		System.out.printf("%s(%d)님 반갑습니다!\n", name, age);
	}
	
	public static void main(String[] args) {
		m1("홍길동");
		m1("임꺽정");
		m1("유관순");
		
		m2("홍길동", 20);
		m2("임꺽정", 30);
		m2("유관순", 16);
		
		/* 컴파일 오류
		 *m1();
		 *m1("홍길동", 20);
		 *
		 *m1(20);
		 *
		 *m2(20, "홍길동");
		 */
	}
}
