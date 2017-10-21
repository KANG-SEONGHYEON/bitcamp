// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기 3

package bitcamp.java100.ch06.ex1;

//인스턴스 메서드 사용 
public class Test3 {
	public static void main(String[] args) {

		Score2 score;
		score = new Score2();

		score.name = "홍길동";
		score.kor = 100;
		score.eng = 100;
		score.math = 100;

		// 학생의 성적 데이터를 계산할 때
		score.compute();

	}
}
