// ## String 클래스 사용법
// 개발자가 문자열을 쉽게 다룰 수 있도록 자바에서 기본으로 제공하는 부품.

package bitcamp.java100;
public class Test18_6 {

	public static void main(String[] args) {
		String email = "hong@test.com";
		
		System.out.println(email.matches("1hong@test.com"));
		
		System.out.println(email.matches(".+@.+\\..+"));
		
		System.out.println(email.matches("^\\D.+@.+\\..+"));
		
		
		String str = "홍길동(hong@test.com), 임꺽정(leem@test.com)," +
					"유관순(yoo@test.com), 안중근(ahn@test.com), 윤봉길(yoon@test.com)";
		
		java.util.regex.Pattern pattern =
				java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
		
		java.util.regex.Matcher matcher = pattern.matcher(str);
		
		int startIndex = 0;
		while (matcher.find(startIndex)) {
			System.out.println(startIndex);
			String matchString = matcher.group();
			startIndex = matcher.end();
			System.out.println(matchString);
		}
	}
}