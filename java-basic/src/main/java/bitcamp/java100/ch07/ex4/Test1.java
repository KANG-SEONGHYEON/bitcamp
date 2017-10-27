// 상속 - java.lang.Object 클래스

package bitcamp.java100.ch07.ex4;
// 모든 클래스에는 그 클래스의 정보가 담겨있는 인스턴스의 주소를 가지고 있다.
// static Class class = new Class();
// class가 가르키는 인스턴스에는 클래스 정보가 들어 있다.

public class Test1 /*extends Object*/ {
	public static void main(String[] args) {
		Test1 obj = new Test1();
		if (obj instanceof Test1)
			System.out.println("obj는 Test1의 인스턴스이다.");
		if (obj instanceof Object)
			System.out.println("obj는 Object의 인스턴스이다.");
		
		//Test1 클래스의 정보를 담은 인스턴스 주소를 얻는다.
		Class c = Test1.class; //Test1.class 파일이 아니다! Test1의 class라는 변수
		
		Class sc = c.getSuperclass(); // Test1의 수퍼 클래스 정보를 얻는다.
		System.out.println(sc.getName());
		
		Class sc2 = sc.getSuperclass();
		System.out.println(sc2);
	}
}
