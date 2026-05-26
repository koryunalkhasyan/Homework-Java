package homeWork290426;

public class Mainn {
    public static void main(String[] args) {

        PillBottle<Pill> bottle1 = new PillBottle<>();
        bottle1.pack(new Pill("Paracetamol"));

        PillBottle<Capsule> bottle2 = new PillBottle<>();
        bottle2.pack(new Capsule("Vitamin D"));

    }
}
