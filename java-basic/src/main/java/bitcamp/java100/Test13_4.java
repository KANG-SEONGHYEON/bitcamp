// ## 배열 초기화
package bitcamp.java100;
    public class Test13_4 {
        public static void main(String[] args) {
//배열 레퍼런스 선언과 동시에 배열 생성
            int[] arr1 = new int[3];
//배열 생성과 동시에 값 초기화
// 방법 1 초기화 시키는 값 개수 만큼 배열을 만든다.
            int[] arr2 = new int[] {100, 90, 80};

            //레퍼런스 먼저 만들고 배여 생성 가능
            int[] arr3;
            arr3 = new int[] {90, 80, 70};
// 방법 2
// new int를 선언하지 않아도 레퍼런스 타입을 보면 int 배열을 생성해야 한다는 것을 추측할 수 있기 때문에 생략을 허락.
            int[] arr4 = {100, 200, 300};
            //레퍼런스 선언과 동시에 값을 초기화 할 때만 new int 생략가능
            int[] arr5;
            //arr5 = {100, 200, 300};

    }    
}