// 스태틱 멤버 - 클래스 안에 선언된 static 클래스
package bitcamp.java100.ch06.ex3;

public class Test6 {
	// 인스턴스 멤버
	class A {
		
	}
	// 스태틱 멤버
	static class B {
		
	}
	
	public static void main(String[] args) {
		A obj1;
		B obj2;
		
		//obj1 = new A(); // 컴파일 오류!
		obj2 = new B();
		
	}
}
