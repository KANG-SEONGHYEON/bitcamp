// ## 메서드 - 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드 II
// - 메서드를 이용하여 인스턴스를 다루는 방법을 알아보자!
//
package bitcamp.java100.Pre17_17.step02;

// 2단계: 메서드 분리 후
public class Test {

	// 평방미터를 구하는 메서드
	static float area(int width, int height) {
		return (width * height) / 10000f;
	}
	
	// 평을 구하는 메서드
	static float pyeong(int width, int height) {
		return (width * height) / 10000f / 3.3f;
	}
	
    public static void main(String[] args) {
    	
    	// 면적을 구하는 예제
    	// 1) 면적을 계산 할 때 필요한 데이터를 저장할 변수 선언
    	int width = 390; // 단위 : cm
    	int height = 420; // 단위 : cm
    	
    	System.out.println(area(width, height));
    	
    	// => 평으로 출력하기 (1평 = 3.3제곱미터)
    	System.out.println(pyeong(width, height));
    }
}