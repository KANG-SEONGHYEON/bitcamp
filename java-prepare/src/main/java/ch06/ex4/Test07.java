package ch06.ex4;

// 7단계: 인스턴스 메서드의 활용

public class Test07 {

	public static void main(String[] args) {
		/* 다음 두 개의 식을 동시에 계산해보자!
		 * 2 + 5 * 3 - 7 / 2 = ?
		 * 3 * 6 - 5 + 11 / 2 = ?
		 * 연산자 우선순위 없이 순서대로 계산하라! 
		 */
		
		/* 각 식의 계산 결과를 개별적으로 관리하기 위해
		 * result 변수가 들어 있는 인스턴스를 준비한다.
		 */
		Calculator3 c1 = new Calculator3();
		Calculator3 c2 = new Calculator3();
		
		c1.plus(2);
		c1.plus(5);
		c1.multiple(3);
		c1.minus(7);
		c1.divibe(2);
		System.out.println(c1.result);
		
		// 두 번째 식 계산  3 * 6 - 5 + 11 / 2 = ?
		c2.plus(3);
		c2.multiple(6);
		c2.minus(5);
		c2.plus(11);
		c2.divibe(2);
		System.out.println(c2.result);
		
	}
}
