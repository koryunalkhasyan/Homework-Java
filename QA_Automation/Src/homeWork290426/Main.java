package homeWork290426;

public class Main {
    public static void main(String[] args) {
        Crate<String> carCrate = new Crate<>();
        carCrate.pack("BMW");
        carCrate.unpack();

        Crate<String> fruitCrate = new Crate<>();
        fruitCrate.pack("Apple");
        fruitCrate.unpack();
    }
}
