// 다형성(polymorphism) - 다형적 변수(polymorphic variables)
// => 수퍼 클래스의 레퍼런스는 서브 클래스의 인스턴스를 주소를 저장할 수 있다.
//    왜? 서브 클래스의 인스턴스는 무조건 수퍼 클래스의 인스턴스를 모두 갖고 있기 때문이다.
// 
// => 그리고 분류 관점에서 상위 분류는 하위 분류의 항목을 가리킬 수 있다.
//    예) 동물 --> 사람, 
// => 주의! 하위 분류는 상위 분류의 항목을 가리킬 수 없다.
//    예) 사람 --> 포유류, 모든 포유류가 사람이 아니다. 그래서 불가하다!
// 
package ch08.ex2;

public class Test1 {
	public static void main(String[] args) {
		Vehicle v;
		v = new Vehicle();
		v = new Boat();
		v = new Car();
		v = new Truck();
		v = new Sedan();
		
		Boat b;
		b = new Boat();
		//b = new Vehicle();
		
		Car c;
		c = new Car();
		c = new Truck();
		c = new Sedan();
		
		Sedan s;
		s = new Sedan();
		
		Sedan r1;
		Vehicle r2;
		
	}
}
