package ch06;

public class Score08 {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	Score08(String name) {
		this.name = name;
		kor = 50;
		eng = 50;
		math = 50;

		compute();
	}

	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}
