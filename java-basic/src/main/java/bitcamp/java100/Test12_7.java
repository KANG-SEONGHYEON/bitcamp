// ## 부동소수점 변수
// - 부동소수점을 변수에 저장하는 방법
// - byte
package bitcamp.java100;
    public class Test12_7 {
        public static void main(String[] args) {

            float f1;
            f1 = 9876567;
            System.out.println(f1);

            f1 = 9876543456789L; //8바이트 정수를 4바이트 메모리에 저장
            System.out.println(f1); // 9.8765436E12 = 9876543600000


            //f1 = 9876543.4567; // 컴파일 오류
            
//
             f1 = 9876543.4567f; //출력하면 짤린 값.

//결론!
// -             

    }    
}