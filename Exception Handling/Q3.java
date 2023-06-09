import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        String num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        num1 = sc.nextLine();
        System.out.println("Enter second number:");
        num2 = sc.nextLine();

        try {
            if (num1 == null || num1.isEmpty()) {
                throw new IllegalArgumentException("The number 1 is null or empty.");
            }
            if (num2 == null || num2.isEmpty()) {
                throw new IllegalArgumentException("The number 2 is null or empty.");
            }

            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            if (number1 == 0 || number2 == 0) {
                throw new ArithmeticException("The number cannot be divided by 0");
            }

            double divide = (double) number1 / number2;
            System.out.println("Division: "+divide);
        }
        catch(ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
