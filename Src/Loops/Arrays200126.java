package Loops;

public class Arrays200126 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            int number1 = array1[i];

            boolean isPrime = true;
            if (number1 < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= number1; j++) {
                    if (number1 % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }
        }
        int[] array2 = new int[count];
        int index = 0;


        for (int i = 0; i < array1.length; i++) {
            int number2 = array1[i];
            boolean isPrime = true;

            if (number2 < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= number2; j++) {
                    if (number2 % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                array2[index] = number2;
                index++;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}

