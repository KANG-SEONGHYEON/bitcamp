// 캡슐화의 존재 이유 - 멤버의 접근을 제한하기
// => 변수의 경우 멤버의 접근을 제한하는 대신 
//    외부에서 변수의 값을 넣고 뺄 수 있도록 그 방법(method)를 제공한다.
// 

package ch08.ex1;

// GYM 회원을 추상화 해보자!
class Member2 {
	private String name;
	private int age;
	private float weight;
	private float height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0 || age > 150)
			return;
		
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		if (weight <= 0 || weight > 200)
			return;
		
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		if (height <= 0 || height > 250)
			return;
		this.height = height;
	}

}

public class Test7_2 {
	public static void main(String[] args) {
		Member2 m = new Member2();
		m.setName("홍길동");
		m.setAge(200);
		m.setWeight(500);
		m.setHeight(-200);
		
		System.out.printf("%s, %d, %f, %f\n", 
				m.getName(), m.getAge(), m.getWeight(), m.getHeight());
	}
}
