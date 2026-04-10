package homeWroks040426;

public class Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment(3, 80.5, 2);
        PrivateHouse house = new PrivateHouse(4, 120.0);

        apartment.turnOnLights();
        house.turnOnLights();

        apartment.setCeilingHeight(2.8);
        apartment.setCeilingHeight(3.0); // չի փոխվի

        house.setHasBalcony(true);
        house.setHasBalcony(false); // չի փոխվի

        house.openGate();

        // Rooms test
        apartment.increaseRoom(); // OK (4)
        apartment.increaseRoom(); // Չի կարելի

        apartment.decreaseRoom(); // OK (3)
        apartment.decreaseRoom(); // OK (2)
        apartment.decreaseRoom(); // Չի կարելի

        User user = new User();
        user.turnOffAllLights(apartment, house);

        System.out.println("Apartment lights: " + apartment.isLightsOn());
        System.out.println("House lights: " + house.isLightsOn());
    }
}
