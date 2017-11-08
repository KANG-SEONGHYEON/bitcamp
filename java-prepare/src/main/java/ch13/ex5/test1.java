// 예외 처리 문법 정리 : try ~ catch ~

package ch13.ex5;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print("입력> ");
		String str = keyScan.nextLine().toLowerCase();
		
		try {
			System.out.println("try 블록 실행");
			
			if (str.equals("y")) {
				throw new Exception();
			}
			System.out.println(str);
		} catch (Exception e) {
			System.out.println("catch 블록 실행");
		}
	}
	
}
