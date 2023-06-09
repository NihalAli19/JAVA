import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        String str;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any sentence:");
        str = sc.nextLine();

        String[] words = str.split(" ");

        try {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("The sentence is null or empty.");
            }

            if (words.length < 2) {
                throw new Exception("The sentence should have more than 2 words.");
            }
        }
        catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
