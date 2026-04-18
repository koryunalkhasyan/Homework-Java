package homeWorks150426;

public class Shipping {
        public static void main(String[] args) {

            Order order1 = new Order(new GroundShipping());
            order1.finalizeOrder(10, 15); // weight doesn't matter here

            Order order2 = new Order(new AirShipping());
            order2.finalizeOrder(3, 10);

            Order order3 = new Order(new DroneShipping());
            order3.finalizeOrder(4, 2); // OK

            // order3.finalizeOrder(6, 2); // ❌ error (weight > 5)
        }
    }


    interface ShippingCalculator {
        double calculateCost(double weight, double distance);
    }

    // GroundShipping
    class GroundShipping implements ShippingCalculator {
        @Override
        public double calculateCost(double weight, double distance) {
            return 200 * distance + 1000;
        }
    }

    // AirShipping
    class AirShipping implements ShippingCalculator {
        @Override
        public double calculateCost(double weight, double distance) {
            return 1000 * distance + 5000;
        }
    }

    // DroneShipping
    class DroneShipping implements ShippingCalculator {
        @Override
        public double calculateCost(double weight, double distance) {
            if (weight > 5) {
                throw new IllegalArgumentException("DroneShipping: Max weight is 5kg");
            }
            return 3000;
        }
    }

    // Order
    class Order {
        private ShippingCalculator shippingCalculator;

        public Order(ShippingCalculator shippingCalculator) {
            this.shippingCalculator = shippingCalculator;
        }

        public void finalizeOrder(double weight, double distance) {
            double cost = shippingCalculator.calculateCost(weight, distance);
            System.out.println("Shipping cost: " + cost + " AMD");
        }
    }


