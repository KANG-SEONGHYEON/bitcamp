package bitcamp.java100.ch06.ex6;

public class Car2 {
	//모든 차량이 공유하는 변수는 스태틱 변수로 선언해야 한다.
	static int count;
	
	
	// 각 차량마다 고유정보를 저장하는 변수는 인스턴스 변수로 선언해야 한다.
	long no;
	String model;
	int cc;
	int type; // 트럭=1, 승용=2, 승합=3
	int use; // 개인=1, 법인=2, 영업=3
	
	Car2(String model, int cc, int type, int use) {
		count++;
		this.model = model;
		this.cc = cc;
		this.no = System.currentTimeMillis();
		this.type = type;
		this.use = use;
		
		
		try {
		Thread.currentThread().sleep(50);
		} catch (Exception e) {}
	}
}