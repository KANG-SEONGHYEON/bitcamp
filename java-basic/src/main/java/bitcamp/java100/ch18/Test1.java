package bitcamp.java100.ch18;

import java.io.StringWriter;

public class Test1 {
	public static void main(String[] args) throws Exception {
		
		Class<?> c1 = Class.forName("java.io.BufferedReader");
		
		Class<?> c2 = java.io.BufferedWriter.class;//class라는 빌트인 변수 (확장자가 아님)
		
		StringWriter in = new StringWriter();
		
		Class<?> c3 = in.getClass();
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
		
		
	}
}
