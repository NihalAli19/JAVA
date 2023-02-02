import java.util.Scanner;
public class Q5_a {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("The number is EVEN.");
        }
        else
        {
            System.out.println("The number is ODD.");
        }
    }
}
