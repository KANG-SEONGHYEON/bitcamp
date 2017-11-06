package project.ver26.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import project.ver26.domain.Score;
import project.ver26.util.Prompts;

public class ScoreController {
    
    static Scanner keyScan = new Scanner(System.in);

    private ArrayList<Score> list = new ArrayList<>();
    
    public void execute() {
        loop:
        while (true) {
            System.out.print("성적관리> ");
            String input = keyScan.nextLine();
            
            // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
            switch (input) {
            case "add": this.doAdd(); break;
            case "list": this.doList(); break;
            case "view": this.doView(); break;
            case "update": this.doUpdate(); break;
            case "delete": this.doDelete(); break;
            case "main": break loop;
            default: 
                System.out.println("해당 명령이 없습니다.");
            }
        }
    }
    
    // 이전에는 App 클래스에서 doXxx() 메서드를 호출하기 때문에
    // 공개하였다.
    // 지금은 App 클래스에서 직접 doXxx()를 호출하는 게 아니라,
    // 같은 멤버인 execute()에서 호출하기 때문에 공개할 필요가 없다.
    // => 객체지향 프로그래밍에서는 가능한 공개 범위를 줄이는 것이
    //    유지보수에 좋다.
    //    즉 공개할 필요가 있을 때만 공개하라!
    // 
	private void doDelete() {
		System.out.println("[성적 삭제]");
		String name = Prompts.inputString("이름? ");

		Score score = findByName(name);

		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {
			if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
				list.remove(score);
				System.out.println("삭제하였습니다.");
			} else {
				System.out.println("삭제를 취소하였습니다.");
			}
		}
	}

	private void doUpdate() {
		System.out.println("[성적 변경]");
		String name = Prompts.inputString("이름? ");

		Score score = findByName(name);

		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
		} else {

			int kor = score.getKor();
			try {
				kor = Prompts.inputInt("국어?(%d) ", score.getKor());
			} catch (Exception e) {
			}

			int eng = score.getEng();
			try {
				eng = Prompts.inputInt("영어?(%d) ", score.getEng());
			} catch (Exception e) {
			}

			int math = score.getMath();
			try {
				math = Prompts.inputInt("수학?(%d) ", score.getMath());
			} catch (Exception e) {
			}

			if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
				score.setKor(kor);
				score.setEng(eng);
				score.setMath(math);
				System.out.println("변경하였습니다.");

			} else {
				System.out.println("변경을 취소하였습니다.");
			}
		}
	}

	private void doView() {
		System.out.println("[성적 상세 정보]");
		String name = Prompts.inputString("이름? ");

		Score score = findByName(name);

		if (score == null) {
			System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
			return;
		}

		System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
				score.getName(), score.getKor(), score.getEng(),
				score.getMath(), score.getSum(), score.getAver());
	}

	private void doList() {
		System.out.println("[성적 목록]");

		Iterator<Score> iterator = list.iterator();
		while (iterator.hasNext()) {
			Score score = iterator.next();
			System.out.printf("%-4s, %4d, %6.1f\n", 
					score.getName(), score.getSum(), score.getAver());
		}
	}

	private void doAdd() {
		System.out.println("[성적 등록]");

		Score score = new Score();
		score.setName(Prompts.inputString("이름? "));
		score.setKor(Prompts.inputInt("국어? "));
		score.setEng(Prompts.inputInt("영어? "));
		score.setMath(Prompts.inputInt("수학? "));

		list.add(score);
	}

	private Score findByName(String name) {
		Iterator<Score> iterator = list.iterator();
		while (iterator.hasNext()) {
			Score score = iterator.next();
			if (score.getName().equals(name)) {
				return score;
			}
		}
		return null;
	}
}
