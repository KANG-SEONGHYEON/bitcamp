// ## import - 클래스가 어떤 패키지에 있는지 컴파일러에게 알리는 방법
// - import의 용도와 사용법을 알아보자!
// 

package bitcamp.java100;
public class Test19_1 {
	public static void main(String[] args) {
		// ArrayList list = new ArrayList(); // compile error!
		java.util.ArrayList<java.lang.String> list = 
				new java.util.ArrayList<>(); // OK!
		list.add("홍길동");
	}
}