// 예외처리 문법정리 : 예외 클래스의 상속 관계와 catch 블록

package ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		while (true) {
			System.out.print("입력> ");
			String str = keyScan.nextLine().toLowerCase();

			try {
				System.out.println("try 블록 실행");

				switch (str) {
				case "a":
					throw new Exception();
				case "b":
					throw new IOException();
				case "c":
					throw new FileNotFoundException();
				case "d":
					throw new SQLException();
				}

				System.out.println(str);

			} catch (IOException | SQLException e) {
				System.out.println("IOException | SQLException 예외 처리");
			} catch (Exception e) {
				System.out.println("Exception 예외 처리");
			}
		}
	}

}
