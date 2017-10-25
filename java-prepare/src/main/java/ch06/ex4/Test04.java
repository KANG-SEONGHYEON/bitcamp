package ch06.ex4;

// 4단계: 클래스 분리

public class Test04 {

	public static void main(String[] args) {
		// 2 + 5 * 3 - 7 / 2 = ?
		// 단 연산자 우선순위는 적용하지 않고 그냥 순서대로 계산하라!
		
		// 기본값 0 + 2
		Calculator1.plus(2);
		Calculator1.plus(5);
		Calculator1.multiple(3);
		Calculator1.minus(7);
		Calculator1.divibe(2);
		
		System.out.println(Calculator1.result);
	}
}
