// 스태틱 변수의 활용 - 상수를 사용하기 전

package ch06.ex6;

public class Test3 {

	public static void main(String[] args) throws Exception {
		Car2[] cars = new Car2[6];

		cars[0] = new Car2("티코", 900, Car3.TYPE_BUS, Car3.USE_COMPANY);
		cars[1] = new Car2("티코", 900, Car3.TYPE_SEDAN, Car3.USE_PRIVATE);
		cars[2] = new Car2("티코", 900, Car3.TYPE_TRUCK, Car3.USE_COMMERCIAL);

		cars[3] = new Car2("소나타", 1980, Car3.TYPE_TRUCK, Car3.USE_PRIVATE);
		cars[4] = new Car2("소나타", 1980, Car3.TYPE_SEDAN, Car3.USE_COMPANY);
		cars[5] = new Car2("소나타", 1980, Car3.TYPE_BUS, Car3.USE_COMMERCIAL);

		System.out.printf("총 생산량 = %d 대\n", Car2.count);
		
		for (int i = 0; i < cars.length; i++) {
			System.out.printf("%d, %s, %d, %d, %d\n", cars[i].no, cars[i].model, cars[i].cc, cars[i].type, cars[i].use);
		}
	}

}
