import java.util.Scanner;
public class Q2_b {
    public static void main(String [] args)
    {
        int V, I, R;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Current: ");
        I = sc.nextInt();
        System.out.print("Enter the Resistance: ");
        R = sc.nextInt();
        V = I*R;
        System.out.print("The Voltage is: " + V);
    }
}
