package homeWroks040426;

public class Apartment extends ResidentialBuilding {

    private final int floor;
    private static final int MAX_FLOORS = 5;

    public Apartment(int rooms, double area, int floor) {
        super(rooms, area);

        if (floor < 1 || floor > MAX_FLOORS) {
            throw new IllegalArgumentException("Սխալ հարկ");
        }

        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }
}
