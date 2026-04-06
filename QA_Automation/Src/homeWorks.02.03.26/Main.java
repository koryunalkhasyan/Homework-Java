package Src.Homework_020326;

public class Main {

        public static void main(String[] args) {

            House house1 = new House(4, true, 2, 1, 120.5, "Yerevan");

            House house2 = new House(house1);

            house2.setRooms(6);
            house2.setLivingArea(180.0);

            System.out.println("House1 rooms: " + house1.getRooms());
            System.out.println("House2 rooms: " + house2.getRooms());

            System.out.println("House1 area: " + house1.getLivingArea());
            System.out.println("House2 area: " + house2.getLivingArea());

            System.out.println("House1 address: " + house1.getAddress());
            System.out.println("House2 address: " + house2.getAddress());
        }
    }