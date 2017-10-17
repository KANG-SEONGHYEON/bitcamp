// ## 인스턴스를 다루는 메서드
// 

package bitcamp.java100.Test17_17.step1;

// 1 단계: 메서드 분리 전
public class Test {
	
    public static void main(String[] args) {
    	// 면적을 구하는 예제
    	
    	int width = 390; // 기본 단위 cm
    	int height = 420; // 단위 cm
    	
    	float area = (width * height) / 10000f; //(자동 형변환을 위해 f를 뒤에 붙여줌)
    	
    	System.out.println(area);
    	
    	float pyeong = area / 3.3f;
    	
    	System.out.println(pyeong);
    }
}

