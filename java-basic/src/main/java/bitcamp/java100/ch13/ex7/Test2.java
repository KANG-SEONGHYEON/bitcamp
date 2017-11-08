// 예외처리 문법 정리 : throw를 이용하여 예외 던지기

package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test2 {
	
	static void m1(int i) throws Exception, SQLException, IOException, FileNotFoundException {
		switch (i) {
		case 1: throw new Exception();
		case 2: throw new SQLException();
		case 3: throw new IOException();
		case 4: throw new FileNotFoundException();
		}
	}

	public static void main(String[] args) throws IOException, Exception {
		// 예외를 던지는 메서드 호출하기
		
		// 1)
		try {
			m1(2);
		} catch (FileNotFoundException e) {
		} catch (SQLException e) {
		} catch (IOException e) {
		} catch (Exception e) {
		}
		
		// 2)
		try {
			m1(2);
		} catch (Exception e) {
		}
		
		// 3)
		try {
			m1(3);
		} catch (SQLException e) {
		} catch (FileNotFoundException e) {
		}
	}
}
