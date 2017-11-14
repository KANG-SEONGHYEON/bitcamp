// ## 키보드로부터 입력 받기
// Scanner 클래스를 사용하여 키보드로부터 입력받는 방법을 알아보자!
package bitcamp.java100;

import java.util.Scanner;

public class Test21_1 {
	public static void main(String[] args) {
	
	Scanner keyScan = new Scanner(System.in);
	
	System.out.print("입력하세요:");
	
	String line = keyScan.nextLine();
	
	System.out.println(line);
	
	keyScan.close();
	}
}
