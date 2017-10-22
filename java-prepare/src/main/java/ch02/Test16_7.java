package ch02;

public class Test16_7 {
	public static void main(String[] args) {
		String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
		
		for (String n : names)
			System.out.println(n);
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");
		
		int[] kor = {100, 90, 80, 90, 50, 80};
		
		for (int score : kor) {
			System.out.println(score);
		}
		
		int s = 0;
		
		/* 컴파일 오류! for 블록 밖에 변수를 선언하고 사용불가.
		 * for (s : kor) {
			System.out.println(s);
		}
		*/
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");
		
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		list.add("홍길동");
		list.add("임꺽정");
		list.add("유관순");
		list.add("안중근");
		list.add("윤봉길");
		list.add("홍길동");
		list.add("임꺽정");
		
		for (String n : list) {
			System.out.println(n);
		}
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");
		
		java.util.HashSet<String> set = new java.util.HashSet<>();
		set.add("홍길동");
		set.add("임꺽정");
		set.add("유관순");
		set.add("안중근");
		set.add("윤봉길");
		set.add("홍길동");
		set.add("임꺽정");
		
		for (String n : set) {
			System.out.println(n);
		}
	}
}
