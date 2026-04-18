package homeWork170426;

public class Main {
    public static void main(String[] args) {

        String input = "123a";

        try {
            int number = Integer.parseInt(input);
            System.out.println("It's number " + number);
        } catch (NumberFormatException e) {
            System.out.println("Wrong enter: It isn't number");
        }

    }
}