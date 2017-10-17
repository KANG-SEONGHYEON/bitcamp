// ## 메서드 - 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드 VI
// - 메서드를 이용하여 인스턴스를 다루는 방법을 알아보자!
//
package bitcamp.java100.Pre17_17.step06;

// 6단계: 인스턴스의 값을 다루는 메서드는 해당 인스턴스의 전용 메서드로 만든다.
public class Test {
    public static void main(String[] args) {
    	// 면적을 구하는 예제
    	// 1) 면적을 계산할 때 필요한 데이터를 저장할 변수 선언
    	Rect rect;// 인스턴스 주소를 저장할 레퍼런스 선언
    	rect = new Rect();// 인스턴스 생성하고 그 주소를 레퍼런스에 저장한다. (Heap에 메모리 할당)
    	
    	// 인스턴스의 각 필드(항목)에 값을 저장한다.
    	rect.width = 390;
    	rect.height = 420;
    	
    	System.out.println(rect.area());
    	
    	// => 평으로 출력하기 (1평 = 3.3제곱미터)
    	System.out.println(rect.pyeong());
    }
}