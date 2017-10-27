package ch06.ex6;

public class Car2 {
	// 모든 차량이 공유하는 변수는 스태틱 변수로 선언해야 한다.
	static int count;

	// 각 차량마다 고유정보를 저장하는 변수는 인스턴스 변수로 선언해야 한다.
	long no;
	String model;
	int cc;
	int type; // 트럭은 1, 승용은 2, 승합은 3
	int use; // 개인은 1, 법인은 2 영업은 3

	Car2(String model, int cc, int type, int use) {
		count++;

		this.model = model;
		this.cc = cc;
		this.type = type;
		this.use = use;

		this.no = System.currentTimeMillis();

		try {
			Thread.currentThread().sleep(50);
		} catch (Exception e) {}
	}

}
