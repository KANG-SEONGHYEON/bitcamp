// ## 연산자 - 증가/감소 연산자
// -
package bitcamp.java100;
    public class Test15_6 {
        public static void main(String[] args) {
// 여러개의 연산자가 한 식에 있을 때는 연산자 우선 순위에 따라 계산을 수행함/
// -> *, /가 +, -보다 우선으로 실행한다.
            int r = 2 + 3 * 4;
            System.out.println(r);

            r = 2 + 3 * 4 - 6 / 3 + 7;
            System.out.println(r);

            r = (2 + 3) * 4;
            System.out.println(r);


//##            
    }    
}