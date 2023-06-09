import java.util.Scanner;
public class Calculation {
    public static void main(String [] args)
    {
        System.out.println("Hello World BBB");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        System.out.print("Enter your name: ");
        int b = sc.nextInt();
        System.out.println("Additon is: "+(a+b));
        System.out.println("Subtraction is: "+(b-a));
        System.out.println("Multiplication is: "+(a*b));
        System.out.println("Division is: "+(a/b));
    }
}
