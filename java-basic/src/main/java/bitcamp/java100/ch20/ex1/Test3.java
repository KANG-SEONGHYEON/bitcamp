/* Spring Ioc(inversion of Control) 컨테이너 사용 III
 */

package bitcamp.java100.ch20.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext appCtx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// 2) bean container에 보관된 객체 조회하기
		System.out.printf("Bean 갯수 = %d\n", appCtx.getBeanDefinitionCount());
		
		String[] names = appCtx.getBeanDefinitionNames();
		
		for (String name : names) {
			System.out.printf("%s\n    ----> %s\n", name,
					appCtx.getBean(name).getClass().getName());
		}
		
		System.out.println("\n=====================================\n");
		
		// 3) 빈을 꺼내 출력해보자!
		String s1 = (String) appCtx.getBean("str1");
		String s2 = (String) appCtx.getBean("str2");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
