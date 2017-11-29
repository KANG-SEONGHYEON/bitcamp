package bitcamp.java100.ch18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Test3 {
	public static void main(String[] args) throws Exception {
		
		Class<?> clazz = Z.class;
		
		// public 생성자를 조회
		Constructor<?>[] constructors = clazz.getConstructors();
		
		for (Constructor<?> con : constructors) {
			System.out.println(con.getName());
			
			Parameter[] params = con.getParameters();
			for (Parameter param : params) {
				System.out.printf("    %s:%s\n", param.getName(), param.getType().getName() );
			}
		
		}
		
		System.out.println("\n============================================\n");
		
		// 모든 생성자를 조회
		constructors = clazz.getDeclaredConstructors();

		for (Constructor<?> con : constructors) {
			System.out.println(con.getName());

			Parameter[] params = con.getParameters();
			for (Parameter param : params) {
				System.out.printf("    %s:%s\n", param.getName(), param.getType().getName() );
			}
		}
		
		
	}
}
