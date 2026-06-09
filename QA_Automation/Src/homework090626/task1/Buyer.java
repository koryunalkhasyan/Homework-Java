package homework090626.task1;

import java.util.Objects;

public class Buyer {
    public String fullName;
    public String purchaseDate;
    public String address;

    public Buyer(String fullName, String purchaseDate, String address) {
        this.fullName = fullName;
        this.purchaseDate = purchaseDate;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("  - Գնորդ: " + fullName + " | Ամսաթիվ: " + purchaseDate + " | Հասցե: " + address);
    }
}