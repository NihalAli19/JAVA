abstract class Bank {
    abstract public double getBalance();
}
class BankA extends Bank {
    double balance = 256000.50, deposit = 100;
    @Override
    public double getBalance() {
        balance += deposit;
        return balance;
    }
}
class BankB extends Bank {
    double balance = 256000.50, deposit = 150;
    @Override
    public double getBalance() {
        balance += deposit;
        return balance;
    }
}
class BankC extends Bank {
    double balance = 256000.50, deposit = 200;
    @Override
    public double getBalance() {
        balance += deposit;
        return balance;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Bank b1 = new BankA();
        Bank b2 = new BankB();
        Bank b3 = new BankC();

        System.out.println("Balance in Bank A: "+b1.getBalance());
        System.out.println("Balance in Bank B: "+b2.getBalance());
        System.out.println("Balance in Bank C: "+b3.getBalance());
    }
}
