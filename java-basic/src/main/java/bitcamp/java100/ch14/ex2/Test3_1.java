//Byte 스트림 응용 => 파일 복사하기 버퍼 적용 전 시간측정
package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_1 {
	public static void main(String[] args) throws Exception {

		

		FileInputStream in = new FileInputStream(new File("sample/jls9.pdf"));
		
		FileOutputStream out = new FileOutputStream(new File("sample/jls9-2.pdf"));
		
		int b;
		
		long start = System.currentTimeMillis();
		
		while ((b = in.read()) != -1) {
			out.write(b);
		}
		
		long end = System.currentTimeMillis();
		System.out.printf("걸린 시간 = %d\n", end - start);
		
		in.close();
		out.close();
		
		System.out.println("파일 복사 완료!");
	}
}