// file 읽기: Byte 스트림사용 => 바이너리 파일 쓰기
package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileOutputStream;

public class Test2_0 {
	public static void main(String[] args) throws Exception {
		// 0) 데이터를 저장할 파일 정보 준비
		File file = new File("./test.dat");
		
		// 1) 바이트 단위로 데이터를 출력하는 객체를 준비한다.
		// 파라미터로 넘겨준 파일이 존재하지 않는다면, 새로 생성한다.
		// 존재한다면, 기존 파일을 덮어쓴다.
		FileOutputStream out = new FileOutputStream(file);
		
		// 2) 바이트 단위로 데이터를 출력해보자
		// 바이트 단위로 데이터를 읽더라도 변수의 타입은 int여야 한다.
		// read() 메서드의 리턴 타입이 int이다.
		// 실제 읽은 것은 1바이트이다.
		// 나머지 3바이트는 사용하지 않는다.
		
		int[] data = {0x66554420, 0x66554421, 0x66554422, 
				0x66554423, 0x66554424, 0x66554425, 
				0x66554426, 0x66554427, 0x66554428, 0x66554429};
		
		for (int b : data) {
			System.out.println(Integer.toHexString(b));
			// 다음 메서드는 파라미터 타입이 int이다.
			// 하지만 출력할 때는 4바이트 중에 맨 끝 1바이트만 출력한다.
			// 그래서 항상 바이트 단위로 출력하는 것이다.
			out.write(b);
		}
		
		// 3) 쓰기 도구를 다 사용했으면 자원을 해제하여 다른 프로그램이 사용할 수 있도록 하라.
		out.close();
	}
}

// FileInputStream
// 바이너리 파일을 읽을 때 사용한다.
// 바이트 단위로 데이터를 읽는다.
