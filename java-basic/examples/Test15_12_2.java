// ## 연산자 - 비트 이동 연산자 (>> >>> <<)
package bitcamp.java100;
    public class Test15_12_2 {
        public static void main(String[] args) {
            // int 메모리에 들어 있는 값을 1바이트 씩 출력
            int v = 1234567890;
            
            //전체 바이트 출력
            System.out.println(Integer.toHexString(v >> 24));
            System.out.println(Integer.toHexString((v >> 16) & 0xFF));
            System.out.println(Integer.toHexString((v >> 8) & 0xFF));
            System.out.println(Integer.toHexString(v & 0xFF));
        }
    }