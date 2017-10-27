// 중첩 클래스(Nested Class = Inner Class)
// => 패키지에 직접 소속된 클래스가 아니라 다른 클래스 안에 소속된 클래스를 말한다.
// 
package ch08.ex1;
// 다음 X1 클래스는 같은 파일에 있지만, 엄연한 패키지 멤버 클래스이다. 
// => 중첩 클래스가 아니다.
// => 중첩 클래스는 아래에 Test6에 소속된 클래스를 말한다.
class X1 {}

public class Test6 {
	private class X4 {}
	class X5 {}
	protected class X6 {}
	public class X7 {}
	
	public static void main(String[] args) {
		
	}
}
