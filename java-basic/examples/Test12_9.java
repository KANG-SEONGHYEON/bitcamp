// ## 문자 코드 값을 저장할 변수

package bitcamp.java100;
    public class Test12_9 {
        public static void main(String[] args) {

// 문자를 저장할 변수 준비하기
            char c1;
            c1 = 44032;
            char c2 = 0xAC00;
            System.out.println(c1);
            System.out.println(c2);
// 자기 이름 저장하기
            char n1 = 0xAC15, n2 = 0xC131, n3 = 0xD604;
            System.out.printf("%c %c %c\n", n1, n2, n3);


// 
            n1 = '홍'; // 작은 따옴표는 해당 글자의 유니코드 값을 리턴한다.
            n2 = '길'; 
            n3 = '동'; 
            System.out.printf("%c %c %c\n", n1, n2, n3);           

// 문자 '7'을 숫자 7로 바꿔라!
            char x = '7';
            int num;
            num = x - '0';

            System.out.println(num);


    }    
}