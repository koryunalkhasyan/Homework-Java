package Src.Homeworks;

import java.util.Scanner;

public class MonthDays2 {public static void main (String[] args){
    Scanner days = new Scanner(System.in);
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    System.out.println("Pleas enter month number");
    int number = days.nextInt();
    if (number > 12){
        System.out.println("You can't enter number more than 12 ");
        System.exit(1);
    }
    if (number == arr[0]){
        System.out.println("January " + 31);
    }else if (number == arr[1]){
        System.out.println("February " + 28);
    }else if (number == arr[2]){
        System.out.println("March " + 31);;
    }else if (number == arr[3]){
        System.out.println("April " + 30);
    }else if (number == arr[4]){
        System.out.println("May " + 31);
    }else if (number == arr[5]){
        System.out.println("June " + 30);
    }else if (number == arr[6]){
        System.out.println("July " + 31);
    }else if (number == arr[7]){
        System.out.println("August " + 31);
    }else if (number == arr[8]){
        System.out.println("September " + 31);
    }else if (number == arr[9]){
        System.out.println("October " + 30);
    }else if (number == arr[10]){
        System.out.println("November " + 30);
    }else if (number == arr[11]){
        System.out.println("December " + 31);
    }
}
}
