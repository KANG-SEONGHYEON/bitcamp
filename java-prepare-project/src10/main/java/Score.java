/* 생성자와 인스턴스 메서드 도입
 * - init() 메서드 대신 생성자를 이용하여 인스턴스를 초기화시킨다.
 * - print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신
 *   인스턴스 메서드로 전환한다.
 */
public class Score {
	
	
	String name;
	int[] subjects;
	int sum;
	float aver;
	
	Score() {}
	
	Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.subjects = new int[] {kor, eng, math};
		this.compute();
		
	}
	
	// 합계와 평균을 계산하는 코드를 다음과 같이 별도의 메서드로 분리한다.
	void compute() {
		for (int sub : this.subjects) {
			this.sum += sub;
		}
		
		this.aver = (float)this.sum / this.subjects.length;
	}

	// 성적 데이터를 출력하는 코드를 별도의 메서드로 분리한다. 
	void print() {
		System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",
				this.name, 
				this.subjects[0], 
				this.subjects[1], 
				this.subjects[2], 
				this.sum, 
				this.aver);
	}
}
