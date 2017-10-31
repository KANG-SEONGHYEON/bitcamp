package ch08.ex5;

public class Score {
	protected int no;
	protected String name;
	protected int kor;
	protected int eng;
	protected int math;
	protected int sum;
	protected float aver;
	
	public Score() {}
	
	public Score(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.compute();
	}
	
	protected void compute() {
		this.sum = this.kor + this.eng + this.math;
		this.aver = this.sum / 3f;
	}
}
