import java.util.Scanner;
public class Q4 {
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        a = sc.nextInt();
        System.out.println("Enter number 2: ");
        b = sc.nextInt();
        System.out.println("Enter number 3: ");
        c = sc.nextInt();
        System.out.println("Sum is: " + (a+b+c));
        System.out.println("Average is: " + ((a+b+c)/3));
        System.out.println("Product is: " + (a*b*c));
    }
}
