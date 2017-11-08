// 예외처리 문법 정리 : throw를 이용하여 예외 던지기

package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test1 {
	
	static void m1(int i) throws Throwable {
		if (i < 0) {
			// 예외 상태일 때 Throwable 객체를 호출자에게 던진다.
			throw new Throwable();
		}
	}
	
	static void m2(int i) throws Exception, SQLException, IOException, FileNotFoundException {
		switch (i) {
		case 1: throw new Exception();
		case 2: throw new SQLException();
		case 3: throw new IOException();
		case 4: throw new FileNotFoundException();
		}
	}
	// 메서드에서 던지는 예외의 공통 수퍼 클래스를 지정해도 된다.
	static void m3(int i) throws Exception {
		switch (i) {
		case 1: throw new Exception();
		case 2: throw new SQLException();
		case 3: throw new IOException();
		case 4: throw new FileNotFoundException();
		}
	}
	
	
	static void m4(int i) throws Throwable {
		switch (i) {
		case 1: throw new Exception();
		case 2: throw new SQLException();
		case 3: throw new IOException();
		case 4: throw new FileNotFoundException();
		}
	}
	// 그러나 Throwable 타입이 아닌 것은 안된다.
/*	static void m6(int i) throws Object {
		switch (i) {
		case 1: throw new Exception();
		case 2: throw new SQLException();
		case 3: throw new IOException();
		case 4: throw new FileNotFoundException();
		case 5: throw new String();
		}
	}
*/
	
	public static void main(String[] args) {
		
	}
}
