// File System 다루기 : File 클래스

package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test2 {
	public static void main(String[] args) throws Exception {
		// 1) 프로그램을 실행하는 현재 폴더에 대한 정보를 가져온다.
		// => Eclipse에서 실행한다면, 현재 폴더는 프로젝트 폴더가 된다.
		File file = new File("ok.txt");

		// => 파일 생성
		System.out.printf("파일생성=%b\n", file.createNewFile());
		// 파일 및 디렉토리 제거
		// => 삭제 성공하면, true 리턴
		// => 삭제 실패하면, false 리턴
		System.out.printf("파일삭제=%b\n", file.delete());
		
		// 디렉토리 생성
		File file2 = new File("dir1");
		System.out.printf("디렉토리 생성=%b\n", file2.mkdir());
		// 디렉토리 삭제
		// 디펙토리에 파일이 있을 경우 삭제하지 않는다.
		System.out.printf("디렉토리 삭제=%b\n", file2.delete());
		
		File file3 = new File("aaa/bbb/ccc/test.txt");
		System.out.printf("디렉토리2 생성=%b\n", file3.mkdir());
		System.out.printf("디렉토리2 생성=%b\n", file3.mkdirs());
	}
}
