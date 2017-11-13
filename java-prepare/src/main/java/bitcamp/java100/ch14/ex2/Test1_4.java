//file 읽기: FileInputStream 사용법 - MyBufferedInputStream 사용
package bitcamp.java100.ch14.ex2;

public class Test1_4 {
	public static void main(String[] args) throws Exception {
		// FileInputStream 대신 버퍼 기능이 추가된 클래스를 사용하여 데이터를 읽어보자! 
		MyBufferdInputStream in = 
				new MyBufferdInputStream("sample//jls9.pdf");
		
		int count = 0;
		int b = 0;
		
		// 읽는데 걸린 시간을 측정하기 위해 읽기 시작 시간을 저장한다.
		long start = System.currentTimeMillis();
		
		while ((b = in.read()) != -1) {
			count++;
		}
		
		// 읽은 후 시간을 저장한다.
		long end = System.currentTimeMillis();
		
		// 총 읽은 바이트 수를 출력한다.
		System.out.printf("읽은 바이트 수 = %d\n", count);
		System.out.printf("걸린 시간 = %d\n", end - start);
		
		in.close();
	}
}
