package ch06.ex4;

// 3단계: static 변수 사용 
public class Test03 {
	
	static int result;
	
	static void plus(int value) {
		result += value;
	}
	static void minus(int value) {
		result -= value;
	}
	static void multiple(int value) {
		result *= value;
	}
	static void divibe(int value) {
		result /= value;
	}
	
	public static void main(String[] args) {
		// 2 + 5 * 3 - 7 / 2 = ?
		// 단 연산자 우선순위는 적용하지 않고 그냥 순서대로 계산하라!
		
		// 기본값 0 + 2
		plus(2);
		plus(5);
		multiple(3);
		minus(7);
		divibe(2);
		
		System.out.println(result);
	}
}
