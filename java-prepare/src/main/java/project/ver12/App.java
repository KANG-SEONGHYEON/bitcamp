
//: ## ver 12 
//: - Score 객체의 주소를 저장하고 꺼내는 코드를 별도의 클래스로 분리하라!
//: - 학습 목표
//:   - 기능 별로 클래스를 분류하는 과정을 이해하고 연습한다.
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```
 
package project.ver12;

import java.util.Scanner;

public class App {
	
	static boolean confirm(String message) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();
		
		if (response.equals("y") || response.equals("yes"))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		Score[] scores = new Score[100];
		int cursor = 0;
		
		while (true) {
			Score score = new Score();
			score.input();
			
			scores[cursor++] = score;
			
			if (!confirm("계속하시려면 Y 또는 YES"))
				break;
		}
		
		
		for (int i = 0; i < cursor; i++) {
			scores[i].print();
		}
	}
	
}
