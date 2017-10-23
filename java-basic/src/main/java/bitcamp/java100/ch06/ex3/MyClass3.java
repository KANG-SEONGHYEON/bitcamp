package bitcamp.java100.ch06.ex3;

public class MyClass3 { 
	// static member
	
	
	static int v1 = 100;
	static void m1() {
		System.out.println(v1);
	}
	
	static {
		System.out.println("MyClass3의 static블록 실행!");
		v1 = 300;
		// 같은 클래스 멤버이기 때문에 굳이 앞에 클래스명을 적지 않는다.
	}
	
	static {
		System.out.println("MyClass3의 static블록 실행2222!");
		v1 = 300;
		// 같은 클래스 멤버이기 때문에 굳이 앞에 클래스명을 적지 않는다.
	}
}
