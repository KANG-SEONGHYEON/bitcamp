// DBMS에 연결하기 II - DriverManager를 이용하여 DBMS와 연결하기

package bitcamp.java100.ch17.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test3 {
	/* JDBC Driver에 대한 정보는 
	 * java.sql.Driver 인터페이스는 구현한 클래스를 통해 확인할 수 있다.
	 */
	public static void main(String[] args) throws Exception {
		
		java.sql.Driver driver = new com.mysql.jdbc.Driver();
		
		DriverManager.registerDriver(driver);
		
		/* Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
		 */
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studydb", "study", "1111");
		
		
		System.out.println("연결되었음!");
		
		con.close();
	}
	
	
}
