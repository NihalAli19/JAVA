import java.util.Scanner;

class AveragePurchase {
    int n;

    Scanner sc = new Scanner(System.in);

    void todayPurchases(int n) {
        this.n = n;

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the orders: ");
            arr[i] = sc.nextLine();
        }
        display(arr);
    }
        void display (String[]arr) {
            System.out.println("The orders are: ");
            for (int i = 0; i < n; i++) {
                System.out.println("" + arr[i]);
            }
        }
}
public class Q1 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of orders made today: ");
        n = sc.nextInt();

        AveragePurchase o1 = new AveragePurchase();
        o1.todayPurchases(n);
    }
}