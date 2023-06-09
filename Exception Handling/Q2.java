import java.util.IllegalFormatException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("*Calculating Factorial*\nEnter the number:");
        str = sc.nextLine();

        try {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("The string is null or empty");
            }

            int number = Integer.parseInt(str);

            if (number < 0) {
                throw new IllegalArgumentException("The string contains negative number.");
            }

            int factorial = factorial(number);
            System.out.println("Factorial of " +number+ ": " +factorial);
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid integer (non-numeric value)");
        }
        catch(NullPointerException e) {
            System.out.println("String is null or empty");
        }
        catch(ArithmeticException e) {
            System.out.println("Number is too large to calculate factorial. Integer overflow.");
        }
        catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        else {
            return num * factorial(num - 1);
        }
    }
}
