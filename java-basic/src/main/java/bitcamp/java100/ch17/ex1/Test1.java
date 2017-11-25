// JDBC Driver 정보 조회

package bitcamp.java100.ch17.ex1;

public class Test1 {
	/* JDBC Driver에 대한 정보는 
	 * java.sql.Driver 인터페이스는 구현한 클래스를 통해 확인할 수 있다.
	 */
	public static void main(String[] args) throws Exception {
		
		java.sql.Driver driver = new com.mysql.jdbc.Driver();
		
		System.out.println(driver.getMajorVersion());
		System.out.println(driver.getMinorVersion());
		
	}
	
	
}
