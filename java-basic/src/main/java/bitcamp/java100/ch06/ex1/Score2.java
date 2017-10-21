package bitcamp.java100.ch06.ex1;

// 새 데이터를 다루는 연산자를 정의한다.
public class Score2 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	// 메서드 선언

	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}
