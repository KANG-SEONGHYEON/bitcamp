// ## import - 클래스가 어떤 패키지에 있는지 컴파일러에게 알리는 방법
// - import의 용도와 사용법을 알아보자!
// 

package bitcamp.java100;
//import를 선언할 때 와일드카드(*)로 선언하면 클래스 이름까지 자세히 적을 필요가 없어 편리하다.
import java.util.*;
import java.io.*;
import java.net.*;

public class Test19_4 {
	public static void main(String[] args) {
		ArrayList<String> list;
		HashSet<String> set;
		HashMap<String, Object> map;
		
		File f;
		FileInputStream in;
		FileOutputStream out;
		
		Socket s;
		ServerSocket ss;
		URL url;
	}
}