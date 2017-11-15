// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream 사용하기

package ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_2 {
	public static void main(String[] args) throws Exception {
		Score3 s = new Score3("홍길동", 800, 900, 1000);
		
		
		ObjectOutputStream out = new ObjectOutputStream(
									new FileOutputStream("test0.dat"));
		
		/* Score2 클래스는 Serializable 인터페이스를 구현하였다.
		 * => 인스턴스 변수의 값을 바이트 배열로 만들어 출력하도록
		 *    허락한 클래스이다.
		 *    그래서 다음 메서드를 사용하여 인스턴스 값을 출력할 수 있다.
		 *    
		 *    출력할 때 인스턴스 변수의 값만 출력하는 것이 아니라
		 *    출력 데이터가 어떤 클래스의 인스턴스 값인지 그 정보도 함께 출력한다.
		 *    
		 *    출력 데이터 = 클래스 정보 + 인스턴스 변수의 값
		 */
		out.writeObject(s); 
		
		out.close();
		
		System.out.println("출력을 완료했습니다.");
	}

}
