// ## 정수 변수의 사용
// - byte
package bitcamp.java100;
    public class Test12_5 {
        public static void main(String[] args) {
// 1바이트 정수형 메모리            
            byte b1;
            b1 = 100;
            // 100은 4바이트 정수 값이다. b1은 1바이트 메모리이다.
            // 1바이트에 4바이트 값을 저장할 수 없지만 메모리 크기를 넘어서지 않으면 예외적으로 허락.

// 1바이트 메모리에 최대 저장 값과 최소 저장 값
            b1 = -128;
            b1 = 127;

            // b1 = -129; // 컴파일 오류
            // b1 = 128; 컴파일 오류

// 2바이트 정수 값을 저장할 메모리 준비
            short s1;
            s1 = -32768;
            s1 = 32767;
            
            // byte와 마찬가지로 4바이트 정수 값 그대로 2바이트 메모리에 저장할 수 있다면 허락.

            // s1 = -32769; 컴파일 오류
            // s1 = 32768; 컴파일 오류

// 4바이트 정수 값을 저장할 메모리 준비

            int i1;
            i1 = -21_4748_3648;
            i1 = 21_4748_3647;

            //i1 = -21_4748_3649L; 컴파일 오류
            //i1 = 21_4748_3648L; 컴파일 오류

// 8바이트 정수 값에 대해서는 예외 없음.
            // b1 = 100L; 컴파일 오류
            // s1 = 100L; 컴파일 오류
            // il = 100L; 컴파일 오류

// 8바이트 정수 값을 저장할 메모리 준비
            long l1;
            l1 = -922_3372_0368_5477_5808L;
            l1 = 922_3372_0368_5477_5807L;
            // 8바이트 보다 큰 수를 사용하려면 큰 수를 다루는 별도의 클래스를 사용해야한다.            
    }    
}