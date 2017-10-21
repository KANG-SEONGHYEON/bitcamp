package bitcamp.java100.ch06.ex1;

//기본 생성자(default constructor)

public class Score7 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	Score7() {
		this("홍길동");
		
		/*
		this.name = "홍길동";
		this.kor = 50;
		this.eng = 50;
		this.math = 50;
		
		this.compute();
		*/
	}
	
	Score7(String name) {
		
		this(name, 50, 50, 50);
		/*
		this.name = name;
		this.kor = 50;
		this.eng = 50;
		this.math = 50;
		
		this.compute();
		*/
	}
	
	Score7(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.compute();
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
