package Function;

public class Function100226 {
        public static void main(String[] args) {
            printSalaryAndTax(120000);
            printSalaryAndTax(300000);
            printSalaryAndTax(700000);
        }

        static int calculateIncomeTax(int salary) {
            int tax = 0;

            if (salary <= 150000) {
                tax = calculateTax(salary);
            }
            else if (salary <= 500000) {
                tax = calculateTax(150000);
                tax += calculateTax(salary - 150000, 20);
            }
            else {
                tax = calculateTax(150000);
                tax += calculateTax(350000, 20);
                tax += calculateTaxAbove500(salary - 500000);
            }

            return tax;
        }

        static int calculateTax(int amount) {
            return amount * 15 / 100;
        }

        static int calculateTax(int amount, int percent) {
            return amount * percent / 100;
        }

        static int calculateTaxAbove500(int amount) {
            return (amount / 1000) * 300;
        }

        static void printSalaryAndTax(int salary) {
            int tax = calculateIncomeTax(salary);
            System.out.println("Աշխատավարձ = " + salary +
                    ", Եկամտահարկ = " + tax);
        }
    }



