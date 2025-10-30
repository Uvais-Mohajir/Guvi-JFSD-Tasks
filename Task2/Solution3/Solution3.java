package Task2.Solution3;

public class Solution3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println();
        account.displayBalance();
        account.withdraw(200);
        account.deposit(2000);
        account.displayBalance();

        BankAccount account1 = new BankAccount("S46987", 2000);
        account1.displayBalance();
        account1.withdraw(200);
        account1.displayBalance();
        account1.deposit(2000);
        account1.displayBalance();
    }
}