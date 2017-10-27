package bitcamp.java100.ch07.ex5;

public class C extends A {
	C(String msg) {
		// 수퍼 클래스 A에는 3개의 생성자가 있다.
		// super();
		
		//super("hello"); // v파라미터로 문자열을 주면 String을 받는 
		super(100);
		System.out.println("C() 생성자 실행 - " + msg);
		
	}
}
