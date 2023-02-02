import java.util.Scanner;
public class Q1 {
    public static void main(String[] args)
    {
        int n;
        float price, tax, discount, sub_total = 0, before_tax, gtotal;
        char ch;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter items(first item's name and the price):");
            for (int i = 0; i < 5; i++) {
                price = sc.nextFloat();
                sub_total = sub_total + price;
            }
            System.out.println("Discount percentage?: ");
            n = sc.nextInt();

            discount = (sub_total / 100) * n;
            before_tax = sub_total - discount;
            tax = (before_tax / 100) * 5;
            gtotal = before_tax + tax;

            System.out.println("-----------------------------------------");
            System.out.println("                   INVOICE                 ");
            System.out.println("-----------------------------------------");
            System.out.println("Subtotal:        \t" + sub_total);
            System.out.println("Discount percent:\t" + n);
            System.out.println("Discount Amount: \t" + discount);
            System.out.println("Total before tax:\t" + before_tax);
            System.out.println("Sales tax:       \t5");
            System.out.println("Invoice total:   \t" + gtotal);
            System.out.println("Continue(y/n)?");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');
    }
}
