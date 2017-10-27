// 캡슐화 활용 - 접근 제한하기 전
// 
package ch08.ex1;

class Score2 {
	String name;
	int kor;
	int eng;
	int math;
	
	private int sum;
	private float aver;

	public void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
	
	public int getSum() {
		return this.sum;
	}
	
	public float getAver() {
		return this.aver;
	}
}

public class Test8_2 {
	public static void main(String[] args) {
		Score2 s = new Score2();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 90;
		s.math = 80;
		
		s.compute();
		
		
		// sum에 직접 잘못된 값을 넣어서 잘못된 결과가 도출됨.

		System.out.printf("%s, %d, %d, %d, %d, %f\n", 
				s.name, s.kor, s.eng, s.math, s.getSum(), s.getAver());
		
		s.eng = 50;
		s.compute();
	}
}
