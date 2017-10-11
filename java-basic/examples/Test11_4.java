// # 자바에서 값 표현(literal)하기 - 정수의 표현

package bitcamp.java100;
    public class Test11_4 {
        public static void main(String[] args) {

// 10진수            
            System.out.println(100);
            
// 8진수
            System.out.println(0144); // = 10진수 100

// 16진수 0x 또는 0X
            System.out.println(0x64); // = 10진수 100
            System.out.println(0x64); // = 10진수 100

// 2진수 정수 값 표현 : 0b 또는 0B 로 시작

            System.out.println(0b01100100); // = 10진수 100
            System.out.println(0B01100100); // = 10진수 100
            System.out.println(0B1100100); // = 앞쪽의 0은 생략가능
        }
}