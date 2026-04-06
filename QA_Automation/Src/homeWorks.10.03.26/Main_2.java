package QA_Automation.Src.HomeWork_100326;

public class Main_2 {
    public static void main (String[] args){
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Molly");
        dog.makeSound();
        cat.makeSound();
    }
}
class Animal {
    String name;
    public Animal (String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println(name + " ");
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " is Haf Haf");
    }
}
class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name + " is Meow Meow");
    }
}