package QA_Automation.Src.Homework_040326;

public class ProductMain {

        public static void main(String[] args) {

            Product.setDiscountRate(10);

            Product p1 = new Product(1, "Laptop", 500000, 5);
            Product p2 = new Product(2, "Phone", 300000, 10, 5);

            p1.printInfo();
            p2.printInfo();
        }
    }

