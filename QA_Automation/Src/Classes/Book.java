package Src.Classes;

public class Book {
    String title;
    String author;
    int yearPublished;

    public Book (String t, String a, int y){
        title = t;
        author = a;
        yearPublished = y;
    }
    public void displayInfo(){
        System.out.println("Title: " + title + "Author: " + author + " Year: " + yearPublished);

    }
}
