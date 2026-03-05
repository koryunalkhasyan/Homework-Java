package Homeworks;

import java.util.Scanner;

public class TransportSystem {
    public static void main (String[] args){
        Scanner trans_system = new Scanner(System.in);
        System.out.println("Please enter your age");
        int personAge = trans_system.nextInt();


        int ticketCost = 150;
        if (personAge > 65 || personAge < 18 ){
            System.out.println("You have 20% discount ticket cost is " + ticketCost + " is being discounted " + ticketCost * 20 / 100 + " You can pay " + (ticketCost -  ticketCost * 20 / 100));
            System.exit(1);
        } else if (personAge > 18 && personAge < 65 ) {
            System.out.println("Please enter the number of your children.");
        }
        int personChild = trans_system.nextInt();
        switch (personChild) {
            case 3 -> System.out.println("You have 15% discount ticket cost is " + ticketCost + " is being discounted " + ticketCost * 15 / 100 + " You can pay " + (ticketCost -  ticketCost * 15 / 100));
            case 4 -> System.out.println("You have 25% discount ticket cost is " + ticketCost + " is being discounted " + ticketCost * 25 / 100 + " You can pay " + (ticketCost -  ticketCost * 25 / 100));
            case 5 -> System.out.println("You have 35% discount ticket cost is " + ticketCost + " is being discounted " + ticketCost * 35 / 100 + " You can pay " + (ticketCost -  ticketCost * 35 / 100));
        }
        if (personChild > 5) {
            System.out.println("You have 50% discount ticket cost is " + ticketCost + " is being discounted " + ticketCost * 50 / 100 + " You can pay " + (ticketCost -  ticketCost * 50 / 100));
        }else if (personChild < 3){
            System.out.println("You don't have discount");
        }

    }
}

