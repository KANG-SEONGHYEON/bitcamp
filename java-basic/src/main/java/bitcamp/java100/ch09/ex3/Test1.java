// 역할:
// => 한 개의 값을 저장.
// => 다음 상자의 위치를 가리킨다.
package bitcamp.java100.ch09.ex3;

public class Test1 {
	static void printList(LinkedList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("홍길동");
		list.add("임꺽정");
		list.add("유관순");
		list.add("안중근");
		list.add("윤봉길");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
		
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		list.insert(2, "김구");
		printList(list);
		
		list.insert(0, "김원봉");
		printList(list);
		
		list.insert(6, "신채호");
		printList(list);
		
		
	}
}
