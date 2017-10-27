package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A; // OK
// import bitcamp.java100.ch08.ex1.B; // 접근 불가! B가 default이기 때문에
public class Test5 {
	public static void main(String[] args) {
		new A();
		//new B();
	}
}
