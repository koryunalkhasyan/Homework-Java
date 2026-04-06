package Src.Homework_020326;

public class House {

    private int rooms;
    private boolean hasEntrance;
    private int bathrooms;
    private int balconies;
    private double livingArea;
    private String address;

    public House(int r, boolean entrance, int bath, int balc, double area, String addr) {
        rooms = r;
        hasEntrance = entrance;
        bathrooms = bath;
        balconies = balc;
        livingArea = area;
        address = addr;
    }

    public House(House otherHouse) {
        rooms = otherHouse.rooms;
        hasEntrance = otherHouse.hasEntrance;
        bathrooms = otherHouse.bathrooms;
        balconies = otherHouse.balconies;
        livingArea = otherHouse.livingArea;
        address = otherHouse.address;
    }


    public int getRooms() {
        return rooms;
    }

    public boolean hasEntrance() {
        return hasEntrance;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getBalconies() {
        return balconies;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public String getAddress() {
        return address;
    }


    public void setRooms(int r) {
        rooms = r;
    }

    public void setBathrooms(int b) {
        bathrooms = b;
    }

    public void setBalconies(int b) {
        balconies = b;
    }

    public void setLivingArea(double a) {
        livingArea = a;
    }

}

