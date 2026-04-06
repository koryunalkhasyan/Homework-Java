package QA_Automation.Src.Homework_040326;

public class OrderMain {

        public static void main(String[] args) {

            Order order1 = new Order("Arman", 5000);
            Order order2 = new Order("Ani", 7000, 45);
            Order order3 = new Order("Karen", 3000);

            System.out.println("Order1 total price: " + order1.calculateTotalPrice());
            System.out.println("Order2 total price: " + order2.calculateTotalPrice());
            System.out.println("Order3 total price: " + order3.calculateTotalPrice());

            System.out.println("Total Orders: " + Order.getTotalOrders());

            Order.setDeliveryFee(1500);

            System.out.println("Order1 new total price: " + order1.calculateTotalPrice());
        }
    }

