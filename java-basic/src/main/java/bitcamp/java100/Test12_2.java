// ## 메모리에 값 저장
// 값을 저장하는 방법에 대해 자세히 알아보자!

package bitcamp.java100;
    public class Test12_2 {
        public static void main(String[] args) {
            int i;
            int j;

            i = 100;
            j = i;

            System.out.println(i);
            System.out.println(j);

            // 100 = 200; <- 컴파일 오류! l-value에는 무조건 메모리가 온다.

            // i = 3.14; <- 자바는 정적 타입 바인딩이다. 타입 고정됨
            // x = 100;
    }    
}