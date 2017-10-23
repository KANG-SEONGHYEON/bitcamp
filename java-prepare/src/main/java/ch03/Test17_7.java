/* 메서드 - 메서드 정의 문법 VI
 * - 메서드 정의 기본 문법을 알아 보자!
 */
package ch03;

public class Test17_7 {
	
	static java.util.ArrayList m1() {
		java.util.ArrayList list = new java.util.ArrayList();
		list.add("홍길동");
		list.add(20);
		list.add(false);
		list.add(4.12f);
		list.add('M');
		
		return list;
	}
	
	public static void main(String[] args) {
		java.util.ArrayList a = m1();
		
		for (Object v : a) {
			System.out.println(v);
		}
	}
}
