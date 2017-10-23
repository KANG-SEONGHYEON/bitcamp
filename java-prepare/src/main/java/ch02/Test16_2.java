package ch02;

public class Test16_2 {
	public static void main(String[] args) {
		int age = 27;
		
		if (age <= 19) System.out.println("미성년"); 
		else System.out.println("성년");
		
		age = 17;
		if (age <= 19)
			System.out.println("미성년");
		else
			System.out.println("성년");
		
		age = 57;
		if (age >= 65)
			System.out.println("경로우대 대상자입니다.");
		
		System.out.println("------------------------------");
		
		age = 57;
		
		// else System.out.println(); // else 문만 단독 사용불가!
		
		System.out.println("------------------------------");
		
		
		age = 27;
		if (age <= 19)
			System.out.println("미성년입니다.");
			System.out.println("청소년 할인을 받을 수 있습니다.");
		
			System.out.println("------------------------------");
		
		
	}
}
