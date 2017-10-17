package bitcamp.java100.Pre17_17.step06;

public class Rect {
	int width;
	int height;

	// 평방미터를 구하는 메서드
	/*static*/ float area() {
		return (this.width * this.height) / 10000f;
	}
	
	// 평을 구하는 메서드
	/*static*/ float pyeong() {
		return (this.width * this.height) / 10000f / 3.3f;
	}
}
