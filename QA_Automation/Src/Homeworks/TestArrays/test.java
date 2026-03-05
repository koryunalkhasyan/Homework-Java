package Src.Homeworks.TestArrays;

public class test {
//    public static void main(String[] args) {
//        int [] number = {5, 6, 8, 4, 9,};
//        int[] reversed = new int[number.length];
//
//    for (int i = 0; i < number.length; i++){
//        reversed[i] = number[number.length - 1 - i];
//    }
//    for (int i = 0; i < reversed.length; i++) {
////        System.out.println(reversed[i]);
//    }
//        System.out.println(reversed[i]);
//
//}
//}
//public static main{
    public static void main(String[] args){
        int[] number = {3, 5, 8, 9, 7, 4, 1};
        int[] reversed = new int[number.length];
        for(int i = 0; i < number.length; i++){
            reversed[i] = number[number.length - 1 - i];
        }
        for(int i = 0; i < reversed.length - 1; i++){
//            System.out.println(reversed[i]);
            System.out.println(reversed[2]);
        }
    }
}