// 다형성 (polymorphism) - 다형적 변수

package bitcamp.java100.ch08.ex2;

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
	/* b = new Vehicle();
	 * b = new Car();
	 * b = new Truck;
	 * b = new Sedan;
	 */
	 
	 Car c;
	 c = new Car();
	 c = new Truck();
	 c = new Sedan();
	 /*c = new Boat(); 다른 파생 분류 가리킬 수 없다.
	  *c = new Vehicle(); 상위 분류를 가리킬 수 없다.
	  */
	 
	 Sedan s;
	 s = new Sedan();
	 /* s = new Truck();
	  * s = new Car();
	  * s = new Boat();
	  * s = new Vehicle();
	  */
	 
	 Sedan r1;
	 Vehicle r2;
	}
}