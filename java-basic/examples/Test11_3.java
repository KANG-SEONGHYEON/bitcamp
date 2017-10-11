// # 자바에서 값 표현(literal)하기 - 이스케이프 문자

package bitcamp.java100;
    public class Test11_3 {
        public static void main(String[] args) {

            System.out.print("ABC");
            System.out.print('\b'); // Backspace
            System.out.println("123");

            System.out.println("ABC\t123"); //Tab
            System.out.println("ABC\u0009123");//

            System.out.println("ABC\n123"); //Linefeed(LF; 0x000a)

            System.out.println("ABC\r123"); //Carrage Return(CR; 0x000d)
            
            System.out.println("ABC\f123"); // Form Feed
            System.out.println("ABC\"123"); // double quote
            System.out.println("ABC\'123"); // single quote
            System.out.println('\''); // double quote
            System.out.println('"'); // single quote
            System.out.println("c:\\workspace\\test"); //backslash


        }
}