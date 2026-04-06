package Src.Loops;

public class Array180126_4 {
    public static void main (String[] args) {
        int[] arr = {5, 6, 8, 9, 7, 2};

        int result = 0;
        for (int i = 0; i < arr.length; i++){
            result = result * 10 + arr[i];
      }
        System.out.println(result);
    }
}
