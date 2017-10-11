// # 자바에서 값 표현(literal)하기 - 정수의 자릿 수 표현

package bitcamp.java100;
    public class Test11_6 {
        public static void main(String[] args) {

// 정수값은 기본으로 4바이트 크기를 갖는다.            
            System.out.println(-21_4748_3648);
            System.out.println(21_4748_3647);

// 다음과 같이 숫자가 1이라도 증가하면 컴파일 오류 발생            
            //System.out.println(-21_4748_3649);
            //System.out.println(21_4748_3647);

            System.out.println(-21_4748_3649L);
            System.out.println(21_4748_3647);

            System.out.println(10); // 4바이트 정수 값
            System.out.println(10L); // 8바이트 정수 값

// 8버이트 크기의 가장 작은 정수값과 가장 큰 정수 값
            System.out.println(-922_3372_0368_5477_5808L);
            System.out.println(922_3372_0368_5477_5807L);            
        }
}