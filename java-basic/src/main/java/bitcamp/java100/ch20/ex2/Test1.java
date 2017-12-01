/* Spring Ioc(inversion of Control) 객체 생성과 이름
 */

package bitcamp.java100.ch20.ex2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
	
		/* 1) XML 설정 파일을 읽어서 객체를 준비하는 컨테이너
		 * => XML 설정 파일은 자바 클래스 경로에 존재한다.
		 */
		ClassPathXmlApplicationContext appCtx = 
				new ClassPathXmlApplicationContext(
						"bitcamp/java100/ch20/ex2/application-context1.xml");
		
		// 2) bean container에 보관된 객체 조회하기
		System.out.printf("Bean 갯수 = %d\n", appCtx.getBeanDefinitionCount());
		
		String[] names = appCtx.getBeanDefinitionNames();
		
		for (String name : names) {
			System.out.printf("%s\n  클래스명: %s\n", name,
					appCtx.getBean(name).getClass().getName());
			// 지정된 객체에 별명이 있으면 가져오기
			String[] aliases = appCtx.getAliases(name);
			System.out.print("  별명: ");
			for (String alias : aliases) {
				System.out.print(alias+ ", ");
			}
			System.out.println();
		}
	}
}
