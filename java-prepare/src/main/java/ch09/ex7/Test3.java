// 컬렉션 API - HashSet
package ch09.ex7;

import java.util.HashSet;

public class Test3 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		String s1 = "홍길동";
		String s2 = "임꺽정";
		String s3 = "유관순";
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		// 집합의 특징을 구현했기 때문에, 같은 인스턴스를 중복 저장할 수 없다.
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		set.add(null);
		set.add(null);
		
		// 컬렉션에 저장된 객체(주소)들의 개수
		System.out.println(set.size());
		
		/* 값을 배열로 꺼내고 싶다면, 값을 모두 담을 수 있는 배열을 만든 다음에,
		 * toArray()의 파라미터로 배열 주소를 넘겨라!
		 * 그러면 배열에 객체들의 주소를 담아줄 것이다.
		 * 만약 파라미터로 제공된 배열을 크기가 HashSet에 보관된 객체들의 수 보다 작다면
		 * 따로 배열을 새로 만든 다음에 그 배열의 주소를 리턴할 것이다.
		 */
		
		String[] arr = new String[set.size()];
		String[] arr2 = set.toArray(arr);
		
		if (arr == arr2)
			System.out.println("arr == arr2");
		else
			System.out.println("arr != arr2");
		
		// 컬렉션에서 객체를 꺼낼 때 저장 순서대로 꺼낼 수 없다.
		for (String s : arr) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
}
