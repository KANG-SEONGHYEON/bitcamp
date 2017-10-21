package bitcamp.java100.ch06.ex1;

//기본 생성자(default constructor)

public class Score9 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	{
		System.out.println("인스턴스 초기화 블록 실행! 111");
	}
	
	Score9() {
		System.out.println("Score09() 호출됨!");
	}
	
	Score9(String name) {
		System.out.println("Score09(String) 호출됨!");
	}
	
	//파라미터가 없는 생성자 = default constructor
	/*Score6() {
		System.out.println("기본 생성자 호출됨!");
	}
	*/
	// 메서드 정의

	{
		System.out.println("인스턴스 초기화 블록 실행! 222");
	}
	
	{
		System.out.println("인스턴스 초기화 블록 실행! 333");
	}
	
	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}
