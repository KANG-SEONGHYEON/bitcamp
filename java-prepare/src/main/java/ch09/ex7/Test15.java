package ch09.ex7;

import java.util.HashMap;
import java.util.Iterator;

public class Test15 {
	
	static class Contact {
		String name;
		String email;
		String tel;
		
		public Contact(String name, String email, String tel) {
			this.name = name;
			this.name = name;
			this.tel = tel;
		}
	}
	
	@Override
	public String toString() {
		return "Test15 []";
	}
	
	public static void main(String[] args) {
		
		HashMap<String,Contact> map = new HashMap<>();
		
		Contact c1 = new Contact("홍길동", "hong@test.com", "1111-1111");
		Contact c2 = new Contact("홍길동2", "hong2@test.com", "1111-1112");
		Contact c3 = new Contact("홍길동3", "hong3@test.com", "1111-1113");
		
		map.put("aaa", c1);
		map.put("bbb", c2);
		map.put("ccc", c3);
		
		// ArrayList에서 "데이터를 꺼내주는 객체"를 얻는다.
		Iterator<Contact> iterator = map.values().iterator();
		
		// "데이터를 꺼내주는 객체"를 통해 값을 꺼낸다.
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}