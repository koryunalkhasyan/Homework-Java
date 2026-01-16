package Arrays;

public class Homework3 {
    public static void main(){
        int[] arr = {-1, 2, -3, 4, 5, 6};
        int neg = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                neg += arr[i];
            }else  {
                System.out.println("Positive");
            }
        }
    }
}
