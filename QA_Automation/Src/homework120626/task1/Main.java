package homework120626.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(101, "David", "david@mail.com");
        Customer c2 = new Customer(102, "Anna", "anna@mail.com");
        Customer c3 = new Customer(103, "Armen", "armen@mail.com");

        ArrayList<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(1, "Phone", c1));
        allOrders.add(new Order(2, "Laptop", c2));
        allOrders.add(new Order(3, "Book", c1));
        allOrders.add(new Order(4, "Shoes", c3));
        allOrders.add(new Order(5, "T-Shirt", c2));
        allOrders.add(new Order(6, "Watch", c2));

        HashMap<Customer, Integer> orderCounts = new HashMap<>();

        for (Order o : allOrders) {
            Customer currentCustomer = o.customer;
            orderCounts.put(currentCustomer, orderCounts.getOrDefault(currentCustomer, 0) + 1);
        }

        System.out.println("=== ՄԱՍ 1. Պատվերների քանակն ըստ Հաճախորդ օբյեկտի (HashMap) ===");
        for (Map.Entry<Customer, Integer> entry : orderCounts.entrySet()) {
            System.out.println("Հաճախորդ: " + entry.getKey().name + " (ID: " + entry.getKey().id + ") -> Պատվերներ: " + entry.getValue());
        }
        TreeMap<String, Integer> sortedOrderCounts = new TreeMap<>();
        for (Map.Entry<Customer, Integer> entry : orderCounts.entrySet()) {
            sortedOrderCounts.put(entry.getKey().name, entry.getValue());
        }

        System.out.println("\n=== ՄԱՍ 2. Սորտավորված ըստ հաճախորդի անունի (TreeMap) ===");
        for (Map.Entry<String, Integer> entry : sortedOrderCounts.entrySet()) {
            System.out.println("Անուն: " + entry.getKey() + " -> Պատվերներ: " + entry.getValue());
        }
    }
}
