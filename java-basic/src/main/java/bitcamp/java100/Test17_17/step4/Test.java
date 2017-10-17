// ## 인스턴스를 다루는 메서드
// 

package bitcamp.java100.Test17_17.step4;

// 4 단계: Rect 클래스를 별도의 파일로 분리
public class Test {
	
	static float area(Rect r) {
		return (r.width * r.height) / 10000f;
	}
	
	static float pyeong(Rect r) {
		return (r.width * r.height) / 10000f / 3.3f;
	}
	
    public static void main(String[] args) {
    	// 면적을 구하는 예제
    	Rect rect;
    	rect = new Rect();
    	
    	rect.width = 390;
    	rect.height = 420;
    	
    	System.out.println(area(rect));
    	
    	System.out.println(pyeong(rect));
    }
}

