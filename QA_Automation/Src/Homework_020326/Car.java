package Src.Homework_020326;

public class Car {
    private String brand;

    private int maxEngineOilKm;
    private int maxGearboxOilKm;

    private int currentEngineOilKm;
    private int currentGearboxOilKm;

    public Car(String b, int maxEngineKm, int maxGearboxKm) {

        brand = b;
        maxEngineOilKm = maxEngineKm;
        maxGearboxOilKm = maxGearboxKm;

        currentEngineOilKm = 0;
        currentGearboxOilKm = 0;
    }

    public void drive(int km) {

        if (!canDrive()) {
            System.out.println("Car cannot drive! Oil change needed.");
            return;
        }

        currentEngineOilKm += km;
        currentGearboxOilKm += km;

        System.out.println(brand + " drove " + km + " km");
    }

    public void changeEngineOil() {
        currentEngineOilKm = 0;
        System.out.println("Engine oil changed");
    }

    public void changeGearboxOil() {
        currentGearboxOilKm = 0;
        System.out.println("Gearbox oil changed");
    }

    public boolean canDrive() {

        if (currentEngineOilKm > maxEngineOilKm) {
            return false;
        }

        if (currentGearboxOilKm > maxGearboxOilKm) {
            return false;
        }

        return true;
    }

    public void printStatus() {
        System.out.println("Engine: " + currentEngineOilKm + "/" + maxEngineOilKm);
        System.out.println("Gearbox: " + currentGearboxOilKm + "/" + maxGearboxOilKm);
        System.out.println("Can drive: " + canDrive());
        System.out.println("----------");
    }
}
