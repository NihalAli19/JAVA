import java.util.Scanner;
public class Q3_a {
    public static void main(String[] args)
    {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        x = sc.nextInt();
        System.out.print("Enter number 2: ");
        y = sc.nextInt();
        x = x + y ;
        y = x - y;
        x = x - y ;
        System.out.println("X = " + x + " and Y = "+ y);
    }
}