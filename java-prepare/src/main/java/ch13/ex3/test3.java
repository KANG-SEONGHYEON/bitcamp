// try-with-resourced 테스트
package ch13.ex3;

public class test3 {
	public static void main(String[] args) {
		class MyClass {
		}

		class MyClass2 implements AutoCloseable {

			@Override
			public void close() throws Exception {
				System.out.println("close() 호출 되었음!");
			}
		}

		try (MyClass2 obj2 = new MyClass2();
		) {

			System.out.println("try 블록 실행!");

			int r = 20 / 0;

		} catch (Exception e) {
			System.out.println("catch 블록 실행!");
		}
	}
}
