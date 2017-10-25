/* ver04
 * 여러 명의 성적을 저장하고 다음과 같이 출력하라!
 * 
 * 출력 내용:
 * ```
 * 홍길동, 100, 90, 80, 270, 90.0
 * 임꺽정, 80, 80, 80, 240, 80.0
 * 유관순, 100, 100, 100, 300, 100.0
 * ```
 */
package project.ver04;

public class App {
	
	public static void main(String[] args) {
		
		
		String[] names = {"홍길동", "임꺽정", "유관순"} ;
		int[] kor = {100, 80, 100};
		int[] eng = {90, 80, 100};
		int[] math = {80, 80, 100};
		
		for (int i = 0; i < names.length; i++) {
			int sum = kor[i] + eng[i] + math[i];
			float aver = sum / 3.0f;
			
			System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
					names[i], kor[i], eng[i], math[i], sum, aver);
		}
	}
}
