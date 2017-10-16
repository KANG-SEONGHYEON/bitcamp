// ## 메서드 - reference리턴
// - 로컬 변수의 생명주기와 객체의 생명 주기에 대해 알아보자.
//

package bitcamp.java100;
public class Test17_15 {
	
	static int m1() {
		int a = 100;
		int b = 200;
		int c = a + b;
		return c; // 로컬 변수의 c의 값을 리턴한다.
	}
	
	// ### 메서드에서 만든 배열의 생명주기
	static int[] m2() {
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		return arr; // 배열 주소를 리턴한다.
	}
	
	
    public static void main(String[] args) {
    	int r1 = m1();
    	
    	//a = 300; // 컴파일 오류
    	//b = 300; // 컴파일 오류
    	//c = 300; // 컴파일 오류
    	
    	//m1()의 로컬 변수 c의 값은 r1변수에 리턴 받았기 때문에 사용할 수 있다.
    	System.out.println(r1);
    	
    	System.out.println("--------------------------------------------");
    	
    	int[] r2 = m2();
    	
    	for (int i : r2) {
    		System.out.println(i);
    	}
    }
}
