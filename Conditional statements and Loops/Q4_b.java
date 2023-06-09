import java.util.Scanner;

public class Q4_b {
    public static void main(String [] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want the table for: ");
        n = sc.nextInt();

        System.out.println("The table of "+n+" is: ");

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(" "+n+" x "+i+" = "+(n*i));
        }
    }
}
