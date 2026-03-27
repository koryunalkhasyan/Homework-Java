package QA_Automation.Src.HomeWork_100326;


    public class Main {
        public static void main (String[] args){
            Student student = new Student("Armen", 15, 75);
            Teacher teacher = new Teacher("Armine", 35, "English, Algebra");
            student.displayInfo();
            teacher.displayInfo();
        }
    }
    class Human {
        String name;
        int age;
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void displayInfo(){
            System.out.println("Name: " + name + "," +" Age: " + age);
        }
    }
    class Student extends Human {
        double grade;

        public Student(String name, int age, double grade){
            super(name, age);
            this.grade = grade;
        }
        @Override
        public void displayInfo (){
            System.out.println("Name: " + name + "," +" Age: " + age + "," + " Grade: " + grade);
        }
    }
    class Teacher extends Human {
        String subject;
        public Teacher(String name, int age, String subject){
            super(name, age);
            this.subject = subject;
        }
        @Override
        public void displayInfo(){
            System.out.println("Name: " + name + "," + " Age: " + age + "," + " Subject: " + subject);
        }
    }


