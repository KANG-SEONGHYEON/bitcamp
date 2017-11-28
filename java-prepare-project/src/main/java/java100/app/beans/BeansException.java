// Bean에서 예외가 발생 하였다는 것을 알리기 위해 만든 자식 클래스
package java100.app.beans;

public class BeansException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BeansException() {
		super();
	}

	public BeansException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BeansException(String message, Throwable cause) {
		super(message, cause);
	}

	public BeansException(String message) {
		super(message);
	}

	public BeansException(Throwable cause) {
		super(cause);
	}

	
	
}
