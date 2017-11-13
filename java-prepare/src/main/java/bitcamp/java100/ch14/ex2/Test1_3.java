//file 읽기: FileInputStream 사용법 - 버퍼 사용 전
package bitcamp.java100.ch14.ex2;

import java.io.FileInputStream;

public class Test1_3 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("sample//jls9.pdf");
		
		// 데이터를 읽을 때 바이트 배열에 왕창 읽어 올 수 있다.
		byte[] buf = new byte[8196];
		int len = 0; // 읽어 온 바이트의 개수
		
		/* read(버퍼):int
		 * => 바이트 버퍼에 읽어 온 데이터를 채워 넣는다. 
		 * => 리턴 값은 버퍼에 채워 넣은 바이트 개수이다.
		 *    파일을 다 읽어서 더는 읽을 바이트가 없다면 -1을 리턴한다.
		 */
		
		int count = 0;
		
		// 읽는데 걸린 시간을 측정하기 위해 읽기 시작 시간을 저장한다.
		long start = System.currentTimeMillis();
		
		while ((len = in.read(buf)) != -1) {
			count += len;
		}
		
		// 읽은 후 시간을 저장한다.
		long end = System.currentTimeMillis();
		
		// 총 읽은 바이트 수를 출력한다.
		System.out.printf("읽은 바이트 수 = %d\n", count);
		System.out.printf("걸린 시간 = %d\n", end - start);
		
		in.close();
	}
}

/* 왜 버퍼를 쓰면 속도가 빠른가?
 * => 저장장치에서 데이터를 읽어 올 때마다
 *    그 위치를 찾아야 하는데 그 찾는 시간을 Data Seek Time이라 부른다.
 *    
 * => 찾은 데이터를 전손하는 시간을 Data Transfer Time이라 부른다.
 * 
 * => 문제는 Data Transfer Time보다 Data Seek Time이 오래 걸린다는 점이다.
 * 
 * => 그래서 데이터의 위치를 찾았을 때 
 *    가능한 만큼 많은 양의 데이터를 한 번에 읽는 것이
 *    1바이트씩 읽는 것보다 시간이 절약된다.
 * 
 * => 결론 : 버퍼를 사용하여 한번에 많이 데이터를 읽는 것이 속도가 빠르다.
 * 
 */
