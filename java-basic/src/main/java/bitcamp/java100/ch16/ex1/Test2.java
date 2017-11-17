// 스레드 만들고 사용하기
package bitcamp.java100.ch16.ex1;


public class Test2 {
	
	static class MyThread extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				System.out.println("MyThread => " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		// 스레드 사용하기
		MyThread t = new MyThread();
		
		t.start();
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		
		
	}
	
}