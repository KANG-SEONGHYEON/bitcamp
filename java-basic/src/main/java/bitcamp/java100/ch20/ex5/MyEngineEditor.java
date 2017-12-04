// 프로퍼티 변환기 만들기

package bitcamp.java100.ch20.ex5;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

/* String --> Engine 객체로 변환시키는 역할
 * 방법 1 : 
 *  - 프로퍼티에디터 인터페이스에 따라 클래스를 구현해야 한다.
 *  - 이 방법은 너무 많은 메서드를 구현해야 한다.
 *    어떤 메서드가 언제 호출되는지 모두 파악해서 구현하려면
 *    너무 복잡하다.
 *  - 그래서 자바에서는 직접 PropertyEditor를
 *    미리 구현한 클래스를 제공한다.
 *    이 클래스를 상속 받으면 일부 메서드를 구현하면 되기 때문에
 *    개발자 입장에서는 번거로움을 덜 수 있다.
 * 방법 2
 *  - PropertyEditor를 미리 구현한 PropertyEditorSupport 클래스를 상속받기
 */

public class MyEngineEditor extends PropertyEditorSupport {
	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String[] values = text.split(",");
				
		Engine engine = new Engine();
		engine.setName(values[0]);
		engine.setValve(Integer.parseInt(values[1]));
		engine.setCc(Integer.parseInt(values[2]));
		
		this.setValue(engine);
	}
}
