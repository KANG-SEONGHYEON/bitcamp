// ## 사용자 정의 데이터 타입 만들기
// 개발자가 임의로 여러 종류의 메모리를 묶어 새로운 타입을 만드는 방법을 알아보자!

package bitcamp.java100;
    public class Test14_1 {
        public static void main(String[] args) {
// 사용자 정의 데이터 타입 정의하기

            // 1) 새 데이터 타입을 선언한다.
            class Score {
                // 2) 메모리 구조를 정의한다.
                String name;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;
            } 
            Score r1;

            r1 = new Score();    
            
            r1.name = "홍길동";
            r1.kor = 100;
            r1.eng = 98;
            r1.math = 95;
            r1.sum = r1.kor + r1.eng + r1.math;
            r1.aver = r1.sum / 3.0f;

            System.out.printf("%s %d %d %d %d %f\n", r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);
    }    
}

// ### 사용자 정의 데이터 타입
//- 여러 종류의 메모리를 묶어서 새로운 데이터 타입.
//- 문법
// class 데이터 타입명 {
//    메모리 구조
//}

