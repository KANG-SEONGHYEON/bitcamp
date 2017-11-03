//: ## ver 21
//: - 메뉴 기능을 추가하라!
//: - 요구사항 명세는 App.java 주석을 보라!
//: - 학습목표
//:   - 클래스 문법을 사용하여 관련 기능을 묶어서 분류하는 기법을 익한다.
//:   - 콘솔에서 사용자 입력을 다루는 방법을 연습한다.
//: 
//: 
//: 요구사항 
/*
명령> menu
1 성적관리
2 회원관리
3 게시판

명령> help
[명령]
menu        - 메뉴 목록 출력한다.
go 번호     - 메뉴로 이동한다.
quit        - 프로그램을 종료한다.

명령> quit
프로그램을 종료합니다.

명령> ok
잘못된 명령입니다.

명령> go 1

성적관리> list
...

 */
package project.ver21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//9단계:
//=> 성적 변경 기능 중에서 사용자가 점수를 입력할 때
// 엔터를 입력하거나 숫자가 아닌 값을 입력할 경우 
// 예외 처리한다.
// Score 클래스의 update()
public class App01 {
	static Scanner keyScan = new Scanner(System.in);
	

	public static void main(String[] args) {
		ScoreController scoreController = new ScoreController();

		loop: while (true) {
			System.out.print("명령> ");
			String input = keyScan.nextLine();
			System.out.println(input);
			/*
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
			*/
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
