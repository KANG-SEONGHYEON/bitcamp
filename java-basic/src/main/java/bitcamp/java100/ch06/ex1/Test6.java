// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기 3

package bitcamp.java100.ch06.ex1;

//인스턴스 메서드 사용 
public class Test6 {
	public static void main(String[] args) {

		Score5 score;
		
		score = new Score5();
		score = new Score5("임꺽정", 100, 100, 100);
		score = new Score5("유관순");
		
		//score = new Score5(100, 100, 100); // 컴파일 오류!
		
		
	}
}
