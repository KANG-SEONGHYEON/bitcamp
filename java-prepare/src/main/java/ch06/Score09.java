package ch06;

public class Score09 {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver;

	{
		System.out.println("인스턴스 초기화 블록 실행111!");
	}

	Score09() {
		System.out.println("Score09() 호출됨!");
	}

	Score09(String name) {
		System.out.println("Score09(String) 호출됨!");
	}

	{
		System.out.println("인스턴스 초기화 블록 실행2222!");
	}

	void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;

	}

	{
		System.out.println("인스턴스 초기화 블록 실행333!");
	}

	{
		int i = 10;
		int j;

		j = 20;
		if (i < 10)
			System.out.println("Hello");
	}

}
