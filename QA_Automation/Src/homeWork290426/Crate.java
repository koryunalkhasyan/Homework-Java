package homeWork290426;

// Generic Crate class
public class Crate<T> {

    private T item; // այն ինչ դնում ենք արկղի մեջ

    // pack մեթոդ - դնում ենք item-ը արկղի մեջ
    public void pack(T item) {
        this.item = item;
        System.out.println("Packed: " + item);
    }

    // unpack մեթոդ - հանում ենք item-ը արկղից
    public T unpack() {
        System.out.println("Unpacked: " + item);
        return item;
    }
}