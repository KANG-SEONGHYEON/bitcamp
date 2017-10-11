// ## 연산자 - 증가/감소 연산자
// -
package bitcamp.java100;
    public class Test15_5 {
        public static void main(String[] args) {
// 증가/감소 연산자 사용 전            
            int i = 10;
// 증감 사용후
            int a = 10;
            int b = 10;

            a = a + 1;
            b = b - 1;

            System.out.printf("a=%d, b=%d\n", a, b);
// 좀더 간단히 1씩 증가, 1씩 감소 시키는 연산자.
//1) 전위(prefix) 증감연사자
            a = 10;
            b =10;

            ++a; // a = a + 1
            --b; // b = b - 1
            System.out.printf("a=%d, b=%d\n", a, b);

//2) 후위(postfix) 증감연산자    
            a = 10;
            b =10;

            a++; // a = a + 1
            b--; // b = b - 1
            System.out.printf("a=%d, b=%d\n", a, b);
// prepix vs postfix

            //prefix
            a = 10;
            b = 10;

            int r1 = ++a;
            int r2 = --b;
            System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a, b, r1, r2);

            //postfix
            a = 10;
            b = 10;

            r1 = a++;
            r2 = b--;
            System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a, b, r1, r2);

            a = 10;
            a = ++a;
            System.out.println(a);

            b = 10;
            b = b++;
            System.out.println(b);

// 다른 연산자와 섞었을 때
            a = 5;
            r1 = ++a + ++a * ++a;
            System.out.printf("a=%d, r1=%d\n", a, r1);

            a = 5;
            r1 = a++ + a++ * a++;
            System.out.printf("a=%d, r1=%d\n", a, r1);            
    }    
}