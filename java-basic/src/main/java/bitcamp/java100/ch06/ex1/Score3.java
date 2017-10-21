package bitcamp.java100.ch06.ex1;

// 아주 특수한 인스턴스 메서드 "생성자(constructor)"
public class Score3 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	// 인스턴스를 만들 때 자동으로 호출되는 메서드
	// => "생성자(constructor)"라 부른다.
	
	Score3() {
		System.out.println("Score3() 호출됨!");
		
		this.name = "홍길동";
		this.kor = 50;
		this.eng = 50;
		this.math = 50;
		
		this.compute();
	}
	
	// 메서드 정의

	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}
