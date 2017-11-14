// ## StringBuffer 클래스 사용법 - 원본 문자열 변경하기
// 

package bitcamp.java100;
public class Test18_7 {

	public static void main(String[] args) {
		// immutable 객체
		// > 한 번 값이 설정되면 메모리의 값을 바꿀 수 없는 객체
		String s1 = "Hello!";
		
		String s2 = s1.replace("l", "x");
		
		System.out.println(s1);
		System.out.println(s2);
		
		// mutable 객체
		StringBuffer sb1 = new StringBuffer("Hello!");
		
		sb1.append(" World!");
		System.out.println(sb1);
		
		sb1.replace(2, 4, "xx");
		System.out.println(sb1);
		
		
	}
}