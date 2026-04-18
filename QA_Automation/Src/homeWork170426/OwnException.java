package homeWork170426;

public class OwnException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Shortage: " + e.getShortage());
        }
    }
}
class InsufficientFundsException extends Exception {
    private double shortage;
    public InsufficientFundsException(double shortage) {
        super("Insufficient funds! Missing amount: " + shortage);
        this.shortage = shortage;
    }
    public double getShortage() {
        return shortage;
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double shortage = amount - balance;
            throw new InsufficientFundsException(shortage);
        }
        balance -= amount;
        System.out.println("Withdraw successful. Remaining balance: " + balance);
    }
}