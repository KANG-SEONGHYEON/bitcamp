package bitcamp.java100.ch06.ex1;

// 아주 특수한 인스턴스 메서드 "생성자(constructor)"
public class Score4 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	// 인스턴스를 만들 때 자동으로 호출되는 메서드
	// => "생성자(constructor)"라 부른다.
	
	//생성자가 호출될 때 파라미터 값을 받을 수 있다.
	
	Score4(String name, int kor, int eng, int math) {
		System.out.println("Score3() 호출됨!");
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.compute();
	}
	
	// 메서드 정의

	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}
