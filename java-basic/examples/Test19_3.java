// ## import - 클래스가 어떤 패키지에 있는지 컴파일러에게 알리는 방법
// - import의 용도와 사용법을 알아보자!
// 

package bitcamp.java100;
//패키지 정보를 알려야하는 클래스는 무조건 import를 선언하면 된다
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

public class Test19_3 {
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