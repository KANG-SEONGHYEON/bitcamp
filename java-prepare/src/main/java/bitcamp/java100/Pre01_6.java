package prepare;

public class Pre01_6 {
    public static void main(String[] args){
        byte[] arr1;    

        arr1 = null;

        arr1 = new byte[3];

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);
   
    arr1[3] = 40;
    }   
}