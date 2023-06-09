import java.util.Scanner;

interface BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    abstract double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance = 5600000;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class Q6 {
    public static void main(String[] args) {

        double amount;
        int choice;

        Scanner sc = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount();

        System.out.println("1. Deposit\n2. Withdraw\n3. Get total balance\n4. Exit");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Amount you want to deposit: ");
                amount = sc.nextInt();
                savingsAccount.deposit(amount);
                System.out.println("Amount deposited.");
                System.out.println("Balance: "+savingsAccount.getBalance());
                break;
            case 2:
                System.out.println("Amount you want to withdraw: ");
                amount = sc.nextInt();
                savingsAccount.withdraw(amount);
                System.out.println("Amount withdrawn.");
                System.out.println("Balance: "+savingsAccount.getBalance());
                break;
            case 3:
                System.out.println("Your account balance: " +savingsAccount.getBalance());
                break;
            default:
                System.out.println("Unknown choice");
        }
    }
}
