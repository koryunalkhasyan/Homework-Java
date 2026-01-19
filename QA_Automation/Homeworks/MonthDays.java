package Homeworks;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
    Scanner days = new Scanner(System.in);
    System.out.println("Pleas enter month number");
    int number = days.nextInt();
    if (number > 12){
        System.out.println("You can't enter number more than 12 ");
        System.exit(1);
    }

    switch (number){
        case 1 -> System.out.println("January " + 31);
        case 2 -> System.out.println("February " + 28);
        case 3 -> System.out.println("March " + 31);
        case 4 -> System.out.println("April " + 30);
        case 5 -> System.out.println("May " + 31);
        case 6 -> System.out.println("June " + 30);
        case 7 -> System.out.println("July " + 31);
        case 8 -> System.out.println("August " + 31);
        case 9 -> System.out.println("September " + 31);
        case 10 -> System.out.println("October " + 30);
        case 11 -> System.out.println("November " + 31);
        case 12 -> System.out.println("December " + 30);

    }



}
}
