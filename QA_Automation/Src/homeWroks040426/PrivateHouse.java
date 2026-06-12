package homeWroks040426;

public class PrivateHouse extends ResidentialBuilding {

    private boolean gateOpen = false;

    public PrivateHouse(int rooms, double area) {
        super(rooms, area);
    }

    public void openGate() {
        gateOpen = true;
        System.out.println("Դարպասը բացվեց");
    }

    public void closeGate() {
        gateOpen = false;
        System.out.println("Դարպասը փակվեց");
    }

}
