// # 자바에서 값 표현(literal)하기 - 정수의 자릿 수 표현

package bitcamp.java100;
    public class Test11_5 {
        public static void main(String[] args) {

// 10진수            
            System.out.println(1456781234);
            System.out.println(14_5678_1234);
            System.out.println(145_6781_234); // 위치는 상관 없다.

// 특히 숫자가 많은 2진수에 자릿수를 적용하면 편하다.

            System.out.println(0b0110_0100); // = 10진수 100
            System.out.println(0B0110_0100); // = 10진수 100
            System.out.println(0B110_0100); // = 앞쪽의 0은 생략가능
        }
}