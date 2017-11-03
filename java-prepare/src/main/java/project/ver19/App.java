//: ## ver 19
//: - 사용자 명령을 처리하는 코드를 메서드로 분리하라!
//: - 학습목표
//:  - 코드 관리를 쉽게하기 위해 메서드를 이용하는 기법을 익힌다.
//:  - 리팩토링의 기법 중 "extract method"의 이점에 대해 이해한다.
//: 
//: 
package project.ver19;

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
	static ArrayList<Score> list = new ArrayList<>();

	public static void main(String[] args) {
		Iterator<Score> iterator;

		loop: while (true) {
			System.out.print("성적관리> ");
			String input = keyScan.nextLine();

			// 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
			switch (input) {
			case "add": doAdd(); break;
			case "list": doList(); break;
			case "view": doView(); break;
			case "update": doUpdate(); break;
			case "delete": doDelete(); break;
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

	private static void doDelete() {
		System.out.println("[학생 삭제]");
		String name = prompt("이름? ");
		
		Score score = null;
		Iterator<Score> iterator = list.iterator();
		while (iterator.hasNext()) {
			Score temp = iterator.next();
			if (temp.name.equals(name)) {
				score = temp;
				break;
			}
		}

		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			if (confirm2("정말 삭제하시겠습니까?(y/N) ")) {
				list.remove(score);
				System.out.println("삭제하였습니다.");
			} else {
				System.out.println("삭제를 취소하였습니다.");
			}
		}
	} // doDelete method

	private static void doUpdate() {
		System.out.println("[학생 정보 변경]");
		String name = prompt("이름? ");
		
		Score score = null;
		Iterator<Score> iterator = list.iterator();
		while (iterator.hasNext()) {
			Score temp = iterator.next();
			if (temp.name.equals(name)) {
				score = temp;
				break;
			}
		}
		
		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			score.update();
		}
	} // doUpdate method

	private static void doView() {
		System.out.println("[학생 정보]");
		String name = prompt("이름? ");
		
		Score score = null;
		Iterator<Score> iterator = list.iterator();
		while (iterator.hasNext()) {
			Score temp = iterator.next();
			if (temp.name.equals(name)) {
				score = temp;
				break;
			}
		}

		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			score.printDetail();
		}
	} // doView method

	private static void doList() {
		System.out.println("[학생 목록]");
		
		Iterator<Score> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	} // doList method

	private static void doAdd() {
		System.out.println("[학생 등록]");
		
		Score score;
		while (true) {
			score = new Score();
			score.input();
			
			list.add(score);
			
			if (!confirm("계속하시겠습니까?(Y/n) "))
				break;
		}
		
	} // doAdd method

	static String prompt(String message) {
		System.out.print(message);
		return keyScan.nextLine();
	} // prompt method

	static boolean confirm(String message) {
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("y") || response.equals("yes") || response.equals("")) {
			return true;
		}
		return false;
	} // confirm method

	static boolean confirm2(String message) {
		System.out.print(message);
		String response = keyScan.nextLine().toLowerCase();

		if (response.equals("n") || response.equals("no") || response.equals("")) {
			return false;
		}
		return true;
	} // confirm2 method
	
} // App Class
