//file 읽기: Byte 스트림 사용 => 바이너리 파일 읽기
package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_0 {
	public static void main(String[] args) throws Exception {
		// 읽어올 파일 정보 준비
		File file = new File("sample/a.jpg");
		
		// 1) 바이트 단위로 데이터를 읽어주는 도구를 준비한다.
		FileInputStream in = new FileInputStream(file);
		
		/* 2) 바이트 단위로 데이터를 읽어보자!
		 * 바이트 단위로 데이터를 읽더라도 변수의 타입은 int여야 한다.
		 * read() 메서드의 리턴 타입이 int이다.
		 * 실제 읽은 것은 1바이트이다.
		 * 나머지 3바이트는 사용하지 않는다.
		 */
		int b;
		
		int count = 0;
		while ((b = in.read()) != -1) {
			count++;
		}
		
		System.out.println(count);
		
		// 3) 읽기 도구를 다 사용했으면 자원을 해제하여 다른 프로그램이 사용할 수 있도록 하라
		in.close();
	}
}

/* FileInputStream
 * 바이너리 파일을 읽을 때 사용한다.
 * 바이트 단위로 데이터를 읽는다.
 */
