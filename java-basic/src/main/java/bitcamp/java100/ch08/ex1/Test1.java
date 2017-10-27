// 캡슐화 - 같은 패키지의 클래스가 멤버에 접근할 경우

package bitcamp.java100.ch08.ex1;

public class Test1 {

	public static void main(String[] args) {
		// Test1은 A 클래스와 같은 패키지에 있는 클래스이다.
		//private
		//A.v1 =100; // 접근 불가!
		
		// default
		A.v2 = 200;

		// protected
		A.v3 = 300; // OK!
					// Test1이 A의 서브 클래스는 아니지만 같은 패키지의 클래스이다.
		// public
		A.v4 = 400; // OK!
	}

}
