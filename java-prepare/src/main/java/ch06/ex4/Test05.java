package ch06.ex4;

// 5단계: static 변수의 한계

public class Test05 {

	public static void main(String[] args) {
		/* 다음 두 개의 식을 동시에 계산해보자!
		 * 2 + 5 * 3 - 7 / 2 = ?
		 * 3 * 6 - 5 + 11 / 2 = ?
		 * 연산자 우선순위 없이 순서대로 계산하라! 
		 */
		
		// 첫 번째 식 계산 2 + 5 * 3 - 7 / 2 = ?
		Calculator1.plus(2);
		Calculator1.plus(5);
		Calculator1.multiple(3);
		Calculator1.minus(7);
		Calculator1.divibe(2);
		System.out.println(Calculator1.result);
		
		// 두 번째 식 계산  3 * 6 - 5 + 11 / 2 = ?
		Calculator1.result = 0;
		Calculator1.plus(3);
		Calculator1.multiple(6);
		Calculator1.minus(5);
		Calculator1.plus(11);
		Calculator1.divibe(2);
		System.out.println(Calculator1.result);
		
	}
}
