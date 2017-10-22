package ch02;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListoverlap {
	public static void main(String[] args) {		
		ArrayList<String> list = new ArrayList<>();
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
		
		HashSet<String> set = new HashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		
		for (String n : set) {
			System.out.println(n);
		}
	}
}
