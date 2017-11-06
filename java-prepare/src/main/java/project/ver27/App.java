//: ## ver 27
//: - 컨트롤러 클래스들의 공통 점을 찾아 일반화시켜라!
//: - 즉 상속의 generalization을 수행하라!
//: - 학습목표
//:   - 상속의 generalization을 이용해 수퍼 클래스를 정의하는 방법을 익힌다.
//:   - 수퍼 클래스를 정의했을 때의 이점을 이해한다.
//: 
package project.ver27;

import java.util.HashMap;
import java.util.Scanner;

import project.ver27.control.BoardController;
import project.ver27.control.MemberController;
import project.ver27.control.ScoreController;
import project.ver27.control.GenericController;

//1) 상속의 generalization
//=> ScoreController, MemberController, BoardController의 
// 공통 변수나 메서드를 추출하여 클래스를 정의하고,
// 그 클래스를 상속 받는다.
//=> GenericController 클래스 정의
//
//2) Map을 이용하여 객체 보관
//=> 컨트롤러 클래스를 Map 객체에 보관하여 필요할 때 꺼내 쓴다.
//=> 다형적 변수를 이용하여 GenericController의 하위 클래스에 대해
// execute()를 호출한다.
//=> 이렇게 되면 새 컨트롤러를 추가하더라도 doGo() 메서드를 
// 변경할 필요가 없다.
//

public class App {
	
	static Scanner keyScan = new Scanner(System.in);
	
	static HashMap<String,GenericController<?>> controllerMap =
			new HashMap<>();
	
	public static void main(String[] args) {
		controllerMap.put("1", new ScoreController());
		controllerMap.put("2", new MemberController());
		controllerMap.put("3", new BoardController());
		
		loop:
		while (true) {
			System.out.print("명령> ");
			String[] input = keyScan.nextLine().toLowerCase().split(" ");

			try {
				switch (input[0]) {
				case "menu": doMenu(); break;
				case "help": doHelp(); break;
				case "quit": doQuit(); break loop;
				case "go" : doGo(input[1]); break;
				default:
					doError();
				}
			} catch (Exception e) {
				System.out.println("명령 처리 중 오류 발생!");
			}
			System.out.println();
		} // while

	} // main method

	private static void doGo(String menuNo) {
		GenericController<?> controller = controllerMap.get(menuNo);
	
		if (controller == null) {
			System.out.println("해당 번호의 메뉴가 없습니다.");
			return;
		}
		controller.execute(); // HashMap에 의해 각 Controller의 오버라이딩 된 execute()를 사용한다.
	}
	
	private static void doHelp() {
		System.out.println("[명령]");
		System.out.println("menu    - 메뉴 목록을 출력한다.");
		System.out.println("go 번호 - 메뉴로 이동한다.");
		System.out.println("quit    - 프로그램을 종료한다.");
	}

	private static void doMenu() {
		System.out.println("1 성적관리");
		System.out.println("2 회원관리");
		System.out.println("3 게시판  ");
	}

	private static void doError() {
		System.out.println("실행할 수 없는 명령입니다.");
	} // doError method

	private static void doQuit() {
		System.out.println("[프로그램을 종료합니다.]");
	} // doQuit method

} // App Class
