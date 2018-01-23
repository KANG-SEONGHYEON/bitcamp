/* Spring Ioc(inversion of Control) 생성자 호출 II
 */

package bitcamp.java100.ch20.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
	
		/* 1) XML 설정 파일을 읽어서 객체를 준비하는 컨테이너
		 * => XML 설정 파일은 자바 클래스 경로에 존재한다.
		 */
		ClassPathXmlApplicationContext appCtx = 
				new ClassPathXmlApplicationContext(
						"bitcamp/java100/ch20/ex2/application-context3.xml");
	}
}