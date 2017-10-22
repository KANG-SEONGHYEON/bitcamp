/* print() 사용법
 *- printf()의 사용법을 알아보자.
 *- printf() 사용법 정리 사이트 http://programmingsummaries.tistory.com/59
 */
package ch01;

public class Test10_4 {
	public static void main(String[] args) {
/* printf(): 특정 형식의 문자열을 만들어 출력한다.
 * => 형식
 *    %[argument_index$][flags][width][.precision]conversion
 *    
 * => conversion 사용법
 *    %s %S : 문자열
 *    %c %C : 문자
 *    %d : 10진수(decimal) 숫자
 *    %o : 8진수(octal) 숫자
 *    %x, %X : 16진수(haxadecimal) 숫자
 *    %h, %H : Integer.toHexString(arg.hashCode())의 리턴 값.
 *    %f : 부동소수점(floating point) 숫자
 *    %b, %B : boolean 값
 *    %t, %T : Data/Time 값
 *    %n : 줄바꿈. \n 과 같다.
 */
		System.out.printf("%s, %c, %d, %o, %x, %h, %f, %b, %tY\n",
				"홍길동", '가', 100, 100, 100, 100, 3.14, true, new java.util.Date());
		//	출력 => 홍길동, 가, 100, 144, 64, 64, 3.140000, true, 2017
/* => [.precision]
 */    System.out.printf("%f, %.1f, %.2f, %.3f, %.4f, %.5f\n",
		 3.141592, 3.141592, 3.141592, 3.141592, 3.141592, 3.141592);
 		//  출력 => 3.141592, 3.1, 3.14, 3.142, 3.1416, 3.14159

 /* => [argument_index$] 출력에 넣을 인자의 순서를 임의로 정할 수 있다.
  */    System.out.printf("%1$f, %1$.1f, %1$.2f, %1$.3f, %1$.4f, %1$.5f\n", 3.141592, 4.123456);
  		//출력 => 3.141592, 3.1, 3.14, 3.142, 3.1416, 3.14159 <= 1$로 첫번째 인자(아규먼트)를 전부 넣음.
  
  /* => [width] 
   */    System.out.printf("%1$4s, %1$10s, %2$5.2f, %2$10.3f\n", "홍길동", 3.14);
				//출력 =>  홍길동,        홍길동,  3.14,      3.140
   
  /* => [flags] 
   * - : 왼쪽 정렬
   */ System.out.printf("'%10s', '%-10s'\n", "홍길동", "임꺽정");
		//출력 =>'       홍길동', '임꺽정       '
   
  /* + : 부호 출력
   */ System.out.printf("%d, %+d\n", 100, 100);
				//출력 => 100, +100
   
  /* 0 : 빈자리를 0으로 채우기
   */ System.out.printf("%5d, %05d\n", 123, 123);
				//출력 => 123, 00123
   
  /* => 날짜/시간 다루기 : %t[날짜관련 접미사]
   * 	H : Hour. 00 ~ 23
   * 	I : Hour. 01 ~ 12
   * 	M : Minute. 00 ~ 60
   * 	S : Second. 00 ~ 60
   * 	p : 오전(am), 오후(pm) 출력
   */ System.out.printf("%1$tH, %1$tI, %1$tM, %1$tS, %1$tp\n", new java.util.Date());
   				//출력 => 14, 02, 50, 34, 오후
   	  System.out.printf("%1$tH:%1$tM:%1$tS\n", new java.util.Date());
				//출력 => 14:50:34

  /* Y : Year. 4자리
   * Y : year. 2자리
   * m : Month. 10 ~ 12
   * d : Day. 01 ~ 31
   * e : Day. 1 ~ 31
   * A : Week. "Sunday"
   * a : Week. "Sun"
   * B : Month name. "January"
   * b : Month name. "Jan"
   */
   	  System.out.printf("%1$tY, %1$ty, %1$tm %1$td %1$te\n", new java.util.Date());
   	  				//출력 => 2017, 17, 10 21 21
   	  System.out.printf("%1$tm, %1$tB, %1$tb\n", new java.util.Date());
   	  				//출력 => 10, 10월, 10월
   	  System.out.printf("%1$tA, %1$ta", new java.util.Date());
   	  				//출력 => 토요일, 토
	}
}
