package ch06;

public class Test08 {
	public static void main(String[] args) {
		Score07 score;

		score = new Score07();

		System.out.printf("이름=%s\n", score.name);
		System.out.printf("총점=%d\n", score.sum);
		System.out.printf("평균=%f\n", score.aver);
	}
}
