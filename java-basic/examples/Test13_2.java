// ## 배열 만들기
package bitcamp.java100;
    public class Test13_2 {
        public static void main(String[] args) {
            int[] arr1; // 자바 주표기법
            int arr2[]; // C언어 표기법
            //arr1, arr2 

            //arr1 = 100; 컴파일 오류!
            //arr2 = 100;

            //C/C++에서는 배열을 바로 만들 수 있음.
            //int scores[7]; <= 자바에선 안됨.
// 2) new 데이터타입[개수]            
            arr1 = new int[3];
            arr2 = new int[4];
// 3) 배열을 사용하기            
            arr1[0] = 100;
            arr1[1] = 90;
            arr2[2] = 80;
            System.out.printf("%d,%d,%d\n", arr1[0], arr1[1], arr1[2]);

            arr2[0] = 100;
            arr2[1] = 200;
            arr2[2] = 300;
            arr2[3] = 400;
            System.out.printf("%d,%d,%d,%d\n", arr2[0], arr2[1], arr2[2], arr2[3]);
    }    
}