package bitcamp.java100.ch18;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test4 {
	public static void main(String[] args) throws Exception {
		
		Class<?> clazz = Z.class;
		
		// public 생성자를 조회
		Method[] methods = clazz.getMethods();
		
		for (Method m : methods) {
			System.out.println(m.getName());
			
			Parameter[] params = m.getParameters();
			for (Parameter param : params) {
				System.out.printf("    %s:%s\n", param.getName(), param.getType().getName() );
			}
		
		}
		
		System.out.println("\n============================================\n");
		
		// 모든 생성자를 조회
		methods = clazz.getDeclaredMethods();

		for (Method m : methods) {
			System.out.println(m.getName());

			Parameter[] params = m.getParameters();
			for (Parameter param : params) {
				System.out.printf("    %s:%s\n", param.getName(), param.getType().getName() );
			}
		}
		
		
	}
}
