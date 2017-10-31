/* 패키지 멤버 클래스 사용
 * => import를 이용하여 소속된 클래스를 밝힌 후에 사용하거나
 * => 사용할 떄 마다 직접 패키지를 밝히거나 둘 중 하나로 
 */
package bitcamp.java100.ch10.ex1;

import bitcamp.java100.ch10.ex1.other.C;

public class Test1 {
	
	public static void main(String[] args) {
		
	
	
	A obj = new A();
	bitcamp.java100.ch10.ex1.other.B obj2 = 
			new	bitcamp.java100.ch10.ex1.other.B(); 
	C obj4 = new C();
	
	//bitcamp.java100.ch10.ex1.other.D obj5 = 
			//new bitcamp.java100.ch10.ex1.other.D(); // 컴파일 오류!
	
	F obj6 = new F();
	G obj7 = new G();
	}
}
