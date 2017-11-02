package ch09.ex4;
public class StackCh {
	private class Box {
		Object value;
		Box next;

		public Box() {}

		public Box(Object value) {
			this.value = value;
		}
	}
	
	Box top;
	
	int len;
	
	public void push(Object value) {
		// 새 상자를 만들어 값을 저장한다.
		Box box = new Box(value);
		
		// 새 상자가 이전의 꼭대기 상자를 가리키게 한다.
		box.next = top;
		
		// 새 상자가 주소를 꼭대기 상자 주소로 바꾼다.
		top = box;
		
		len++;
	}
	
	public int size() {
		return len;
	}
	
	public Object pop() {
		if (len == 0)
			return null;
	
	
	Box box = top;
	top = top.next;
	len--;
	
	return box.value;

	}
}