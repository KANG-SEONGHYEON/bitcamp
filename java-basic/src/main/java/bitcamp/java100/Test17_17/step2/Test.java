// ## 인스턴스를 다루는 메서드
// 

package bitcamp.java100.Test17_17.step2;

// 2 단계: 메서드 분리 후
public class Test {
	
	static float area(int width, int height) {
		return (width * height) / 10000f;
	}
	
	static float pyeong(int width, int height) {
		return (width * height) / 10000f / 3.3f;
	}
	
    public static void main(String[] args) {
    	// 면적을 구하는 예제
    	
    	int width = 390; // 기본 단위 cm
    	int height = 420; // 단위 cm
    	
    	System.out.println(area(width, height));
    	
    	System.out.println(pyeong(width, height));
    }
}

