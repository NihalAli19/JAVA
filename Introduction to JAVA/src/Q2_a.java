import java.util.Scanner;
public class Q2_a {
    public static void main(String [] args)
    {
        int num1, num2, num3;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3)
        {
            System.out.println("The greatest number is: " + num1);
        }
        else if (num2 > num1 && num2 > num3)
        {
            System.out.println("The greatest number is: " +num2);
        }
        else
        {
            System.out.println("The greatest number is: " +num3);
        }
    }
}
