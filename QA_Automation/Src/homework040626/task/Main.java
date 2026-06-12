package homework040626.task;

public class Main {
    public static void main(String[] args) {
        Depot myDepot = new Depot(100.0);

        Grocery milk = new Grocery("Milk", "Dairy", "2026-06-01", "2026-06-10", 1.0, "Ashtarak");
        Grocery chips = new Grocery("Chips", "Snacks", "2026-05-15", "2026-12-15", 4.0, "Lays");

        System.out.println("--- Work start of warehouse ---");
        myDepot.addGrocery(milk, 40);
        myDepot.addGrocery(chips, 10);
        myDepot.addGrocery(milk, 30);
        myDepot.removeGrocery(chips, 5);
        myDepot.addGrocery(milk, 30);
    }
}