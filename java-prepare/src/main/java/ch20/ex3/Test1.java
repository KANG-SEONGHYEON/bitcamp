/* Spring IoC(Inversion of Control) 컨테이너 - 생성자 호출
 */
package ch20.ex3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appCtx = 
				new ClassPathXmlApplicationContext(
				"ch20/ex3/application-context1.xml");
	}
}
