import java.util.Scanner;
public class Q3_b {
    public static void main(String[] args) {
        int i, j, row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        row = sc.nextInt();
        /*System.out.println("Enter the number of columns: ");
        j = sc.nextInt();*/

        for (i = 0; i < row; i++)
        {
            for (j = 0; j < row; j++) {
                if (j >= i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}