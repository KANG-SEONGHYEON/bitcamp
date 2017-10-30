// 오버라이딩 문법 정리

package bitcamp.java100.ch08.ex7;

public class A2 extends A {
	public void Test1() {
		m4();
		m3();
		m2();
		//m1();
	}
	
	private void m1() {
		System.out.println("B.m1()");
	}
	
	// 수퍼 클래스의 A의 m2()를 오버라이딩 한다.
	void m2() {}
	
	protected void m3() {}
	
	public void m4() {}
}
