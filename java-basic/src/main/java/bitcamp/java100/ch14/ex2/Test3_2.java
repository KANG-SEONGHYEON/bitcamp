//Byte 스트림 응용 => 파일 복사하기 버퍼 적용
package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_2 {
	public static void main(String[] args) throws Exception {

		

		FileInputStream in = new FileInputStream(new File("sample/jls9.pdf"));
		
		FileOutputStream out = new FileOutputStream(new File("sample/jls9-3.pdf"));
		
		int b;
		
		byte[] buf = new byte[8192]; 
		int len;
		
		long start = System.currentTimeMillis();
		
		while ((len = in.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		long end = System.currentTimeMillis();
		System.out.printf("걸린 시간 = %d\n", end - start);

		in.close();
		out.close();
		
		System.out.println("파일 복사 완료!");
	}
}
