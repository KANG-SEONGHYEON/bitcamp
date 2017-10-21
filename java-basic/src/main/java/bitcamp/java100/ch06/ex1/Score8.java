package bitcamp.java100.ch06.ex1;

//기본 생성자(default constructor)

public class Score8 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	Score8(String name) {
		// 변수 앞에 this가 없으면 로컬 변수인지 찾아본다.
		this.name = name;
		
		kor = 50;
		eng = 50;
		math = 50;
		
		compute();
	}
	
	//파라미터가 없는 생성자 = default constructor
	/*Score6() {
		System.out.println("기본 생성자 호출됨!");
	}
	*/
	// 메서드 정의

	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}
