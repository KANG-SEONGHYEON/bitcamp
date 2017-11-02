// 컬렉션 API - HashMap III

package bitcamp.java100.ch09.ex7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test11 {
	
	static class Contact {
		String name;
		String email;
		String tel;
		
		public Contact(String name, String email, String tel) {
			this.name = name;
			this.email = email;
			this.tel = tel;
		}

		@Override
		public String toString() {
			return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
		}

		
		
	}
	
	public static void main(String[] args) {
		
		// key-value 한 쌍으로 이루어진 값을 보관할 때
		// key는 값을 저장하고 찾을 때 사용한다.
		// value는 보관하고자 하는 값을 말한다.
		HashMap<String,Contact> map = new HashMap<>();
		
		
		
		map.put("c01", new Contact("홍길동1", "Hong@test.com", "1111-1111"));
		map.put("c02", new Contact("홍길동2", "Hong@test.com", "1111-1111"));
		map.put("c03", new Contact("홍길동3", "Hong@test.com", "1111-1111"));
		map.put("c04", new Contact("홍길동4", "Hong@test.com", "1111-1111"));
		map.put("c05", new Contact("홍길동4", "Hong@test.com", "1111-1111"));
		
		
		Collection<Contact> values = map.values();
		
		for (Contact c : values) {
			System.out.println(c.toString());
		}
		
	}
}
