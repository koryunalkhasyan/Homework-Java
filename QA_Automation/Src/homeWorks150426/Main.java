package homeWorks150426;

public class Main {
    public static void main(String[] args) {

        Switchable bulb = new LightBulb();
        Switchable fan = new Fan();
        Switchable tv = new Television();

        RemoteControl remote1 = new RemoteControl(bulb);
        remote1.turnOnDevice();
        remote1.turnOffDevice();

        System.out.println("-----");

        RemoteControl remote2 = new RemoteControl(fan);
        remote2.turnOnDevice();

        System.out.println("-----");

        RemoteControl remote3 = new RemoteControl(tv);
        remote3.turnOnDevice();
    }
}
interface Switchable {
    void turnOn();
    void turnOff();
}

// LightBulb
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}

// Fan
class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

// Television
class Television implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Television is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is OFF");
    }
}

// RemoteControl
class RemoteControl {
    private Switchable device;

    public RemoteControl(Switchable device) {
        this.device = device;
    }

    public void turnOnDevice() {
        device.turnOn();
    }

    public void turnOffDevice() {
        device.turnOff();
    }
}
