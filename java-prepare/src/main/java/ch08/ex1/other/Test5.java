// 캡슐화 - 다른 패키지의 클래스가 멤버에 접근할 경우
package ch08.ex1.other;

import ch08.ex1.A;

class Test5 {
	public static void main(String[] args) {
		new A();
		// new B();
		
	}
}
