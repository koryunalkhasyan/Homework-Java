package Src.Loops;

public class Array180126_1 {
    public static void main(String[] args) {
    int[] arr = {1, 8, 5, 10};
    int max = arr[0];
    int secondMax = max;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
            secondMax = max;
            max = arr[i];
        }
        else if (arr[i] < max && arr[i] > secondMax) {
            secondMax = arr[i];
        }
    }
        System.out.println(secondMax);

}
}
