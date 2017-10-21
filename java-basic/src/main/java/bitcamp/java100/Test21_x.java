// ## 키보드로부터 입력 받기 - 활용편 II

package bitcamp.java100;

import java.io.Console;

public class Test21_x {
	public static void main(String[] args) {
		// 콘솔 객체를 준비한다.
		
		Console console = System.console();
		
		class member {
			String name;
			String email;
			String phone;
			
			member(String a, String b, String c){
				this.name = a;
				this.email = b;
				this.phone = c;
			}
	
		}
	member[] mem = new member[3];
		
			for (int i = 0; i < mem.length; i++) {
				mem[i] = new member(console.readLine("이름 : "), console.readLine("이메일 : "), console.readLine("전화번호 : "));
				String cho2 = console.readLine("저장하시겠습니까?(y/n)");
				if (cho2.equals("n")) {
					mem[i] = new member("비어있음", "비어있음", "비어있음");
				}
				String cho =  console.readLine("계속입력하시겠습니까?(y/n)");

				if (cho.equals("n")) { 
					System.exit(1);
				}
				
			}
			
		System.out.println("---------------------------------------");
			
		System.out.println(mem[0].name +"     "+ mem[0].email + mem[0].phone);
		System.out.println(mem[1].name +"     "+ mem[1].email + mem[1].phone);
		System.out.println(mem[2].name +"     "+mem[2].email + mem[2].phone);
		}

}
