// 파일 아웃풋 스트림과 파일 라이터의 차이점
package bitcamp.java100.ch14.ex5;

import java.io.FileOutputStream;

public class Test2_0 {
	
	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("test2.txt");
		
		String str = "ABC가각";
		byte[] bytes = str.getBytes("UTF-8");
		
		out.write(bytes);
		out.close();
		
		System.out.println("출력했습니다.");
	}
	
}