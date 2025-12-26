public class Homework3 {
    public static void main(String[] args) {
        int personAge = 55;
        if(personAge >= 18 && personAge <= 65){
            System.out.println("N1 Task: Allowed");
        }else {
            System.out.println("N1 Task: Not Allowed");
        }

        boolean hasTicket = true;
        boolean hasInivation = true;

        if(hasTicket == true || hasInivation == true){
            System.out.println("N2 Task: Can pass");
        }
        else
        {
            System.out.println("N2 Task: Can't pass");
        }

        int a = 5;
        int b = -8;
        int c  = 6;

        if (a > 0 || b > 0 && c > 0) {
            System.out.println ("N3 Task: At least two integers positve");
        }else {
            System.out.println("N3 Task: There is more than one negative number");
        }

        int value1 = 56;
        int value2 = 84;
        int value3 = value1 | value2;
        System.out.println("N4 Task: " + value3);

        int num1 = 87;
        int num2 = 845;
        if (num1 > num2){
            System.out.println("N5 Task: " + num1);
        }
        else if(num1 == num2){
            System.out.println("N5 Task: Equal");
        }
        else {
            System.out.println("N5 Task: " + num2);
        }

        int StudentGrade = 2;

        if (StudentGrade >= 90 && StudentGrade <= 100){
            System.out.println("N6 Task: Excellent");
        } else if  (StudentGrade >= 70 && StudentGrade <= 89){
            System.out.println("N6 Task: Good");
        }else if (StudentGrade >= 50 && StudentGrade <= 69){
            System.out.println("N6 Task: Average");
        }else if (StudentGrade >= 0 && StudentGrade <= 49){
            System.out.println("N6 Task: Fail");
        }

    }
}