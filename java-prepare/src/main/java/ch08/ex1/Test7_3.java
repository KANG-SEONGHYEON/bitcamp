// 캡슐화의 존재 이유 - 필드와 프로퍼티, 그리고 셋터/겟터
// 
package ch08.ex1;

class Member3 {
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
		
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}

public class Test7_3 {
	public static void main(String[] args) {
		Member3 m = new Member3();
		m.setName("홍길동");
		m.setAge(200);
		m.setWeight(500);
		m.setHeight(-200);
		
		System.out.printf("%s, %d, %f, %f\n", 
				m.getName(), m.getAge(), m.getWeight(), m.getHeight());
	}
}
