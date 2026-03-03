package Src.Homework_020326;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 3000, 5000);

        car.drive(300);
        car.drive(450);
        car.printStatus();

        if (!car.canDrive()) {
            System.out.println("Need oil change!");
        }
    }
}

