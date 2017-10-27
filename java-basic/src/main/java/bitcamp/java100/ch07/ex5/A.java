package bitcamp.java100.ch07.ex5;

public class A {
	// 모든 클래스는 반드시 생성자를 가져야 한다.
	// 생성자를 정의하지 않으면 컴파일러가 기본 생성자를 자동으로 추가한다.
	/*
	 * A() { // 모든 생성자는 첫 번째 문장으로 수퍼 클래스의 기본 생성자를 호출한다. super();// A 클래스의 수퍼 클래스는
	 * Object이기 때문에 Object의 기본 생성자를 호출함. }
	 */

	// 만약 다음과 같이 생성자를 정의한다면 컴파일러가 기본 생성자를 추가하지 않는다.
	A() {
		//super(); 자동 생성
		System.out.println("A() 생성자 실행!");
	}
	
	A(String str) {
		super(); // 이렇게 수퍼 클래스의 생성자를 호출하라고 명시 할 수 있다.
		System.out.println("A(String) 실행!");
	}
	
	// 수퍼클래스 생성자를 첫 번째로 호출하지 않는다면 컴파일 오류
	A(int i) {
		System.out.println("A(int) 실행!");
		// super(); // 컴파일 오류!
	}
}
