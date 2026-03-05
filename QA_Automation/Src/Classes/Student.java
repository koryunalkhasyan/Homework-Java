package Src.Classes;

public class Student {
    String name;
    int age;
    double grade;
    public Student (String n, int a, double g){
        name = n;
        age = a;
        grade = g;

    }
    public Student (String n, int a){
        name = n;
        age = a;
    }
    public void promote (){
        grade += 1;
    }
    public void display(){
        System.out.println(name + " " + age + " " + grade);
    }
}
