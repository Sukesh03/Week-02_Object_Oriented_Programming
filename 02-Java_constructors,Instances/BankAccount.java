public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("SB1001", "Ayan", 15000.0);
        acc1.displayAccountInfo();

        SavingsAccount sa = new SavingsAccount("SB2002", "Rahul", 20000.0, 4.5);
        sa.displaySavingsInfo();
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsInfo() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (via getter): " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }
}
