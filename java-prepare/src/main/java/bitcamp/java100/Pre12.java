// ## String 클래스 사용법
// 개발자가 문자열을 쉽게 다룰 수 있도록 자바에서 기본으로 제공하는 부품.

package bitcamp.java100;
public class Pre12 {

	public static void main(String[] args) {
		int kor, eng, math, soc, sci, eth, chi;
		kor = 100;
		eng = 100;
		math = 100;
		soc = 100;
		sci = 100;
		eth = 100;
		chi = 100;
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(soc);
		System.out.println(sci);
		System.out.println(eth);
		System.out.println(chi);
		
		int[] scores = new int[7];
		scores[0] = 100;
		scores[1] = 100;
		scores[2] = 100;
		scores[3] = 100;
		scores[4] = 100;
		scores[5] = 100;
		scores[6] = 100;
		
		for (int i = 0; i < 7; i++) {
			System.out.println(scores[i]);
		}
	}
}