/* Spring Ioc(inversion of Control) - 객체 생성 순서
 */

package bitcamp.java100.ch20.ex3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
	public static void main(String[] args) {
	
		/* 1) XML 설정 파일을 읽어서 객체를 준비하는 컨테이너
		 * => XML 설정 파일은 자바 클래스 경로에 존재한다.
		 */
		ClassPathXmlApplicationContext appCtx = 
				new ClassPathXmlApplicationContext(
						"bitcamp/java100/ch20/ex3/application-context4.xml");
		
	}
}
