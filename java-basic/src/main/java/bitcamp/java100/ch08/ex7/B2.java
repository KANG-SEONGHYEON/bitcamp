// 오버라이딩 규칙 
package bitcamp.java100.ch08.ex7;

public class B2 extends B {
	
	// OK
	//void m1(int a, String s) {}
	//public void m1(int a, String s) {}
	//void m1(int x, String y) {}
	
	// int m1() {} // 컴파일 에러!
	
	void m1_1(int a, String s) {} // 새 메서드 추가한 것
	
	void m1(String a, String s) {} // 새 메서드 추가한 것
	void m1(String s, int a) {} // 새 메서드 추가한 것 
	void m1(int a) {} // 새 메서드 추가한 것 

	// 같은 이름의 메서드를 새로 추가하는 것 : 오버 로딩
}
