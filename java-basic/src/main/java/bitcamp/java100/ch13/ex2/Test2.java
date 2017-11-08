// 예외의 종류 : RuntimeException 계열의 예외

package bitcamp.java100.ch13.ex2;

public class Test2 {
	
	public static void main(String[] args) {

		// RuntimeExcption이 발생하는 코드는 try... catch...사용을 강제하지 않는다.
		
		try {
			System.out.printf("%d / %d = %d/n", 20, 0, 20 / 0);
		} catch (RuntimeException e) {
			System.out.println("나누기 실행 중 오류 발생!");
		}
	}

}
