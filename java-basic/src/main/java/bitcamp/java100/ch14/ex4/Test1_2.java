// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream 클래스

package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_2 {
	public static void main(String[] args) throws Exception {
		
		Score3 s = new Score3("홍길동", 800, 900, 1000, 900);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test2_new.dat"));
		
		//Score2 클래스는 Serializable 인터페이스를 구현하였다.
		
		out.writeObject(s);

		out.close();
		
		System.out.println("출력 완료!");
	}
}
