// 데이터 프로세싱 스트림 클래스 사용법 - ObjectInputStream 클래스

package bitcamp.java100.ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_3 {
	public static void main(String[] args) throws Exception {
				
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("test3.dat"));
		
		//Score2 클래스는 Serializable 인터페이스를 구현하였다.
	
		Score4 s = (Score4)in.readObject();

		in.close();
		
		System.out.println(s);
		s.compute();
		System.out.println(s);
	}
}
