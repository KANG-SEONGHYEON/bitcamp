// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기 3

package bitcamp.java100.ch06.ex1;

//인스턴스 메서드 사용 
public class Test11 {
	public static void main(String[] args) {

		Score10 score;
		
		score = new Score10();
		
		System.out.printf("이름=%s\n", score.name);
		System.out.printf("총점=%s\n", score.sum);
		System.out.printf("평균=%s\n", score.aver);
		
	}
}
