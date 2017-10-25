package ch06.ex5;

import java.util.Scanner;

// 1단계: 로컬 변수 사용
public class Test1 {
	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);

		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float aver;

		System.out.print("이름? ");
		name = keyScan.nextLine();

		System.out.print("국어 점수? ");
		kor = keyScan.nextInt();

		System.out.print("영어 점수? ");
		eng = keyScan.nextInt();

		System.out.print("수학 점수? ");
		math = keyScan.nextInt();

		sum = kor + eng + math;
		aver = sum / 3f;

		System.out.printf("%s, %d, %d, %d, %d, %f\n", name, kor, eng, math, sum, aver);

	}
}
