package ch06;

public class Test09 {
	public static void main(String[] args) {
		Score08 score;

		score = new Score08("홍길동");

		System.out.printf("이름=%s\n", score.name);
		System.out.printf("총점=%d\n", score.sum);
		System.out.printf("평균=%f\n", score.aver);
	}
}
