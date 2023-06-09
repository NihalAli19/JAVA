import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        int evenSum = 0, oddSum = 0, factors = 0;

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(i, sc.nextInt());
            if (i % 2 == 0) {
                evenSum += list.get(i);
            } else {
                oddSum += list.get(i);
            }
        }

            for (int i = 0; i < list.size(); i++) {
                for (int j = 1; j <= list.get(i); j++) {
                    if (list.get(i) % j == 0) {
                        factors++;
                    }
                }

                if (factors == 2) {
                    System.out.println("The list has prime numbers.");
                    System.out.println("The sum of numbers at even indices is: " + evenSum);
                    System.exit(0);
                }
            }
                System.out.println("The list doesn't have prime numbers.");
                System.out.println("The sum of numbers at odd indices is: " + oddSum);
        }
    }
