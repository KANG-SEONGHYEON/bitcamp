// ## 인스턴스를 다루는 메서드
// 

package bitcamp.java100.Test17_17.step6;

// 6 단계: 인스턴스의 값을 다루는 메서드는 해당 인스턴스의 전용 메서드로 만든다.
public class Test {
	
    public static void main(String[] args) {

    	Rect r;
    	r = new Rect();
    	
    	r.width = 390;
    	r.height = 420;
    	
    	System.out.println(r.area());
    	System.out.println(r.pyeong());
    }
}

