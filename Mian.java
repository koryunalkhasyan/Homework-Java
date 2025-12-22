public class mian {
    {
        public static void main (String[]args){
        int a = 9;
        int b = 8;
        int c = 6;
        double d = ((a + b + c) / 3.0);
        double abc = ((a * 100) + (b * 10) + c);

        System.out.println(abc);
        System.out.println("Average of the abc " + d); //abc - ի միջին թվաբանականը

        int f = (int) d;
        System.out.println("Double part of the average is " + d); //Ճշրիտ մաթեմաթիկական արդյունքի առանձնացում
        System.out.println("Integer part of the average is " + f); //տասնորդական մասի առանձնացում
        System.out.println("Decimal part of the average is " + (d - f));  //կոտորակային մասի առանձնացում

        char ch = '4';
        int number = Character.getNumericValue(ch);

        System.out.println("This is integer from char " + number);

        System.out.println("Cube of the (a + b) " + ((a + b) * (a + b) * (a + b)));

    }
    }
}
