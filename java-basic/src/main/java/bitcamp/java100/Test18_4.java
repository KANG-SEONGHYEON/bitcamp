// ## String 클래스 사용법
// 개발자가 문자열을 쉽게 다룰 수 있도록 자바에서 기본으로 제공하는 부품.

package bitcamp.java100;
public class Test18_4 {

	public static void main(String[] args) {
		
		String s1 = "ABC가각간";
		String s2 =  new String ("ABC가각간");
		
		if (s1 != s2) System.out.println("s1 != s2");
		
		
		if (s1.equals(s2)) System.out.println("s1과 s2의 내용물이 같다");
	}
}