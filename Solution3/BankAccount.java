package Task2.Solution3;

public class BankAccount {
    public String accountNumber;
    public double balance;

    public BankAccount() {
        this.accountNumber = "Unknown";
    }
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if ("Unknown".equals(accountNumber)) {
            System.out.println("Cannot deposit to an unregistered account");
            return;
        }
        if (amount > 0) {
            balance += amount;
            System.out.println("\nAccount No: " + accountNumber);
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if ("Unknown".equals(accountNumber)) {
            System.out.println("Cannot withdrawn to an unregistered account");
            return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nAccount No: " + accountNumber);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("\nAccount No: " + accountNumber);
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    public void displayBalance() {
        if ("Unknown".equals(accountNumber)) {
            System.out.println("Cannot display balance for an unregistered account");
            return;
        }
        System.out.println("\nAccount No: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

}