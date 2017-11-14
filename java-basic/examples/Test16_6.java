// ## 문장(Statement) - 반복문 for


package bitcamp.java100;
    public class Test16_6 {
        public static void main(String[] args) {
        	// for 기본 문법
        	// for (변수 선언 및 초기화; 조건; 증가문)
        	
        	for (int i = 0; i < 5; i++)
        		System.out.println(i);
        	
        	System.out.println("----------------------------------------------------------");
        	
        	// 변수 여러개 선언 가능
        	for (int i = 0, j = 0; i < 5; i++, j += 2)
        		System.out.printf("%d, %d\n", i, j);
        	
          	System.out.println("----------------------------------------------------------");
          	
          	// for 문에 선언된 변수는 for 블록 안에서만 사용한다.
          	
          	int sum = 0;
          	for (int i = 1; i <= 10; i++)
          		sum += i;
          	System.out.println(sum);
          	//System.out.println(i); // 컴파일 오류! i는 for문의 로컬변수
          	
          	System.out.println("----------------------------------------------------------");
          	
          	//여러 문장은 블록으로 묶는다.
          	
          	for (int i = 1; i <= 10; i++) {
          		System.out.print("=>");
          		System.out.println(i);
          	}
          	
          	System.out.println("----------------------------------------------------------");
          	
          	// => break
          	
          	for (int i = 0; i < 10; i++) {
          		if (i == 5)
          			break; //반복문을 나간다
          		System.out.println(i);
          	}
          	
          	System.out.println("----------------------------------------------------------");
          	
          	// continue
          	
          	for (int i = 0; i < 10; i++) {
          		if (i == 5)
          			continue; // 증가/감소문으로 이동한다.
          		System.out.println(i);
          	}
          		
          	System.out.println("----------------------------------------------------------");
          	
          	
          	// 변수 초기화 문장을 생략할 수 있다.
        	int i = 0;
        	for (; i < 5; i++)
        		System.out.println(i);
        	System.out.println(i);
        	
        	System.out.println("----------------------------------------------------------");
        	
        	// 증가/감소문을 생략할 수 있다.
        	i = 0;
        	for (; i < 5 ;) { 
        		System.out.println(i);
        		i++;
        	}
        	
        	System.out.println("----------------------------------------------------------");
        	
        	// 조건문을 생략할 수 있다.
        	
        	i = 0;
        	for (;;) { // 조건 검사를 하지 않으므로 무한으로 반복한다.
        		System.out.println(i);
        		i++;
        		if (i == 5)
        			break;
        	}
        	
        	System.out.println("----------------------------------------------------------");
        	
        	//for문을 주요 사용처
        	//배열을 다룰 때
        	String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
        	for (int index = 0; index < names.length ; index++) {
        		System.out.println(names[index]);
        	}
        	
        	
        	System.out.println("----------------------------------------------------------");
        	
        	//for문 중첩하기
        	for (int a = 1; a <= 5; a++) {
        		for (int b = 0; b < a ; b++) {
        			System.out.print("*");
        		}
        		System.out.println();
        	}
        	
        	System.out.println("----------------------------------------------------------");
        	
        	
        	//중첩된 for문에서 가장 바깥쪽 반복문 탈출하기
        	label1: {
            for (int a = 1; a <= 5; a++) {
            	for (int b = 0; b < a ; b++) {
            		System.out.print("*");
            		if (b == 2)
            			break label1;
            	}
            	System.out.println();
            }
            }
        	
        	System.out.println("----------------------------------------------------------");
        	
        	// for문만을 이용하여 구구단을 출력하라!
        	
        	for (int a = 2; a <= 9; a++) {
        		for (int b = 1; b <= 9; b++) {
        		System.out.printf("%d * %d = %d\n", a, b, a * b);
        		}
        	}
        	
        	
        	System.out.println("----------------------------------------------------------");
        	
        	// 주어진 숫자를 거꾸로 한 개씩 출력하라
        	// 주어진 숫자 : 98761234
        	// 출력 결과: 4 3 2 1 6 7 8 9
        	int v = 98761234;
        	for (; v > 0; v /= 10) {
        		System.out.printf("%d ", v % 10);
        	}
        	System.out.println();
        	
        	System.out.println("----------------------------------------------------------");
        	
        	
        	
        	
        }
}