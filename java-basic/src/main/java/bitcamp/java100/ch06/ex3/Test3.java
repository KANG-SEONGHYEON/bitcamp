// 스태틱 멤버 - 인스턴스 변수가 생성될 때
package bitcamp.java100.ch06.ex3;

import java.io.Console;

public class Test3 {
	public static void main(String[] args) {
		// 1) 클래스 변수를 사용할 때
		//MyClass2.v1 = 200;
		
		// 2) 클래스 메서드를 사용할 때
		//MyClass2.m1();
		
		//3 new 연산자를 사용할 때
		//new MyClass();
		
		//주의!
		//=> 
		MyClass2 obj1 = null;
		MyClass2 obj2 = null;
		
		System.out.println(obj1.v1);
	}
}
