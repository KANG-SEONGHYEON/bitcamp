// DBMS에 연결하기

package bitcamp.java100.ch17.ex1;

import java.sql.Connection;

public class Test2 {
	/* JDBC Driver에 대한 정보는 
	 * java.sql.Driver 인터페이스는 구현한 클래스를 통해 확인할 수 있다.
	 */
	public static void main(String[] args) throws Exception {
		
		java.sql.Driver driver = new com.mysql.jdbc.Driver();
		
		Connection con = driver.connect("jdbc:mysql://localhost:3306/studydb?user=study&password=1111", null);
		
		System.out.println("연결되었음!");
		
		con.close();
	}
	
	
}
