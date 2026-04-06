package Src.Classes;

public class RegtangleMain {
    public static void main (String[] args){
    Regtangle rect = new Regtangle();
    rect.height = 13;
    rect.width = 15;
        System.out.println("Area is " + rect.area());
        System.out.println("Perimeter is " + rect.perimeter());
    }
}
