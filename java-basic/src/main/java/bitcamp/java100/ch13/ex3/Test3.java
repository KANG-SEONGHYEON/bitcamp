// try-with-resources
package bitcamp.java100.ch13.ex3;

public class Test3 {
	// 예외를 발생 시키는 코드 중에 finally 블록이 필요한 예외가 있다.
	public static void main(String[] args) {
		class MyClass {}
		class MyClass2 implements AutoCloseable{

			@Override
			public void close() throws Exception {
				System.out.println("close() 호출 되었음!");
			}
		}
		
		try (
			// MyClass obj = new MyClass(); 컴파일 오류!
			MyClass2 obj = new MyClass2();) 
		{
			System.out.println("try 블록 실행!");
			
			int r = 20 / 0;
			
		} catch (Exception e) {
			System.out.println("catch 블록 실행!");
			
		}
	}
	}
