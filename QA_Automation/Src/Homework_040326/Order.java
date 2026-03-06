package QA_Automation.Src.Homework_040326;

    public class Order {

        private int id;
        private String customerName;
        private double orderValue;
        private int deliveryTime;

        private static int totalOrders = 0;
        private static double deliveryFee = 1000;

        public Order(String customerName, double orderValue) {
            totalOrders++;
            this.id = totalOrders;
            this.customerName = customerName;
            this.orderValue = orderValue;
            this.deliveryTime = 30;
        }

        public Order(String customerName, double orderValue, int deliveryTime) {
            totalOrders++;
            this.id = totalOrders;
            this.customerName = customerName;
            this.orderValue = orderValue;
            this.deliveryTime = deliveryTime;
        }

        public double calculateTotalPrice() {
            return orderValue + deliveryFee;
        }

        public int getId() {
            return id;
        }

        public String getCustomerName() {
            return customerName;
        }

        public double getOrderValue() {
            return orderValue;
        }

        public int getDeliveryTime() {
            return deliveryTime;
        }

        public static int getTotalOrders() {
            return totalOrders;
        }

        public static double getDeliveryFee() {
            return deliveryFee;
        }

        public static void setDeliveryFee(double fee) {
            deliveryFee = fee;
        }
    }

