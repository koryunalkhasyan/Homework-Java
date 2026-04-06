package Src.Loops;

public class Array180126_3 {
    public static void main (String[] args){
        int[] arr = {1, 2, 8, 6, 8, 98, -75, -45, -21, 23};
        int index = -1;
        int value = 0;
        for (int i = arr.length -1; i >= 0; i--){
            if (arr[i] < 0){
                index = i;
                value = arr[i];
                break;
            }
        }
        if (index != -1){
            System.out.println("Last negative value is " + value);
            System.out.println("Index of negative value " + index);
        }else {
            System.out.println("There is no negative value");
    }
}
}

