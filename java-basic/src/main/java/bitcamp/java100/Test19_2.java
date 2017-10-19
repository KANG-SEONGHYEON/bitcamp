// ## import - 클래스가 어떤 패키지에 있는지 컴파일러에게 알리는 방법
// - import의 용도와 사용법을 알아보자!
// 

package bitcamp.java100;
// import 명령
import java.util.ArrayList;
import java.lang.String;// java.lang 하위 클래스는 생략.

public class Test19_2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
	}
}