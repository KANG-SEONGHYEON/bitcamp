// 캡슐화 활용 - 메서드를 private으로?
// 

package ch08.ex1;

class Score5 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float aver;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		this.compute();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		this.compute();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		this.compute();
	}

	private void compute() {
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

public class Test8_5 {
	public static void main(String[] args) {
		Score4 s = new Score4();
		s.name = "홍길동";
		
		s.setKor(100);
		s.setEng(90);
		s.setMath(80);
		
		//s.compute();

		System.out.printf("%s, %d, %d, %d, %d, %f\n", 
				s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
		// 언제든지 한 과목의 점수를 바꾸더라도 자동으로 합계와 평균이 다시 계산된다.
		s.setEng(50);
		System.out.printf("%s, %d, %d, %d, %d, %f\n", 
				s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());
		
	}
}
