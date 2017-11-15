// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream 사용하기
package ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_2 {
	public static void main(String[] args) throws Exception {
		
		ObjectInputStream in = new ObjectInputStream(
									new FileInputStream("test1.dat"));
		Score3 s = (Score3)in.readObject();
		
		in.close();
		
		System.out.println(s);
	}
}
