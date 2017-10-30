// 다형성 - 오버라이딩 사용 후

package bitcamp.java100.ch08.ex3;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		while (true) {
			Score2 s = new Score2();
			s.setNo(Prompts.inputInt("번호? "));
			s.setName(Prompts.inputString("이름? "));
			s.setKor(Prompts.inputInt("국어? "));
			s.setEng(Prompts.inputInt("영어? "));
			s.setMath(Prompts.inputInt("수학? "));
			
			list.add(s);
			// score2는 Object의 toString()을 재정의 하였기 때문에
			// 다음 코드에서 호출되는 것은 
			// score의 수퍼클래스인 Object의 toString()을 호출하는 것이다.
			// Object의 
			System.out.println(s.toString()); // println은 자동으로 문자열이 오면 알아서 toString으로 받음.
			
			if (!Prompts.confirm("계속 하시겠습니까? ")) {
				break;
			}
		}
	}
}
