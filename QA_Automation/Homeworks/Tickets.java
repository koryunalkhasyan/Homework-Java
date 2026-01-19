package Homeworks;

import java.util.Scanner;

public class Tickets {
    public static void main (String [] args){
    Scanner row = new Scanner(System.in);
    int ticket1 = 12000;
    int ticket2 = 8000;
    int ticket3 = 7000;

    System.out.println("Pleas enter your enfilade");
    int enfilade = row.nextInt();
    if (enfilade == 1) {
        System.out.println(ticket1);
    }else if (enfilade == 2){
        System.out.println(ticket2);
    }else if (enfilade == 3){
        System.out.println(ticket3);
    }else if (enfilade > 3){
        System.out.println("We have 3 enfilade. ");
        System.exit(1);
    }
        System.out.println("Pleas enter your age");
    int age = row.nextInt();

    if (age > 65 && enfilade == 1){
        System.out.println("Congratulations, you received a 20 percent discount. Cost of ticket " + ticket1 + " You can pay " + (ticket1 - ticket1 * 20 / 100 )) ;
    } else if (age > 65 && enfilade == 2) {
        System.out.println("Congratulations, you received a 20 percent discount. Cost of ticket " + ticket2 + " You can pay " + (ticket2 - ticket2 * 20 / 100 )) ;
    }else if (age > 65 && enfilade == 3){
        System.out.println("Congratulations, you received a 20 percent discount. Cost of ticket " + ticket3 + " You can pay " + (ticket3 - ticket3 * 20 / 100 )) ;
    }else if (age < 65 && enfilade == 1){
        System.out.println("Sorry you don't received discount your payment is " + ticket1) ;
    } else if (age < 65 && enfilade == 2) {
        System.out.println("Sorry you don't received discount " + ticket2) ;
    }else if (age < 65 && enfilade == 3){
        System.out.println("Sorry you don't received discount " + ticket3) ;
    }

}
}
