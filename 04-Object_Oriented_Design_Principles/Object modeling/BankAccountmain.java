class BankAccount {
    static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class BankAccountmain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alan", 5000.0);
        BankAccount acc2 = new BankAccount(1002, "Ethan", 300000.0);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        acc1.deposit(1000);
        acc2.withdraw(500);

        System.out.println("\nAfter Transactions:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
