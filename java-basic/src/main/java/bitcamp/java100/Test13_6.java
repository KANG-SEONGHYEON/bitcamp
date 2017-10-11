// ## 레퍼런스와 가비지
package bitcamp.java100;
    public class Test13_6 {
        public static void main(String[] args) {
//배열의 주소를 저장하는 변수 -> 레퍼런스
            int[] arr1;
//new 명령으로 준비된 메모리 -> "인스턴스" 또는 "객체"라고 부른다.
            arr1 = new int[3];
//새 배열의 메모리를 만들어 arr1에 그 주소를 저장하면 기존 배열의 주소를 잃음.
//그러면 사용할 수 없게 되어 가비지(garbage)가 된다. (쓰레기)
            arr1 = new int[5];

            


    }    
}