package homework090626.task1;

import java.util.Objects;

public class Appliance {
    public String type;
    public String brand;
    public double price;

    public Appliance(String type, String brand, double price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance that = (Appliance) o;
        return Double.compare(that.price, price) == 0 &&
                type.equals(that.type) &&
                brand.equals(that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, price);
    }
}
