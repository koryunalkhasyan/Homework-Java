package Src.Homeworks;

public class Homework2 {
    public static void main(String[] args){
        int[] arr = {1, 5, 1, 1, 5};
        int sum = 0;
                for (int i = 0; i < arr.length; i++){

                }
        int leftSum = 0;
                int index = -1;
                for (int i = 0; i < arr.length; i++ ){
                    int rightSum = sum - leftSum - arr[i];

                if (leftSum == rightSum)    {
                    index = i;
                }
                leftSum += arr[i];
                }
        System.out.println(index);


    }
}
