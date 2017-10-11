package prepare;

public class Pre01_7 {
    public static void main(String[] args){
        byte[] arr1 = new byte[3];
        
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        System.out.printf("%d, %d, %d\n", arr1[0], arr1[1], arr1[2]);

        byte[] arr2 = new byte[]{40, 50, 60};
        System.out.printf("%d, %d, %d\n", arr2[0], arr2[1], arr2[2]);

        byte[] arr3;
        arr3 = new byte[]{100, 101, 102}; // OK
        System.out.printf("%d, %d, %d\n", arr3[0], arr3[1], arr3[2]);

        byte[] arr4 = {70, 80, 90};
        System.out.printf("%d, %d, %d\n", arr4[0], arr4[1], arr4[2]);
        
        byte[] arr5;
    }   
}