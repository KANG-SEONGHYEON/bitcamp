package ch02;

public class Test16_1 {
	public static void main(String[] args) {
		int a = 100;
		
		{
			System.out.println(a);
			
			int b = 200;
			System.out.println(b);
			{
				System.out.println(b);
				int c = 300;
				System.out.println(c);
			}
			
			// System.out.println(c); 블록을 벗어나서 컴파일 오류!
		}
		
		System.out.println(a);
		//System.out.println(b); 변수 선언된 블록을 벗어나서 컴파일 오류!
		
		int c = 300;
		// 블록 안에서 한 때 있었지만 지금은 없는 상태여서 다시 선언 가능.
	}
}
