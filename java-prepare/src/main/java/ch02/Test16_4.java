package ch02;

public class Test16_4 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 5)
			System.out.println(i++);
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
		i = 0;
		while (i < 5) {
			System.out.println("=> ");
			System.out.println(i);
			i++;
		}
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
		i = 1;
		while (i <= 5) {
			int count = 1;
			while (count <= i) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
        // => while 문의 중법 연습
        // - 위의 결과처럼 *을 출력하되 다음과 같이 출력하라!
        //      *
        //     **
        //    ***
        //   ****
        //  *****
		
		i = 1;
		while (i <= 5) {
			int count = 5 - i;
			while (count > 0) {
				System.out.print(" ");
				count--;
			}
			count = 1;
			while (count <= i) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
		// 위의 While문을 for으로 변환.
		for (i = 1; i <= 5; i++) {
			int count;
			for (count = 5 - i; count > 0; count--) {
				System.out.print(" ");	
			}
			for (count = 1; count <= i; count++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
		// => while 문의 중법 연습 II
        // - 위의 결과를 다음과 같이 출력하라!
        //    *
        //   ***
        //  *****
		
		i = 1;
		while (i <= 5) {
			int count = (5 - i) / 2;
			while (count > 0) {
				System.out.print(" ");
				count--;
			}
			count = 1;
			while (count <= i) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			i += 2;
		}
		
		// 위의 While문을 for으로 변환.
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
		for (i = 1; i <= 5; i += 2) {
			int count;
			for (count = (5 - i) /2; count > 0; count--) {
				System.out.print(" ");
			}
			for (count = 1; count <= i; count++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
		// => while 문의 중법 연습 III
        // - 위의 결과를 다음과 같이 출력하라!
        //  *****
        //   ***
        //    *
		i = 5; 
        while (i > 0) { 
            int count = (5 - i) / 2;  
            while (count > 0) { 
                System.out.print(" "); 
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i -= 2;
        }
        
        System.out.println("");
		System.out.println("================================");
		System.out.println("");
		
		for (i = 5; i > 0; i -= 2) {
			int count;
			for (count = (5 - i) / 2; count > 0; count--) {
				System.out.print(" ");
			}
			for (count = 1; count <= i; count++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
