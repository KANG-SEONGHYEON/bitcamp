// ## 사용자 정의 데이터 타입 만들기 2
// 개발자가 임의로 여러 종류의 메모리를 묶어 새로운 타입을 만드는 방법을 알아보자!

package bitcamp.java100;
    public class Test14_2 {
        public static void main(String[] args) {
            class Book {

                String title;
                String writer;
                String pub;
                int page;
                double price;
            }
            Book r1;

            r1 = new Book();

            r1.title = "자바의정석";
            r1.writer = "남궁성";
            r1.pub = "도우출판";
            r1.page = 300;
            r1.price = 11.7;

            System.out.printf("%s %s %s %dp %f$\n", r1.title, r1.writer, r1.pub, r1.page, r1.price);


    }    
}