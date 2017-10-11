// ## 상수
// 한 번 값을 저장하면 변경 할 수 없는 변수
package bitcamp.java100;
    public class Test12_4 {
        public static void main(String[] args) {
// 변수 선언            
            int i;
            i = 100;
            i = 200;
            
// 상수 선언
            final int j;
            j = 200; // 처음 한 번 값을 저장.
          //j = 300; // 컴파일 오류! 기존 값을 변경할 수 없다.
    }    
}