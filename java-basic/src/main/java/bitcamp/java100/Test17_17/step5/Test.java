// ## 인스턴스를 다루는 메서드
// 

package bitcamp.java100.Test17_17.step5;

// 5 단계: 넓이를 구하는 메서드를 별도의 클래스로 분류한다.
public class Test {
	

    public static void main(String[] args) {
    	// 면적을 구하는 예제
    	Rect rect;
    	rect = new Rect();
    	
    	rect.width = 390;
    	rect.height = 420;
    	
    	System.out.println(Rect.area(rect));
    	
    	System.out.println(Rect.pyeong(rect));
    }
}

