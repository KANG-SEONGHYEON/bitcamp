package ch06;

public class Score07 {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	Score07() {
		this("홍길동");
	}

	Score07(String name) {
		this(name, 50, 50, 50);
	}

	Score07(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		this.compute();
	}

	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}
