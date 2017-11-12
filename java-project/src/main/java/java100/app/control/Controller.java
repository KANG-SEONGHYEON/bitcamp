package java100.app.control;

public interface Controller {
	// App 클래스는 컨트롤러에 대해 이 메서드를 호출한다.
	/*public abstract*/ void execute();
	
	// 새 규칙을 추가한다.
	default void init() {}
	
	default void destroy() {}
	
}
