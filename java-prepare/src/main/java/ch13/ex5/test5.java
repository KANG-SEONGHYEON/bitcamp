// 예외처리 문법정리 : 예외 클래스의 상속 관계와 catch 블록

package ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		while (true) {
			System.out.print("입력> ");
			String str = keyScan.nextLine().toLowerCase();
			
			try {
				System.out.println("try 블록 실행");
				
				switch (str) {
				case "a": throw new Exception();
				case "b": throw new IOException();
				case "c": throw new FileNotFoundException();
				case "d": throw new SQLException();
				}
				
				System.out.println(str);
			} catch (IOException e) {
				System.out.println("IOException 처리");
			} catch (Exception e) {
				System.out.println("Exception 처리");
				// 앞서 test5에서 사용하지 못했던 IOException을 앞으로 둬서 따로 처리
			}
		}
	}
	
}
