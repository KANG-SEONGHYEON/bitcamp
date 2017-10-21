// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기

package bitcamp.java100.ch06.ex1;
// 사용자 정의 데이터 타입을 만든다.
public class Test2 {
	public static void main(String[] args) {

		Score score;
		
		score = new Score();
		
		score.name = "홍길동";
		score.kor = 100;
		score.eng = 100;
		score.math = 100;
		score.sum = score.kor + score.eng + score.math;
		score.aver = score.sum / 3f;
		
		//
		
	}
}
