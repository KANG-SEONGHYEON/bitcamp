//: ## ver 19
//: - 사용자 명령을 처리하는 코드를 메서드로 분리하라!
//: - 학습목표
//:  - 코드 관리를 쉽게하기 위해 메서드를 이용하는 기법을 익힌다.
//:  - 리팩토링의 기법 중 "extract method"의 이점에 대해 이해한다.
//: 
//: 
package project.ver20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//9단계:
//=> 성적 변경 기능 중에서 사용자가 점수를 입력할 때
// 엔터를 입력하거나 숫자가 아닌 값을 입력할 경우 
// 예외 처리한다.
// Score 클래스의 update()
public class App {
	static Scanner keyScan = new Scanner(System.in);
	

	public static void main(String[] args) {
		ScoreController scoreController = new ScoreController();

		loop: while (true) {
			System.out.print("성적관리> ");
			String input = keyScan.nextLine();

			// 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
			switch (input) {
			case "add": scoreController.doAdd(); break;
			case "list": scoreController.doList(); break;
			case "view": scoreController.doView(); break;
			case "update": scoreController.doUpdate(); break;
			case "delete": scoreController.doDelete(); break;
			case "quit": doQuit(); break loop;
			default: doError();
			}
			System.out.println();
		}
	} // main method
	
	private static void doError() {
		System.out.println("실행할 수 없는 명령입니다.");
	} // doError method

	private static void doQuit() {
		System.out.println("[프로그램을 종료합니다.]");
	} // doQuit method

	
	
} // App Class
