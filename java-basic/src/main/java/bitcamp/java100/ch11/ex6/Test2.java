// 추상 클래스 II
package bitcamp.java100.ch11.ex6;

public class Test2 {
	public static void main(String[] args) {
		// 추상 클래스의 서브 클래스를 사용한다.
		B obj = new B();
		obj.m1();
		obj.m2();
		
		System.out.println("================================");
		A obj2 = new B();
		
		obj2.m1();
		// obj2.m2(); 컴파일 오류!
		((B)obj2).m2();
		
		B obj3 = (B)obj2;
		obj3.m2();
	}
}
