package homework180526.task2;

public class Product {
    private String name;
    private double price;

    Product (String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public boolean equals(Object o ){
            if(this == o) return true;
            if(!(o instanceof Product)) return false;
            Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && name.equals(product.name);
    }
}
