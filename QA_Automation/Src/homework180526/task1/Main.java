package homework180526.task1;

public class Main {
    public static void main(String[] args){
        House[] houses = {new House("Goris", 125), new House("Syuniq 134", 135)};
        System.out.println("Max House: " + GenericUtils.findMax(houses));
    }
}
