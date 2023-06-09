import java.util.Scanner;
public class Q1 {
    public static void main(String [] args)
    {
        int x, y,z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        y = sc.nextInt();
        System.out.println("Enter the value of z: ");
        z = sc.nextInt();

        System.out.println("First Expression is " +(3*x));
        System.out.println("Second Expression is " +(3*x + y));
        System.out.println("Third Expression is " +((x+y)/7));
        System.out.println("Fourth Expression is " +((3*x)+y)/(z+2));
    }
}