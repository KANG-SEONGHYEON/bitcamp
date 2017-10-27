// 캡슐화의 존재 이유 - 필드와 프로퍼티, 그리고 셋터/겟터
// 
package bitcamp.java100.ch08.ex1;

// 스포츠 센터 Gym 회원을 추상화 해보자!

class Member3 {
	//필드
	private String name;
	private int age;
	private float weight;
	private float height;

	// 셋터 = 필드의 값을 설정하는 setXxxx() 메서드를 셋터라 부른다.
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 겟터 = 필드의 값을 꺼내는 getXxxx() 메서드이다.
	
	public String getName() {
		return this.name;
	}
	
	// 셋터/겟터를 다른 말로 프로퍼티라고 부른다.
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
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
		
		//m.name = "홍길동";
		//m.age = 20;
		
		//m.weight = 900.7f;
		//m.height = 16.0f;
		
		m.setName("홍길동");
		m.setAge(300);
		m.setWeight(500);
		m.setHeight(-200);
		
		System.out.printf("%s, %d, %f, %f\n", m.getName(), m.getAge(), m.getWeight(), m.getHeight());
	}
}
