// ## 사용자 정의 데이터 타입 만들기 3
// 개발자가 임의로 여러 종류의 메모리를 묶어 새로운 타입을 만드는 방법을 알아보자!
// 비트캠프의 수강생 정보를 저장할 데이터 타입.

package bitcamp.java100;
    public class Test14_3 {
        public static void main(String[] args) {
            class Student {

                String name;
                String tel;
                boolean gender;
                String schoolLevel;
                String schoolname;
                int age;
                String postNo;
                String basicAddr;
                String detailAddr;
                String createdDate;

            }
            Student a1;

            a1 = new Student();

            a1.name = "홍길동";
            a1.tel = "010-0101-0101";
            a1.age = 49;

            System.out.printf("%s %s %d\n", a1.name, a1.tel, a1.age);


    }    
}