package Loops;

public class Array180126_2 {
    public static void main (String[] args) {
        int[] arr1 = {-1, -5, -8, 8, 5, 6, -9, -10};
        int count = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] < 0){
                count++;
            }
        }
        int[] arr2 = new int[count];
        int index = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] < 0) {
                arr2[index] = arr1[i];
                index++;

            }
        }

        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
     }
}
