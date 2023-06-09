import java.util.Scanner;
class Accounts {
    private double balance;
    double withdraw, deposit;

    Scanner sc = new Scanner(System.in);

    public Accounts(double balance, double withdraw, double deposit) {
        this.balance = balance;
        this.withdraw = withdraw;
        this.deposit = deposit;
    }

    public void debit() {
        balance -= withdraw;
    }
    public void credit() {
        balance += deposit;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void getCurrentBalance() {
        System.out.println("Current balance: "+getBalance());
    }

}
class SavingAccount extends Accounts {
    int timeSpan = 10;
    double interest;
    float interestRate = 0.045F;

    public SavingAccount(double balance, double withdraw, double deposit) {
        super(balance, withdraw, deposit);
    }

    public void calculateInterest() {
        interest = (getBalance()) * interestRate * timeSpan;
    }
    @Override
    public void credit() {
        setBalance(getBalance() + interest);
    }

    public void getUpdatedBalance() {
        System.out.println("Updated account balance: "+getBalance());
    }
}
//class CheckingAccount extends Accounts {

//}
public class Q4 {
    public static void main(String[] args) {

        double withdraw = 0.0, deposit = 0.0;
        char choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to withdraw? (y/n)?");
        choice = sc.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Amount to withdraw: ");
            withdraw = sc.nextDouble();
        }
        else if (choice == 'N' || choice == 'n') {
           withdraw = 0.0;
        }
        System.out.println("Do you want to deposit? (y/n)?");
        choice = sc.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Amount to deposit: ");
            deposit = sc.nextDouble();
        }
        else if (choice == 'N' || choice == 'n') {
            deposit = 0.0;
        }

        Accounts acc1 = new Accounts(5000000.5650,withdraw,deposit);
        acc1.setBalance(500000.5650);
        acc1.debit();
        acc1.credit();
        acc1.getCurrentBalance();

        SavingAccount account = new SavingAccount(acc1.getBalance(), withdraw,deposit);
        account.calculateInterest();
        account.credit();
        account.getUpdatedBalance();
    }
}
