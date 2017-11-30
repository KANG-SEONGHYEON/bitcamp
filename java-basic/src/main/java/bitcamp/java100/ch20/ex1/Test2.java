/* Spring Ioc(inversion of Control) 컨테이너 사용 II
 */

package bitcamp.java100.ch20.ex1;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {

		/* 1) 파일 시스템을 뒤져서 XML 설정 파일을 찾는 컨테이너 준비!
		 *   =>
		 */
		FileSystemXmlApplicationContext appCtx = 
				new FileSystemXmlApplicationContext(
						"./sample/application-context.xml");
		
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
