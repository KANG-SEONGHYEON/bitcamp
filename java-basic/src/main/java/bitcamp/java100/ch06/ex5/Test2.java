// 클래스 멤버와 인스턴스 멤버의 활용 2
package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

//2단계 메서드 분리 및 스테틱 변수 사용
public class Test2 {
	
	static String name;
	static int kor;
	static int eng;
	static int math;
	static int sum;
	static float aver;
	
	static void inputScore() {
		Scanner keyScan = new Scanner(System.in);
		
		System.out.print("이름? ");
		name = keyScan.nextLine();
		
		System.out.print("국어 점수? ");
		kor = keyScan.nextInt();
		
		System.out.print("영어 점수? ");
		eng = keyScan.nextInt();
		
		System.out.print("수학 점수? ");
		math = keyScan.nextInt();
		
		keyScan.close(); // 스캐너는 사용 후 닫아야한다.
	}
	
	static void computeScore() {
		sum = kor + eng + math;
		aver = sum / 3f;
	}
	
	static void printScore() {
		System.out.printf("%s, %d, %d, %d, %d, %f\n", 
				name, kor, eng, math, sum, aver);
	}
	
	public static void main(String[] args) {
		
		inputScore();
		
		computeScore();
		
		printScore();
	}
}