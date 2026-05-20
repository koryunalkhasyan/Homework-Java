package homework180526.task2;

public class Main {
    public static void main (String[] args){
        Product [] shop = {new Product("Apple", 100), new Product("Bread", 150)};
        Product search = new Product("Apple", 100);
        System.out.println("Contains Product? " + GenericUtils.contains(shop, search));
    }
}
