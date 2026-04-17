package homeWroks040426;

abstract class ResidentialBuilding {

    private int rooms;
    private final int initialRooms;
    private final double area;

    private Double ceilingHeight = null;
    private Boolean hasBalcony = null;

    private boolean lightsOn = false;

    public ResidentialBuilding(int rooms, double area) {
        this.rooms = rooms;
        this.initialRooms = rooms;
        this.area = area;
    }

    public void increaseRoom() {
        if (rooms < initialRooms + 1) {
            rooms++;
        } else {
            System.out.println("Չի կարելի ավելացնել");
        }
    }

    public void decreaseRoom() {
        if (rooms > initialRooms - 1) {
            rooms--;
        } else {
            System.out.println("Չի կարելի պակասեցնել");
        }
    }


    public void setCeilingHeight(double height) {
        if (this.ceilingHeight == null) {
            this.ceilingHeight = height;
        } else {
            System.out.println("Առաստաղի բարձրությունը արդեն տրված է");
        }
    }

    public void setHasBalcony(boolean hasBalcony) {
        if (this.hasBalcony == null) {
            this.hasBalcony = hasBalcony;
        } else {
            System.out.println("Պատշգամբը արդեն սահմանված է");
        }
    }

    public void turnOnLights() {
        lightsOn = true;
    }

    public void turnOffLights() {
        lightsOn = false;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public int getRooms() {
        return rooms;
    }

    public double getArea() {
        return area;
    }
}
