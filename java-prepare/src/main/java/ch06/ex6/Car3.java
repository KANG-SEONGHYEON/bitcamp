package ch06.ex6;

public class Car3 {
	public final static int TYPE_TRUCK = 1;
	public final static int TYPE_SEDAN = 2;
	public final static int TYPE_BUS = 3;
	
	public final static int USE_PRIVATE = 1;
	public final static int USE_COMPANY = 2;
	public static final int USE_COMMERCIAL = 3;
	
	static int count;

	// 각 차량마다 고유정보를 저장하는 변수는 인스턴스 변수로 선언해야 한다.
	long no;
	String model;
	int cc;
	int type; // 트럭은 1, 승용은 2, 승합은 3
	int use; // 개인은 1, 법인은 2 영업은 3

	Car3(String model, int cc, int type, int use) {
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
