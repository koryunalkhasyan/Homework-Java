package QA_Automation.Src.Homework_040326;

public class Product {

        private int id;
        private String name;
        private int quantity;
        private double price;
        private double extraDiscount;

        private static double discountRate = 0;

        public Product(int id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.extraDiscount = 0;
        }

        public Product(int id, String name, double price, int quantity, double extraDiscount) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.extraDiscount = extraDiscount;
        }

        public static void setDiscountRate(double rate) {
            discountRate = rate;
        }

        public double getFinalPrice() {
            double priceAfterStoreDiscount = price - (price * discountRate / 100);
            double finalPrice = priceAfterStoreDiscount - (priceAfterStoreDiscount * extraDiscount / 100);
            return finalPrice;
        }

        public void printInfo() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Quantity: " + quantity);
            System.out.println("Final Price: " + getFinalPrice());
            System.out.println("----------------------");
        }
    }

