// File System 다루기 : File 클래스

package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.sql.Date;

public class Test1 {
	public static void main(String[] args) throws Exception {
		// 1) 프로그램을 실행하는 현재 폴더에 대한 정보를 가져온다.
		// => Eclipse에서 실행한다면, 현재 폴더는 프로젝트 폴더가 된다.
		//File file = new File(".");
		//File file = new File("../..");
		File file = new File("../java-basic/build.gradle");

		System.out.printf("파일명=%s\n", file.getName());
		System.out.printf("파일 객체를 생성할 때 넘겨준 경로=%s\n", file.getPath());
		
		System.out.printf("절대경로=%s\n", file.getAbsolutePath());
		
		System.out.printf("계산된 경로=%s\n", file.getCanonicalPath());
		
		System.out.printf("기준 디렉토리=%s\n", file.getParent());

		System.out.printf("전체 용량=%s\n", file.getTotalSpace());
		System.out.printf("남은 용량=%s\n", file.getFreeSpace());
		System.out.printf("사용 가능한 용량=%s\n", file.getUsableSpace());
		
		// 
		System.out.printf("존재여부=%s\n", file.exists());
		System.out.printf("파일여부=%s\n", file.isFile());
		System.out.printf("존재여부=%s\n", file.isDirectory());
		System.out.printf("파일이나 디렉토리 크기=%s\n", file.length());
		System.out.printf("읽기 권한=%s\n", file.canRead());
		System.out.printf("쓰기 권한=%s\n", file.canWrite());
		System.out.printf("실행=%s\n", file.canExecute());
		System.out.printf("마지막 변경일=%s\n", 
				new Date(file.lastModified()).toString());
		System.out.printf("마지막 변경일2=%s\n", 
				new Date(file.lastModified()).toLocaleString());
		
	}
}
