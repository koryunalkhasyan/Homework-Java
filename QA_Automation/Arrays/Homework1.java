package Arrays;

public class Homework1 {
    public static void main(String[] args){
        int[] arr = {0, 2, 2, 1, 5, 6};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                sum += arr[i];
            }
        }
        if (sum > 100) {
            System.exit(1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        System.out.println("\nSum of elements not equal to their index: " + sum);


    }
}
