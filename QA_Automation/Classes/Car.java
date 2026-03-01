package Classes;

public class Car {
    static int wheelNumber;
    static int steeringNumber;
    int horsePower;
    String color;
    String engine;
    String model;
    int price;

    int calculateMaxSpeed(){
        return horsePower * 2;
    }

    static int getWheelNumber() {
        return wheelNumber;
    }
    static int getSteeringNumber(){
        return steeringNumber;
    }
}

