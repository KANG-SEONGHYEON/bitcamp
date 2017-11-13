// BufferedInputStream 사용
package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Test1_6 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("sample/jls9.pdf");
		BufferedInputStream in2 = new BufferedInputStream(in); // 항상 버퍼를 붙여서 사용한다.
		
		int count = 0;
		int b = 0; // 읽어온 바이트의 갯수
		
		long start = System.currentTimeMillis();
		
		while ((b = in2.read()) != -1) {
			count ++;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.printf("읽은 바이트 수 = %d\n", count);
		System.out.printf("걸린시간 = %d\n", (end - start));
		
		in.close();
		
	}
}

/* 입출력을 다루는 클래스의 분류
 * 
 * 1) Data Sink Stream 클래스
 * => 데이터를 저장소에 저장하고 읽는 클래스.
 * => 바이너리 스트림 클래스
 *    예) - FileInputStream/FileOutputStream,
 *        - ByteArrayInputStream/ByteArrayOutputStream
 *        - PipedInputStream/PipedOutputStream
 * => 캐릭터 스트림 클래스
 * 
 * 2) Data Processing Stream 
 * 
 * => 읽은 데이터 또는 출력할 데이터를 가공하는 클래스
 * BufferedReader/BufferedWritter
 * LIneNumberReader
 * FilterReader/FilterWriter
 */
