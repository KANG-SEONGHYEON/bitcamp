// 중첩 클래스(nested class)
// => 특정 클래스에서만 사용되는 클래스라면 굳이 공개할 필요가 없다.

package bitcamp.java100.ch10.ex1;

public class Test2 {
	// static nested class
	static class A {}
	
	// non-static nested class = inner class
	// => 인스턴스가 있어서야만 사용할 수 있는 nested class 
	class B {}

	Object obj = new Object() {
		String name;
		public void m1() {}
	};
	
	public static void main(String[] args) {
		// 로컬 클래스
		// => 특정 메서드에서만 사용하도록 메서드 안에 정의된 클래스.
		class C {}
		
		Object obj2 = new Object() {
			String name;
			public void m1() {}
		};
		
	}
}
