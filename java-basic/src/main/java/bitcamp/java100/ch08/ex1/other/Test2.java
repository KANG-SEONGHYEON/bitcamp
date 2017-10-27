// 캡슐화 - 다른 패키지의 클래스가 멤버에 접근할 경우

package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A;

public class Test2 {

	public static void main(String[] args) {
		// Test2는 A 클래스와 다른 패키지에 있는 클래스이다.
		//private
		//A.v1 =100; // 접근 불가!
		
		// default
		//A.v2 = 200; 접근 불가!

		// protected
		//A.v3 = 300; // 접근 불가!
					// Test1이 A의 서브 클래스는 아니지만 같은 패키지의 클래스이다.
		// public
		A.v4 = 400; // OK!
	}

}
