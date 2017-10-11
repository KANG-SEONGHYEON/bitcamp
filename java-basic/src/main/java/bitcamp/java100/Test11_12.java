// # 자바에서 값 표현(literal)하기 - 문자열
package bitcamp.java100;
    public class Test11_12 {
        public static void main(String[] args) {
            System.out.println("ABC");
            System.out.println("가각간");
            
// 자바는 문자열과 문자를 구분함            
            System.out.println("가");
            System.out.println('가');


// 문자열 안에 이스케이프 문자를 표현할 수 있다.
            System.out.println("ABC\n가각간");
            System.out.println("ABC\uAC00\uac00똘똠똥");
        }
}
