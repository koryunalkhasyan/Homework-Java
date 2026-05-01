package homeWork290426;

public class PillBottle <T extends Medicine>{
    private T medicine;

    public void pack(T medicine) {
        this.medicine = medicine;
        System.out.println("Packed medicine: " + medicine.getName());
    }

    public T unpack() {
        System.out.println("Unpacked medicine: " + medicine.getName());
        return medicine;
    }
}
