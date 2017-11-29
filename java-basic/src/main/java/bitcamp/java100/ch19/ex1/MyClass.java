package bitcamp.java100.ch19.ex1;

@MyAnnotation
// @MyAnnotation // 중복해서 붙일 수 없다.
public class MyClass {

	@MyAnnotation
	public int a;
	
	@MyAnnotation
	public void m() {
		
		// 일반 문장에는 붙일 수 없다.
		// @MyAnnotation
		System.out.println("Hello!!!");
	}
	
	public void m2(@MyAnnotation int a, @MyAnnotation String b) {
		
		@MyAnnotation
		int x = 10;
		
		
	}
	
}
