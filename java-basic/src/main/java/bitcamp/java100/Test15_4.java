// ## 연산자 - 암시적 형변환으로 해결이 안되는 경우
// -
package bitcamp.java100;
    public class Test15_4 {
        public static void main(String[] args) {
//암시적 형변환으로 해결할 수 없는 경우
            float f1 = 3.141592f;
            int i1 = 7654321;
            System.out.printf("f1=%f, i1=%d\n", f1, i1);

            double r1 = f1 + i1; // = 7654324.141592
            System.out.println(r1);

//명시적 형변환으로 위의 문제를 해결하자.
//문법 : 
// 1) (바꾸고자하는 타입) 변수명
// 2) (바꾸고자하는 타입) 값
            r1 = (double) f1 + (double) i1;
            System.out.println(r1);

            r1 = (double) f1 + i1;
            System.out.println(r1);

            r1 = f1 + (double) i1;
            System.out.println(r1);
            
//형변환
//"type conversion"
//"type casting"

    }    
}