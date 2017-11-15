// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream 사용하기
package ch14.ex4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2_1 {
	public static void main(String[] args) throws Exception {
		
		// ObjectintputStream 클래스를 사용하여 파일에 저장된 인스턴스 변수의 값을 출력해보자!
		ObjectInputStream in = new ObjectInputStream(
									new FileInputStream("test1.dat"));
		Score2 s = (Score2)in.readObject();
		
		in.close();
		
		System.out.println(s);
	}
}
