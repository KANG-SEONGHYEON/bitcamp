package bitcamp.java100.ch06.ex1;

//기본 생성자(default constructor)

public class Score10 {
	// 필드 선언
	String name = "이름없음";
	int kor = 10;
	int eng = 10;
	int math;
	int sum;
	float aver;

	// 인스턴스 블록
	{
		this.name = "홍길동";
		this.kor = 20;
	}
	
	// 생성자
	Score10() {
		this.name = "임꺽정";
		compute();
	}
	
	Score10(String name) {
		System.out.println("Score09(String) 호출됨!");
	}
	// 메서드 정의(=연산자 정의)
	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}

