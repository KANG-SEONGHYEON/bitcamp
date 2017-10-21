// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기 3

package bitcamp.java100.ch06.ex1;

//인스턴스 메서드 사용 
public class Test4 {
	public static void main(String[] args) {

		Score3 score;
		score = new Score3();
		System.out.printf("이름=%s\n", score.name);
		System.out.printf("총점=%s\n", score.sum);
		System.out.printf("평균=%s\n", score.aver);
		
		//score = new Score3; // 컴파일 오류!
		
		//score = new Score3("홍길동"); // Score3에는 문자열을 받는 생성자가 없다.
										// 컴파일 오류
		
		
	}
}
