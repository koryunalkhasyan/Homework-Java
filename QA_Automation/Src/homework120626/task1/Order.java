package homework120626.task1;

public class Order {
    public int orderId;
    public String productName;
    public Customer customer;

    public Order(int orderId, String productName, Customer customer) {
        this.orderId = orderId;
        this.productName = productName;
        this.customer = customer;
    }
}
