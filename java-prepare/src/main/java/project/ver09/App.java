//: ## ver 09
//: - 리팩토링(refactoring)을 수행한다.
//: - 즉 메서드를 관리하기 쉽도록 별도의 클래스로 분류하라!
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```

package project.ver09;

public class App {
		
	public static void main(String[] args) { 
		
		Score[] scores = {new Score(), new Score(), new Score()};
		
		Score.init(scores[0], "홍길동", 100, 90, 80);
		Score.init(scores[1], "임꺽정", 80, 80, 80);
		Score.init(scores[2], "유관순", 100, 100, 100);
		
		
		for (Score s : scores) {
			Score.print(s);
		}
	}
}
