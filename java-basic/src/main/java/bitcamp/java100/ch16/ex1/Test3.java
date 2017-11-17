// 스레드 만들고 사용하기 II
package bitcamp.java100.ch16.ex1;

public class Test3 {
	
	static class MyRunnable implements Runnable {
		// Runnable 인터페이스에 선언된 run() 메서드를 구현한다.
		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				System.out.println("MyThread => " + i);
			}
		}
	}
	
	public static void main(String[] args) {

		Thread t = new Thread(new MyRunnable());
		
		t.start();
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		
		
	}
	
}
