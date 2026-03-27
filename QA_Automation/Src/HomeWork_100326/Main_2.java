package QA_Automation.Src.HomeWork_100326;

public class Main_2 {
    public static void main (String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
class Animal {
    String name;

    public void makeSound(){
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Haf Haf");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Myu Myu");
    }
}